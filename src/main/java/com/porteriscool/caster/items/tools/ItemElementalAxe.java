package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalAxe extends ItemBase
{
    public ItemElementalAxe()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalaxe");
        setRegistryName("elementalaxe");
        setMaxStackSize(1);
    }
}
