package com.porteriscool.caster.init;

import com.porteriscool.caster.blocks.BlockSorcererStoneOre;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block sorcererstoneore;

    public static void init()
    {
        sorcererstoneore = new BlockSorcererStoneOre();

        GameRegistry.register(sorcererstoneore, "sorcererstoneore");
    }
}
