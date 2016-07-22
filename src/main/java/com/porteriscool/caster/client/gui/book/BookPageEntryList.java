package com.porteriscool.caster.client.gui.book;

import com.porteriscool.caster.client.gui.GuiGuideBook;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BookPageEntryList implements IBookPage, IPageReturnable
{
    private static final int entryStart_X = 19;
    private static final int entryStart_Y = 38;

    private String title;
    private List<IBookEntry> entries;

    private int parent;

    public BookPageEntryList(String title, int parent)
    {
        this.title = title;
        this.parent = parent;
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
        return title;
    }

    @Override
    public void drawPage(GuiGuideBook gui, int x, int y, int mouseX, int mouseY)
    {
        gui.renderText(getTitle(), (x + 74) - (gui.getStringWidth(getTitle()) / 2), y + 16, Color.BLACK.getRGB());

        for (int i = 0; i < getEntries().size(); i++)
        {
            int entryX = x + entryStart_X;
            int entryY = y + entryStart_Y + (i * 16);

            getEntries().get(i).drawEntry(gui, entryX, entryY, mouseX, mouseY);
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

    public void addEntry(BookEntryListItem entry)
    {
        entries.add(entry);
    }

    private IBookEntry getMousedOver(GuiGuideBook gui, int mouseX, int mouseY)
    {
        for(IBookEntry entry : entries)
        {
            if (entry.isMouseOver(gui, mouseX, mouseY)) return entry;
        }

        return null;
    }

    @Override
    public int getReturnIndex()
    {
        return parent;
    }
}
