package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemWaterHoe extends ItemHoe
{
    public ItemWaterHoe()
    {
        super(ModItems.elementalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterhoe");
        setRegistryName("waterhoe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
