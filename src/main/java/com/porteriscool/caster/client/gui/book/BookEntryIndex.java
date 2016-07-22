package com.porteriscool.caster.client.gui.book;

import com.porteriscool.caster.client.gui.GuiGuideBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class BookEntryIndex implements IBookEntry
{
    private ResourceLocation icon;
    private int u;
    private int v;
    private String title;
    private int destinationPage;

    private int xPos;
    private int yPos;

    public BookEntryIndex(ResourceLocation icon, int u, int v, String title, int destPage)
    {
        this.icon = icon;
        this.title = title;
        this.destinationPage = destPage;

        this.u = u;
        this.v = v;
    }

    @Override
    public void drawEntry(GuiGuideBook gui, int x, int y, int mouseX, int mouseY)
    {
        this.xPos = x;
        this.yPos = y;

        Minecraft.getMinecraft().getTextureManager().bindTexture(icon);

        GL11.glPushMatrix();
        GL11.glScalef(0.28125f, 0.28125f, 0.28125f);
        GL11.glTranslated(-90, -60, 100);

        GlStateManager.scale(2, 2, 2);

        if (!gui.isInRect(x, y, 28, 28, mouseX, mouseY))
        {
            GlStateManager.color(1f, 1f, 1f, 0.5f);
            GlStateManager.enableBlend();
        }

        gui.drawTexturedModalRect(x * 2, y * 2, u, v, 64, 64);

        GlStateManager.disableBlend();
        GlStateManager.scale(2, 2, 2);

        GL11.glPopMatrix();
    }

    @Override
    public List<String> getMouseOverTooltip()
    {
        List<String> tooltip = new ArrayList<String>();
        tooltip.add(title);
        return tooltip;
    }

    @Override
    public boolean isMouseOver(GuiGuideBook gui, int mouseX, int mouseY)
    {
        return gui.isInRect(xPos, yPos, 28, 28, mouseX, mouseY);
    }

    @Override
    public void mouseClicked(GuiGuideBook gui)
    {
        gui.changePage(this.destinationPage);
    }
}
