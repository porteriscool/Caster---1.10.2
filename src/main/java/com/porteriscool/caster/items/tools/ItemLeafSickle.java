package com.porteriscool.caster.items.tools;

import com.google.common.collect.Sets;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import java.util.Random;

public class ItemLeafSickle extends ItemTool
{
    Random random = new Random();

    public ItemLeafSickle()
    {
        super(ModItems.crystalMaterial, Sets.newHashSet(new Block[]{Blocks.LEAVES}));
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafsickle");
        setRegistryName("leafsickle");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);

        setHarvestLevel("sickle", this.toolMaterial.getHarvestLevel());
        this.attackSpeed = -3.0f;
        this.efficiencyOnProperMaterial = 0.75f;
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
