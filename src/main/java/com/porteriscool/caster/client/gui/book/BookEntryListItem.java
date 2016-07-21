package com.porteriscool.caster.client.gui.book;

import com.porteriscool.caster.client.gui.GuiGuideBook;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.awt.Color;

public class BookEntryListItem implements IBookEntry
{
    private ItemStack stack;
    private String title;
    private int xPos;
    private int yPos;

    public BookEntryListItem(ItemStack stack, String title)
    {
        this.stack = stack;
        this.title = title;
    }

    @Override
    public void drawEntry(GuiGuideBook gui, int x, int y, int mouseX, int mouseY)
    {
        xPos = x;
        yPos = y;

        gui.renderItemStackAt(stack, x - 4, y - 4);

        int xSize = gui.getStringWidth(title);

        Color color = Color.GRAY;
        if (isMouseOver(gui, mouseX, mouseY)) color = Color.BLACK;
        gui.renderText(title, x + 16, y, color.getRGB());
    }

    @Override
    public List<String> getMouseOverTooltip()
    {
        return null;
    }

    @Override
    public boolean isMouseOver(GuiGuideBook gui, int mouseX, int mouseY)
    {
        return gui.isInRect(xPos, yPos, 16 + gui.getStringWidth(this.title), 16, mouseX, mouseY);
    }

    @Override
    public void mouseClicked(GuiGuideBook gui)
    {

    }
}
