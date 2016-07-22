package com.porteriscool.caster.client.gui.book;

import com.porteriscool.caster.client.gui.GuiGuideBook;
import net.minecraft.client.renderer.GlStateManager;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BookPageIndex implements IBookPage
{
    private static final int entryStart_X = 24;
    private static final int entryStart_Y = 45;

    private List<IBookEntry> entries;

    public BookPageIndex()
    {
        entries = new ArrayList<IBookEntry>();
    }

    @Override
    public List<IBookEntry> getEntries()
    {
        return entries;
    }

    @Override
    public String getTitle()
    {
        return "Caster";
    }

    public void addEntry(BookEntryIndex entry)
    {
        entries.add(entry);
    }

    @Override
    public void drawPage(GuiGuideBook gui, int x, int y, int mouseX, int mouseY)
    {
        gui.renderText(getTitle(), (x + 74) - (gui.getStringWidth(getTitle()) / 2), y + 16, Color.BLACK.getRGB());

        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

        for(int i = 0; i < entries.size(); i++)
        {
            int entryX = x + entryStart_X + ((i % 3 == 0) ? 0 : (i % 3) * 32);
            int entryY = y + entryStart_Y + (32 * (i / 3));

            entries.get(i).drawEntry(gui, entryX, entryY, mouseX, mouseY);
        }
    }

    @Override
    public void mouseClicked(GuiGuideBook gui, int mouseX, int mouseY, int mouseButton)
    {
        IBookEntry entry = getMousedOver(gui, mouseX, mouseY);
        if (entry != null)
            entry.mouseClicked(gui);
    }

    @Override
    public List<String> getHoveringText(GuiGuideBook gui, int mouseX, int mouseY)
    {
        IBookEntry entry = getMousedOver(gui, mouseX, mouseY);
        return entry != null ? entry.getMouseOverTooltip() : null;
    }

    private IBookEntry getMousedOver(GuiGuideBook gui, int mouseX, int mouseY)
    {
        for(IBookEntry entry : entries)
        {
            if (entry.isMouseOver(gui, mouseX, mouseY)) return entry;
        }

        return null;

    }
}
