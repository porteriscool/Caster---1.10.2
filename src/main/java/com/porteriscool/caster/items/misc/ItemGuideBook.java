package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
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
