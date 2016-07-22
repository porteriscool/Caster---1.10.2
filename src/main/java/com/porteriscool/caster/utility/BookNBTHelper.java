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

    public static final String ELIXIR_TAG = "ElixirLevel";
    public static final String TOOL_TAG = "ToolLevel";
    public static final String ARMOR_TAG = "ArmorLevel";
    public static final String FIRE_TAG = "FireLevel";
    public static final String WATER_TAG = "WaterLevel";
    public static final String FOOD_TAG = "FoodLevel";
    public static final String AIR_TAG = "AirLevel";
    public static final String LEAF_TAG = "LeafLevel";

    private static final ResourceLocation ICON_SHEET = new ResourceLocation(Reference.MOD_ID.toLowerCase() + ":textures/gui/bookIcons.png");

    public static void initializeNBT(ItemStack stack)
    {
        NBTTagCompound tag = new NBTTagCompound();

        tag.setInteger(PAGE_TAG, 0);

        tag.setInteger(ARMOR_TAG, 0);
        tag.setInteger(ELIXIR_TAG, 0);
        tag.setInteger(TOOL_TAG, 0);
        tag.setInteger(FIRE_TAG, 0);
        tag.setInteger(WATER_TAG, 0);
        tag.setInteger(FOOD_TAG, 0);
        tag.setInteger(AIR_TAG, 0);
        tag.setInteger(LEAF_TAG, 0);

        ItemNBTHelper.injectNBT(stack, tag);
    }

    public static List<IBookPage> getPagesFromBook(ItemStack stack)
    {
        List<IBookPage> pages = new ArrayList<IBookPage>();

        int currentPage = ItemNBTHelper.getInt(stack, PAGE_TAG, 0);

        int armor = ItemNBTHelper.getInt(stack, ARMOR_TAG, 0);
        int elixir = ItemNBTHelper.getInt(stack, ELIXIR_TAG, 0);
        int tools = ItemNBTHelper.getInt(stack, TOOL_TAG, 0);
        int fire = ItemNBTHelper.getInt(stack, FIRE_TAG, 0);
        int water = ItemNBTHelper.getInt(stack, WATER_TAG, 0);
        int food = ItemNBTHelper.getInt(stack, FOOD_TAG, 0);
        int air = ItemNBTHelper.getInt(stack, AIR_TAG, 0);
        int leaf = ItemNBTHelper.getInt(stack, LEAF_TAG, 0);

        pages.add(constructIndex(elixir, tools, armor, fire, water, food, air, leaf));
        pages.add(constructANewBeginning());
        pages.add(constructElixir(elixir));
        pages.add(constructTools(tools));
        pages.add(constructArmor(armor));
        pages.add(constructFire(elixir));
        pages.add(constructWater(elixir));
        pages.add(constructFood(elixir));
        pages.add(constructAir(elixir));
        pages.add(constructLeaf(elixir));

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

    private static IBookPage constructIndex(int elixir, int tool, int armor, int fire, int water, int food, int air, int leaf)
    {
        BookPageIndex indexPage = new BookPageIndex();

        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 0, 0, "A New Beginning", 1));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 64, 0, "Elixir", 2));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 128, 0, "Tools", 3));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 128, 64, "Armor", 4));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 0, 64, "Fire", 5));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 64, 64, "Water", 6));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 128, 128, "Food", 7));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 64, 128, "Air", 8));
        indexPage.addEntry(new BookEntryIndex(ICON_SHEET, 0, 128, "Leaf", 9));

        return indexPage;
    }

    private static IBookPage constructANewBeginning()
    {
        BookPageEntryList categoryPage = new BookPageEntryList("A New Beginning", 0);

        categoryPage.addEntry(new BookEntryListItem(new ItemStack(ModItems.guidebook), "Getting Started"));

        return categoryPage;
    }

    private static IBookPage constructElixir(int elixir)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Elixir", 0);

        return categoryPage;
    }

    private static IBookPage constructTools(int tools)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Tools", 0);

        return categoryPage;
    }

    private static IBookPage constructArmor(int armor)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Armor", 0);

        return categoryPage;
    }

    private static IBookPage constructFire(int fire)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Fire", 0);

        return categoryPage;
    }

    private static IBookPage constructWater(int water)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Water", 0);

        return categoryPage;
    }

    private static IBookPage constructFood(int food)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Food", 0);

        categoryPage.addEntry(new BookEntryListItem(new ItemStack(ModItems.leafstew), "Leaf Stew"));

        return categoryPage;
    }

    private static IBookPage constructAir(int air)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Air", 0);

        return categoryPage;
    }

    private static IBookPage constructLeaf(int leaf)
    {
        BookPageEntryList categoryPage = new BookPageEntryList("Leaf", 0);

        return categoryPage;
    }
}
