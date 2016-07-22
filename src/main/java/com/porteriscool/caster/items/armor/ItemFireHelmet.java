package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemFireHelmet extends ItemBase
{
    public ItemFireHelmet()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".firehelmet");
        setRegistryName("firehelmet");
        setMaxStackSize(1);
    }
}