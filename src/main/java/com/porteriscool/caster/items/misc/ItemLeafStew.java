package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;

public class ItemLeafStew extends ItemSoup
{
    public ItemLeafStew()
    {
        super(5);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafstew");
        setRegistryName("leafstew");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
