package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemSorcererStone extends ItemBase
{
    public ItemSorcererStone()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".sorcererstone");
        setRegistryName("sorcererstone");
        setMaxStackSize(64);
    }
}
