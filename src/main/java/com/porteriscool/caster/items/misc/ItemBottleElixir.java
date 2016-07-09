package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemBottleElixir extends ItemBase
{
    public ItemBottleElixir()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".bottleofelixir");
        setRegistryName("bottleofelixir");
        setMaxStackSize(1);
    }
}
