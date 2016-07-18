package com.porteriscool.caster.init;

import com.porteriscool.caster.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block sorcererstoneore, elixircrystalore, workbench, castingpurifier, elementalinfuser,
            castingaltar;

    public static void init()
    {
        sorcererstoneore = new BlockSorcererStoneOre();
        registerBlock(sorcererstoneore, "sorcererstoneore");

        elixircrystalore = new BlockElixirCrystalOre();
        registerBlock(elixircrystalore, "elixircrystalore");

        workbench = new BlockWorkBench();
        registerBlock(workbench, "workbench");

        castingaltar = new BlockCastingAltar();
        registerBlock(castingaltar, "castingaltar");

        castingpurifier = new BlockCastingPurifier();
        registerBlock(castingpurifier, "castingpurifier");

        elementalinfuser = new BlockElementalInfuser();
        registerBlock(elementalinfuser, "elementalinfuser");
    }

    public static void registerBlock(Block block, String name)
    {
        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }
}