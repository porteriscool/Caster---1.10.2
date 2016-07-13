package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalSword extends ItemBase
{
    public ItemElementalSword()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalsword");
        setRegistryName("elementalsword");
        setMaxStackSize(1);
    }
}
