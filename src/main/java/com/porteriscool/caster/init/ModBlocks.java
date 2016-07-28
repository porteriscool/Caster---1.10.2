package com.porteriscool.caster.init;

import com.porteriscool.caster.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;

public class ModBlocks
{
    public static Block slate, polishedslate, sorcererstoneore, elixircrystalore, workbench, castingpurifier, elementalinfuser,
            castingaltar;

    public static void init()
    {
        slate = new BlockSlate();
        registerBlock(slate, "slate");

        polishedslate = new BlockPolishedSlate();
        registerBlock(polishedslate, "polishedslate");

        sorcererstoneore = new BlockSorcererStoneOre();
        registerBlock(sorcererstoneore, "sorcererstoneore");

        elixircrystalore = new BlockElixirCrystalOre();
        registerBlock(elixircrystalore, "elixircrystalore");

        workbench = new BlockWorkbench();
        registerBlock(workbench, "workbench");
        //GameRegistry.registerTileEntity(TileWorkbench.class, "workbench");

        castingaltar = new BlockCastingAltar();
        registerBlock(castingaltar, "castingaltar");

        castingpurifier = new BlockCastingPurifier();
        registerBlock(castingpurifier, "castingpurifier");

        elementalinfuser = new BlockElementalInfuser();
        registerBlock(elementalinfuser, "elementalinfuser");
    }

    static void registerOreDictValues(Block item, int meta, String value)
    {
        OreDictionary.registerOre(value, new ItemStack(item, 1, meta));
    }

    public static void registerBlock(Block block, String name)
    {
        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }
}