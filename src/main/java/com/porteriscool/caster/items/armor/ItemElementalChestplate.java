package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalChestplate extends ItemBase
{
    public ItemElementalChestplate()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalchestplate");
        setRegistryName("elementalchestplate");
        setMaxStackSize(1);
    }
}
