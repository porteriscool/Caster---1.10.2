package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemWaterLeggings extends ItemBase
{
    public ItemWaterLeggings()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterleggings");
        setRegistryName("waterleggings");
        setMaxStackSize(1);
    }
}