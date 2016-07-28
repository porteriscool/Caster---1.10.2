package com.porteriscool.caster.proxy;

import com.porteriscool.caster.handler.GuiHandler;
import com.porteriscool.caster.worldgen.OreGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
    private GuiHandler guiHandler;

    public void preInit(FMLPreInitializationEvent event)
    {

    }

    public void registerWorldGenerators()
    {
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }

    public void init(FMLInitializationEvent event)
    {
        guiHandler = GuiHandler.getInstance();
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

    public void registerRenders()
    {

    }
}