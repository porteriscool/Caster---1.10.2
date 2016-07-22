package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemWaterBoots extends ItemBase
{
    public ItemWaterBoots()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterboots");
        setRegistryName("waterboots");
        setMaxStackSize(1);
    }
}