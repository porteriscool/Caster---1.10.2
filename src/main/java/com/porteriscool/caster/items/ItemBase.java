package com.porteriscool.caster.items;

import com.porteriscool.caster.CreativeTabCaster;
import net.minecraft.item.Item;

public class ItemBase extends Item
{
    public ItemBase()
    {
        setCreativeTab(CreativeTabCaster.instance);
    }
}
