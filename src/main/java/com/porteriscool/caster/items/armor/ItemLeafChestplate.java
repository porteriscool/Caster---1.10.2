package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemLeafChestplate extends ItemBase
{
    public ItemLeafChestplate()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafchestplate");
        setRegistryName("leafchestplate");
        setMaxStackSize(1);
    }
}