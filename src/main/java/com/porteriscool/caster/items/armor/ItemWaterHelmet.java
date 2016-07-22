package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemWaterHelmet extends ItemBase
{
    public ItemWaterHelmet()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterhelmet");
        setRegistryName("waterhelmet");
        setMaxStackSize(1);
    }
}