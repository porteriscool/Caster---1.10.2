package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemHoe;


public class ItemAirHoe extends ItemHoe
{
    public ItemAirHoe()
    {
        super(ModItems.elementalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airhoe");
        setRegistryName("airhoe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
