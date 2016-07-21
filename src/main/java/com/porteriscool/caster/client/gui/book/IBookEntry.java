package com.porteriscool.caster.client.gui.book;

import com.porteriscool.caster.client.gui.GuiGuideBook;

import java.util.List;

public interface IBookEntry
{
    public void drawEntry(GuiGuideBook gui, int x, int y, int mouseX, int mouseY);

    public void mouseClicked(GuiGuideBook gui);

    public boolean isMouseOver(GuiGuideBook gui, int mouseX, int mouseY);

    public List<String> getMouseOverTooltip();
}
