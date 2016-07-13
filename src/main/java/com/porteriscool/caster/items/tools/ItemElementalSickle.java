package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalSickle extends ItemBase
{
    public ItemElementalSickle()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalsickle");
        setRegistryName("elementalsickle");
        setMaxStackSize(1);
    }
}
