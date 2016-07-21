package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.Caster;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.client.gui.GuiGuideBook;
import com.porteriscool.caster.container.ContainerGuideBook;
import com.porteriscool.caster.gui.IOpenableGUI;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemGuideBook extends ItemBase implements IOpenableGUI
{
    public ItemGuideBook()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".guidebook");
        setRegistryName("guidebook");
        setCreativeTab(CreativeTabCaster.instance);
    }

    @Override
    public int getItemStackLimit()
    {
        return 1;
    }

    public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World worldIn, EntityPlayer player, EnumHand hand)
    {
        if (!player.isSneaking())
        {
            player.openGui(Caster.instance, 0, worldIn, (int)player.posX, (int)player.posY, (int)player.posZ);
        }

        return ActionResult.newResult(EnumActionResult.PASS, stack);
    }

    @Override
    public Gui getClientGuiElement(int id, EntityPlayer player, World world, BlockPos pos)
    {
        return new GuiGuideBook(player, player.getHeldItemMainhand());
    }

    @Override
    public Container getServerGuiElement(int id, EntityPlayer player, World world, BlockPos pos)
    {
        return new ContainerGuideBook();
    }
}
