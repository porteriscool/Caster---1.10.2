package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalGemstone extends ItemBase
{
    public ItemElementalGemstone()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalgemstone");
        setRegistryName("elementalgemstone");
        setMaxStackSize(64);
    }
}
