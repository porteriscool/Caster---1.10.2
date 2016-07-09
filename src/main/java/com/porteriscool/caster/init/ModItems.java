package com.porteriscool.caster.init;

import com.porteriscool.caster.items.misc.*;
import com.porteriscool.caster.items.ItemGuideBook;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems
{
    public static Item guidebook;
    public static Item emptybottle;
    public static Item bottleofelixir;
    public static Item leaf;
    public static Item twig;

    public static Item crafting;

    public static void init()
    {
        guidebook = new ItemGuideBook();
        GameRegistry.register(guidebook);

        emptybottle = new ItemEmptyBottle();
        GameRegistry.register(emptybottle);

        bottleofelixir = new ItemBottleElixir();
        GameRegistry.register(bottleofelixir);

        leaf = new ItemLeaf();
        GameRegistry.register(leaf);

        twig = new ItemTwig();
        GameRegistry.register(twig);

        int i;

        for (i = 0; i < ItemCrafting.types.length; ++i)
        {
            String[] name = ItemCrafting.types.clone();
            registerOreDictValues(crafting, i, name[i]);
        }
    }

    static void registerOreDictValues(Item item, int meta, String value)
    {
        OreDictionary.registerOre(value, new ItemStack(item, 1, meta));
    }
}
