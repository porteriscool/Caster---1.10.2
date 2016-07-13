package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;

public class ItemSorcerersWand extends ItemBase
{
    public ItemSorcerersWand()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".sorcererswand");
        setRegistryName("sorcererswand");
        setMaxStackSize(1);
    }
}
