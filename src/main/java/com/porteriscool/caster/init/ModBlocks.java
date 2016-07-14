package com.porteriscool.caster.init;

import com.porteriscool.caster.blocks.BlockSorcererStoneOre;
import com.porteriscool.caster.blocks.BlockWorkBench;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block sorcererstoneore;
    public static Block workbench;

    public static void init()
    {
        sorcererstoneore = new BlockSorcererStoneOre();
        registerBlock(sorcererstoneore, "sorcererstoneore");

        workbench = new BlockWorkBench();
        registerBlock(workbench, "workbench");
    }

    public static void registerBlock(Block block, String name)
    {
        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }
}