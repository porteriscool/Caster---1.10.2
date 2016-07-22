package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemAirHelmet extends ItemBase
{
    public ItemAirHelmet()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airhelmet");
        setRegistryName("airhelmet");
        setMaxStackSize(1);
    }
}