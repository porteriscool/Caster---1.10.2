package com.porteriscool.caster.items.tools;

import com.google.common.collect.Sets;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class ItemElementalSickle extends ItemTool
{
    public ItemElementalSickle()
    {
        super(ModItems.elementalMaterial, Sets.newHashSet(new Block[]{Blocks.LEAVES}));
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalsickle");
        setRegistryName("elementalsickle");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);

        setHarvestLevel("sickle", this.toolMaterial.getHarvestLevel());
        this.attackSpeed = -3.0f;
        this.efficiencyOnProperMaterial = 0.75f;
    }
}
