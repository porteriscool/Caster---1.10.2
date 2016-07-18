package com.porteriscool.caster.proxy;

import com.porteriscool.caster.init.ModBlocks;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.init.ModelHandler;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ModelHandler.init();
    }

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }
}
