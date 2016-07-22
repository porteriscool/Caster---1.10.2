package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemFireChestplate extends ItemBase
{
    public ItemFireChestplate()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".firechestplate");
        setRegistryName("firechestplate");
        setMaxStackSize(1);
    }
}