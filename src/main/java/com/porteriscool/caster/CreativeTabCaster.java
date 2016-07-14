package com.porteriscool.caster;

import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabCaster extends CreativeTabs
{
    public static CreativeTabCaster instance = new CreativeTabCaster();

    public CreativeTabCaster()
    {
        super(Reference.MOD_ID.toLowerCase());
    }

    @Override
    public Item getTabIconItem()
    {
        return ModItems.guidebook;
    }
}
