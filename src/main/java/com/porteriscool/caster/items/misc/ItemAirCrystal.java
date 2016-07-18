package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemAirCrystal extends ItemBase
{
    public ItemAirCrystal()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".aircrystal");
        setRegistryName("aircrystal");
        setMaxStackSize(64);
    }
}
