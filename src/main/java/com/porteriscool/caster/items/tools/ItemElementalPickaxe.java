package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElementalPickaxe extends ItemBase
{
    public ItemElementalPickaxe()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalpickaxe");
        setRegistryName("elementalpickaxe");
        setMaxStackSize(1);
    }
}
