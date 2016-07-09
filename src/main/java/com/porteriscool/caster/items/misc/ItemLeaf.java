package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemLeaf extends ItemBase
{
    public ItemLeaf()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leaf");
        setRegistryName("leaf");
        setMaxStackSize(64);
    }
}