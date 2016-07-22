package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemAirBoots extends ItemBase
{
    public ItemAirBoots()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airboots");
        setRegistryName("airboots");
        setMaxStackSize(1);
    }
}