package com.porteriscool.caster.proxy;

import com.porteriscool.caster.gui.GuiHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    private GuiHandler guiHandler;

    public void preInit(FMLPreInitializationEvent event)
    {

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