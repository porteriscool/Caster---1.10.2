package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalShovel extends ItemBase
{
    public ItemElementalShovel()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalshovel");
        setRegistryName("elementalshovel");
        setMaxStackSize(1);
    }
}
