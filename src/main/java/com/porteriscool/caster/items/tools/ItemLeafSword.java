package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemLeafSword extends ItemSword
{
    public ItemLeafSword()
    {
        super(ModItems.elementalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafsword");
        setRegistryName("leafsword");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
