package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemEmptyBottle extends ItemBase
{
    public ItemEmptyBottle()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".emptybottle");
        setRegistryName("emptybottle");
        setMaxStackSize(16);
    }
}
