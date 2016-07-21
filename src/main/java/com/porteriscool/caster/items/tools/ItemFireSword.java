package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemFireSword extends ItemSword
{
    public ItemFireSword()
    {
        super(ModItems.elementalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".firesword");
        setRegistryName("firesword");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }
}