package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemLeafBoots extends ItemBase
{
    public ItemLeafBoots()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafboots");
        setRegistryName("leafboots");
        setMaxStackSize(1);
    }
}