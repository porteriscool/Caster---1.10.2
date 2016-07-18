package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalBoots extends ItemBase
{
    public ItemElementalBoots()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalboots");
        setRegistryName("elementalboots");
        setMaxStackSize(1);
    }
}