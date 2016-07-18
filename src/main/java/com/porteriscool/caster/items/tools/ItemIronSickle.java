package com.porteriscool.caster.items.tools;

import com.google.common.collect.Sets;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class ItemIronSickle extends ItemTool
{
    public ItemIronSickle()
    {
        super(ToolMaterial.IRON, Sets.newHashSet(new Block[]{Blocks.LEAVES}));
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".ironsickle");
        setRegistryName("ironsickle");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);

        setHarvestLevel("sickle", this.toolMaterial.getHarvestLevel());
        this.attackSpeed = -2.8f;
        this.efficiencyOnProperMaterial = 0.75f;
    }
}
