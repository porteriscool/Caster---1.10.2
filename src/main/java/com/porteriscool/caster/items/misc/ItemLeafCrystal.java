package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemLeafCrystal extends ItemBase
{
    public ItemLeafCrystal()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafcrystal");
        setRegistryName("leafcrystal");
        setMaxStackSize(64);
    }
}
