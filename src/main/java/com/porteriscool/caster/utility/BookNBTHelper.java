package com.porteriscool.caster.utility;

import com.porteriscool.caster.client.gui.book.*;
import com.porteriscool.caster.init.ModBlocks;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class BookNBTHelper
{
    public static final String PAGE_TAG = "Page";

    public static final String ELEMENTAL_TAG = "ElementalLevel";
    public static final String ELIXIR_TAG = "ElixirLevel";
    public static final String TOOL_TAG = "ToolLevel";

    public static final String NETHER_TIER  = "NetherTier";
    public static final String ENDER_TIER   = "EnderTier";
    public static final String BALANCE_TIER = "BalanceTier";

    private static final ResourceLocation ICON_SHEET = new ResourceLocation(Reference.MOD_ID.toLowerCase() + ":textures/gui/bookIcons.png");

    public static void initializeNBT(ItemStack stack)
    {
        NBTTagCompound tag = new NBTTagCompound();

        tag.setInteger(PAGE_TAG, 0);

        tag.setInteger(ELEMENTAL_TAG, 1);
        tag.setInteger(ELIXIR_TAG, 0);
        tag.setInteger(TOOL_TAG, 0);

        tag.setBoolean(NETHER_TIER, false);
        tag.setBoolean(ENDER_TIER, false);
        tag.setBoolean(BALANCE_TIER, false);

        ItemNBTHelper.injectNBT(stack, tag);
    }

    public static List<IBookPage> getPagesFromBook(ItemStack stack)
    {
        List<IBookPage> pages = new ArrayList<IBookPage>();

        int currentPage = ItemNBTHelper.getInt(stack, PAGE_TAG, 0);

        int elemental = ItemNBTHelper.getInt(stack, ELEMENTAL_TAG, 0);
        int elixir = ItemNBTHelper.getInt(stack, ELIXIR_TAG, 0);
        int tool = ItemNBTHelper.getInt(stack, TOOL_TAG, 0);

        boolean nether  = ItemNBTHelper.getBoolean(stack, NETHER_TIER, false);
        boolean ender   = ItemNBTHelper.getBoolean(stack, ENDER_TIER, false);
        boolean balance = ItemNBTHelper.getBoolean(stack, BALANCE_TIER, false);

        pages.add(constructIndex(elemental, elixir, tool, nether, ender, balance));

        pages.add(constructANewBeginning());

        pages.add(constructElixir(elixir));

        return pages;
    }

    public static int getBookPage(ItemStack stack)
    {
        return ItemNBTHelper.getInt(stack, PAGE_TAG, 0);
    }

    public static void savePage(ItemStack stack, int page)
    {
        ItemNBTHelper.setInt(stack, PAGE_TAG, page);
    }

    private static IBookPage constructIndex(int elemental, int elixir, int tool, boolean nether, boolean ender, boolean balance)
    {
        BookPageIndex indexPage = new BookPageIndex();

        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 0, 0, "A New Beginning", 1));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 64, 0, "Elixir", 1));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 128, 0, "Tools", 1));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 128, 64, "Armor", 2));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 0, 64, "Fire", 2));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 64, 64, "Water", 2));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 128, 128, "Food", 3));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 64, 128, "Air", 3));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 0, 128, "Leaf", 3));

        return indexPage;
    }

    private static IBookPage constructANewBeginning()
    {
        BookPageEntryList categoryPage = new BookPageEntryList("A New Beginning", 0);

        categoryPage.addEntry(new BookEntryListItem(new ItemStack(ModItems.guidebook), "Getting Started"));
        categoryPage.addEntry(new BookEntryListItem(new ItemStack(ModBlocks.workbench), "Crafting Mechanics"));

        return categoryPage;
    }

    private static IBookPage constructElixir(int elixir)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Elixir", 0);

        return categoryPage;
    }
}
