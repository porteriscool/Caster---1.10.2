package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalLeggings extends ItemBase
{
    public ItemElementalLeggings()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalleggings");
        setRegistryName("elementalleggings");
        setMaxStackSize(1);
    }
}
