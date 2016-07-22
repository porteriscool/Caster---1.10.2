package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemWaterChestplate extends ItemBase
{
    public ItemWaterChestplate()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterchestplate");
        setRegistryName("waterchestplate");
        setMaxStackSize(1);
    }
}