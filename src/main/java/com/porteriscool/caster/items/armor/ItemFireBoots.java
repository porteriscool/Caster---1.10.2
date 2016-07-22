package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemFireBoots extends ItemBase
{
    public ItemFireBoots()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".fireboots");
        setRegistryName("fireboots");
        setMaxStackSize(1);
    }
}