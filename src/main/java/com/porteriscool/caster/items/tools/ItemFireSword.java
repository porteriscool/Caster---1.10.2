package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
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

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
        stack.damageItem(1, attacker);
        if (target instanceof EntityLivingBase)
        {
            ((EntityLivingBase) target).setFire(5);
        }
        return true;
    }
}