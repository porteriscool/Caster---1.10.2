package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalHelmet extends ItemBase
{
    public ItemElementalHelmet()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalhelmet");
        setRegistryName("elementalhelmet");
        setMaxStackSize(1);
    }
}