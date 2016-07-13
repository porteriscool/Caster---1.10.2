package com.porteriscool.caster.init;

import com.porteriscool.caster.blocks.BlockSorcererStoneOre;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block sorcererstoneore;

    public static void init()
    {
        sorcererstoneore = new BlockSorcererStoneOre();
        registerBlock(sorcererstoneore, "sorcererstoneore");
    }

    public static void registerBlock(Block block, String name)
    {
        block.setRegistryName(name);
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());
    }
}
