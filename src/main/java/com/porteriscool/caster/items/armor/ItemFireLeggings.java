package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemFireLeggings extends ItemBase
{
    public ItemFireLeggings()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".fireleggings");
        setRegistryName("fireleggings");
        setMaxStackSize(1);
    }
}