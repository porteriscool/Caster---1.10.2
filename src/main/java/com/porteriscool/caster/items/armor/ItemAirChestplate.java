package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemAirChestplate extends ItemBase
{
    public ItemAirChestplate()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airchestplate");
        setRegistryName("airchestplate");
        setMaxStackSize(1);
    }
}