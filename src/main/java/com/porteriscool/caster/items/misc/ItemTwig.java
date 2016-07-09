package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemTwig extends ItemBase
{
    public ItemTwig()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".twig");
        setRegistryName("twig");
        setMaxStackSize(64);
    }
}