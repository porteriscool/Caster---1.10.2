package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBottleElixir extends ItemBase
{
    public ItemBottleElixir()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".bottleofelixir");
        setRegistryName("bottleofelixir");
        setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
}
