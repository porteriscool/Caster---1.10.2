package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemLeafHoe extends ItemHoe
{
    public ItemLeafHoe()
    {
        super(ModItems.elementalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafhoe");
        setRegistryName("leafhoe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
