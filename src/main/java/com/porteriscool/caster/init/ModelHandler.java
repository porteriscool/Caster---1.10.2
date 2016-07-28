package com.porteriscool.caster.init;

import com.porteriscool.caster.items.misc.ItemCrafting;
import net.minecraft.block.Block;
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
        registerItemModel(ModItems.leafstew, 0);
        registerItemModel(ModItems.leafcrystal, 0);
        registerItemModel(ModItems.firecrystal, 0);
        registerItemModel(ModItems.aircrystal, 0);
        registerItemModel(ModItems.watercrystal, 0);
        registerItemModel(ModItems.elixircrystal, 0);
        registerItemModel(ModItems.sorcererstone, 0);
        registerItemModel(ModItems.elementalgemstone, 0);

        registerItemModel(ModItems.elementalpickaxe, 0);
        registerItemModel(ModItems.leafpickaxe, 0);
        registerItemModel(ModItems.firepickaxe, 0);
        registerItemModel(ModItems.waterpickaxe, 0);
        registerItemModel(ModItems.airpickaxe, 0);

        registerItemModel(ModItems.elementalaxe, 0);
        registerItemModel(ModItems.leafaxe, 0);
        registerItemModel(ModItems.fireaxe, 0);
        registerItemModel(ModItems.wateraxe, 0);
        registerItemModel(ModItems.airaxe, 0);

        registerItemModel(ModItems.elementalshovel, 0);
        registerItemModel(ModItems.leafshovel, 0);
        registerItemModel(ModItems.fireshovel, 0);
        registerItemModel(ModItems.watershovel, 0);
        registerItemModel(ModItems.airshovel, 0);

        registerItemModel(ModItems.elementalsword, 0);
        registerItemModel(ModItems.leafsword, 0);
        registerItemModel(ModItems.firesword, 0);
        registerItemModel(ModItems.watersword, 0);
        registerItemModel(ModItems.airsword, 0);

        registerItemModel(ModItems.elementalhoe, 0);
        registerItemModel(ModItems.leafhoe, 0);
        registerItemModel(ModItems.firehoe, 0);
        registerItemModel(ModItems.waterhoe, 0);
        registerItemModel(ModItems.airhoe, 0);

        registerItemModel(ModItems.elementalsickle, 0);
        registerItemModel(ModItems.leafsickle, 0);
        registerItemModel(ModItems.firesickle, 0);
        registerItemModel(ModItems.watersickle, 0);
        registerItemModel(ModItems.airsickle, 0);
        registerItemModel(ModItems.ironsickle, 0);

        registerItemModel(ModItems.sorcererswand, 0);

        registerItemModel(ModItems.elementalboots, 0);
        registerItemModel(ModItems.elementalleggings, 0);
        registerItemModel(ModItems.elementalchestplate, 0);
        registerItemModel(ModItems.elementalhelmet, 0);

        registerItemModel(ModItems.leafboots, 0);
        registerItemModel(ModItems.leafleggings, 0);
        registerItemModel(ModItems.leafchestplate, 0);
        registerItemModel(ModItems.leafhelmet, 0);

        registerItemModel(ModItems.fireboots, 0);
        registerItemModel(ModItems.fireleggings, 0);
        registerItemModel(ModItems.firechestplate, 0);
        registerItemModel(ModItems.firehelmet, 0);

        registerItemModel(ModItems.waterboots, 0);
        registerItemModel(ModItems.waterleggings, 0);
        registerItemModel(ModItems.waterchestplate, 0);
        registerItemModel(ModItems.waterhelmet, 0);

        registerItemModel(ModItems.airboots, 0);
        registerItemModel(ModItems.airleggings, 0);
        registerItemModel(ModItems.airchestplate, 0);
        registerItemModel(ModItems.airhelmet, 0);

        registerItemModel(ModBlocks.workbench, 0);
        registerItemModel(ModBlocks.castingpurifier, 0);
        registerItemModel(ModBlocks.elementalinfuser, 0);
        registerItemModel(ModBlocks.castingaltar, 0);
        registerItemModel(ModBlocks.slate, 0);
        registerItemModel(ModBlocks.polishedslate, 0);
        registerItemModel(ModBlocks.sorcererstoneore, 0);
        registerItemModel(ModBlocks.elixircrystalore, 0);
    }

    static void registerItemModel(Block b, int meta)
    {
        registerItemModel(Item.getItemFromBlock(b), meta);
    }

    static void registerItemModel(Block b, int meta, String variant)
    {
        registerItemModel(Item.getItemFromBlock(b), meta, variant);
    }

    static void registerItemModel(Item i, int meta)
    {
        ResourceLocation loc = i.getRegistryName();
        ModelLoader.setCustomModelResourceLocation(i, meta, new ModelResourceLocation(loc, "inventory"));
    }

    static void registerItemModel(Item i, int meta, String variant)
    {
        ResourceLocation loc =  i.getRegistryName();
        ModelLoader.setCustomModelResourceLocation(i, meta, new ModelResourceLocation(loc, "type=" + variant));
    }
}
