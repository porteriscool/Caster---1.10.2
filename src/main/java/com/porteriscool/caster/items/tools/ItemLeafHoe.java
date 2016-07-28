package com.porteriscool.caster.items.tools;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Random;

public class ItemLeafHoe extends ItemHoe
{
    Random random = new Random();

    public ItemLeafHoe()
    {
        super(ModItems.crystalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafhoe");
        setRegistryName("leafhoe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);
    }

    @Override
    public void onUpdate(ItemStack stack, World world, Entity entity, int slot, boolean selected)
    {
        if (random.nextInt(80) == 0)
        {
            if (stack.getItemDamage() > 0)
            {
                stack.setItemDamage(stack.getItemDamage()-1);
            }
        }
    }
}
