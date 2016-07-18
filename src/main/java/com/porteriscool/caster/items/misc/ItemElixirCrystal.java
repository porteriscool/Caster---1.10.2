package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemElixirCrystal extends ItemBase
{
    public ItemElixirCrystal()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elixircrystal");
        setRegistryName("elixircrystal");
        setMaxStackSize(64);
    }
}
