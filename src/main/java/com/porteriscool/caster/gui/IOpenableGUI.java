package com.porteriscool.caster.gui;

import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IOpenableGUI
{
    Gui getClientGuiElement(int id, EntityPlayer player, World world, BlockPos pos);

    Container getServerGuiElement(int id, EntityPlayer player, World world, BlockPos pos);
}
