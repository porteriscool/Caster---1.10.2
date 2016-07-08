package com.porteriscool.caster.init;

import com.porteriscool.caster.items.misc.ItemCrafting;
import com.porteriscool.caster.items.misc.ItemGuideBook;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems
{
    public static Item guidebook;
    public static Item crafting;

    public static void init()
    {
        guidebook = new ItemGuideBook();
        GameRegistry.register(guidebook);

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
