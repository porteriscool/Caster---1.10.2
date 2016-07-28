package com.porteriscool.caster.items.tools;

import com.google.common.collect.Sets;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import java.util.Random;

public class ItemLeafAxe extends ItemTool
{
    Random random = new Random();

    public ItemLeafAxe()
    {
        super(ModItems.crystalMaterial, Sets.newHashSet(new Block[]{Blocks.PLANKS}));
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafaxe");
        setRegistryName("leafaxe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);

        setHarvestLevel("axe", this.toolMaterial.getHarvestLevel());
        this.damageVsEntity = this.toolMaterial.getDamageVsEntity() + 5.0f;
        this.attackSpeed = -3.0f;
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
