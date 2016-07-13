package com.porteriscool.caster.init;

import com.porteriscool.caster.items.misc.ItemCrafting;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ModelHandler
{
    public static void init()
    {
        registerItemModel(ModItems.guidebook, 0);
        registerItemModel(ModItems.emptybottle, 0);
        registerItemModel(ModItems.bottleofelixir, 0);
        registerItemModel(ModItems.twig, 0);
        registerItemModel(ModItems.leaf, 0);
        registerItemModel(ModItems.leafcrystal, 0);
        registerItemModel(ModItems.firecrystal, 0);

        registerItemModel(ModItems.elementalpickaxe, 0);
        registerItemModel(ModItems.elementalaxe, 0);
        registerItemModel(ModItems.elementalshovel, 0);
        registerItemModel(ModItems.elementalsword, 0);
        registerItemModel(ModItems.elementalsickle, 0);
        registerItemModel(ModItems.sorcererswand, 0);
        registerItemModel(ModItems.ironsickle, 0);

        int i;

        for (i = 0; i < ItemCrafting.types.length; ++i)
        {
            String[] name = ItemCrafting.types.clone();
            registerItemModel(ModItems.crafting, i, name[i]);
        }
    }

    static void registerItemModel(Item i, int meta)
    {
        ResourceLocation loc = i.getRegistryName();
        ModelLoader.setCustomModelResourceLocation(i, meta, new ModelResourceLocation(loc, "inventory"));
    }

    static void registerItemModel(Item i, int meta, String varient)
    {
        ResourceLocation loc =  i.getRegistryName();
        ModelLoader.setCustomModelResourceLocation(i, meta, new ModelResourceLocation(loc, "type=" + varient));
    }
}
