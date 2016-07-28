package com.porteriscool.caster.items.tools;

import com.google.common.collect.Sets;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import java.util.Random;

public class ItemLeafPickaxe extends ItemPickaxe
{
    Random random = new Random();

    public ItemLeafPickaxe()
    {
        super(ModItems.crystalMaterial);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafpickaxe");
        setRegistryName("leafpickaxe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);

        setHarvestLevel("pickaxe", this.toolMaterial.getHarvestLevel());
        this.damageVsEntity = this.toolMaterial.getDamageVsEntity() + 1.0f;
        this.attackSpeed = -2.8f;
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
