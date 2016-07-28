package com.porteriscool.caster.proxy;

import com.porteriscool.caster.handler.GuiHandlerRegistry;
import com.porteriscool.caster.worldgen.OreGen;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
    private GuiHandlerRegistry guiHandler;

    public void preInit(FMLPreInitializationEvent event)
    {
        guiHandler = GuiHandlerRegistry.getInstance();
    }

    public void init(FMLInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

    public void registerRenders()
    {

    }
}