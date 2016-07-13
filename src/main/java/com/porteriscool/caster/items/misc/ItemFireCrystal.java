package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemFireCrystal extends ItemBase
{
    public ItemFireCrystal()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".firecrystal");
        setRegistryName("firecrystal");
        setMaxStackSize(64);
    }
}
