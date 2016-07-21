package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemElementalSword extends ItemSword
{
    public ItemElementalSword()
    {
        super(ModItems.elementalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalsword");
        setRegistryName("elementalsword");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
