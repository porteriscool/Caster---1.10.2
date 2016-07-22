package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemLeafHelmet extends ItemBase
{
    public ItemLeafHelmet()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafhelmet");
        setRegistryName("leafhelmet");
        setMaxStackSize(1);
    }
}