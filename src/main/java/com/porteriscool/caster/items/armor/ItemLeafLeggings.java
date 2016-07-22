package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemLeafLeggings extends ItemBase
{
    public ItemLeafLeggings()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafleggings");
        setRegistryName("leafleggings");
        setMaxStackSize(1);
    }
}