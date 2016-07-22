package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemAirLeggings extends ItemBase
{
    public ItemAirLeggings()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airleggings");
        setRegistryName("airleggings");
        setMaxStackSize(1);
    }
}