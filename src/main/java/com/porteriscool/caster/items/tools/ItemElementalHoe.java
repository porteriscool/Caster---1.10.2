package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemElementalHoe extends ItemHoe
{
    public ItemElementalHoe()
    {
        super(ModItems.elementalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalhoe");
        setRegistryName("elementalhoe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
