package com.porteriscool.caster.client.gui.book;

import com.porteriscool.caster.client.gui.GuiGuideBook;

import java.util.List;

public interface IBookPage
{
    public List<IBookEntry> getEntries();

    public String getTitle();

    public void drawPage(GuiGuideBook gui, int x, int y, int mouseX, int mouseY);

    public void mouseClicked(GuiGuideBook gui, int mouseX, int mouseY, int mouseButton);

    public List<String> getHoveringText(GuiGuideBook gui, int mouseX, int mouseY);
}
