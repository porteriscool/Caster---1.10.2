package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemIronSickle extends ItemBase
{
    public ItemIronSickle()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".ironsickle");
        setRegistryName("ironsickle");
        setMaxStackSize(1);
    }
}
