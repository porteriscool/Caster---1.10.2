package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemWaterCrystal extends ItemBase
{
    public ItemWaterCrystal()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".watercrystal");
        setRegistryName("watercrystal");
        setMaxStackSize(64);
    }
}
