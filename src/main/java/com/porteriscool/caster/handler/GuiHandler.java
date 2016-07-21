package com.porteriscool.caster.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import java.util.HashMap;

public class GuiHandler implements IGuiHandler
{
    public void registerGuiHandler(IGuiHandler handler, int guiID)
    {
        registeredHandlers.put(guiID, handler);
    }

    public static GuiHandler getInstance() { return guiHandler; }

    private HashMap<Integer, IGuiHandler> registeredHandlers = new HashMap<Integer, IGuiHandler>();
    private static GuiHandler guiHandler = new GuiHandler();

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        IGuiHandler handler = registeredHandlers.get(ID);
        if (handler != null)
        {
            return handler.getServerGuiElement(ID, player, world, x, y, z);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        IGuiHandler handler = registeredHandlers.get(ID);
        if (handler != null)
        {
            return handler.getClientGuiElement(ID, player, world, x, y, z);
        }

        return null;
    }
}
