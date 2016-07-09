package com.porteriscool.caster.items;

import com.porteriscool.caster.reference.Reference;

public class ItemGuideBook extends ItemBase
{
    public ItemGuideBook()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".guidebook");
        setRegistryName("guidebook");
        setMaxStackSize(1);
    }
}
