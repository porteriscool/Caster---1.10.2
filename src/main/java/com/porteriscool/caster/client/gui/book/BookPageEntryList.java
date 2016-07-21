package com.porteriscool.caster.client.gui.book;

import com.porteriscool.caster.client.gui.GuiGuideBook;

import java.util.List;

public class BookPageEntryList implements IBookPage
{
    @Override
    public List<IBookEntry> getEntries()
    {
        return null;
    }

    @Override
    public String getTitle()
    {
        return null;
    }

    @Override
    public void drawPage(GuiGuideBook gui, int x, int y, int mouseX, int mouseY)
    {

    }

    @Override
    public void mouseClicked(GuiGuideBook gui, int mouseX, int mouseY, int mouseButton)
    {

    }

    @Override
    public List<String> getHoveringText(GuiGuideBook gui, int mouseX, int mouseY)
    {
        return null;
    }
}
