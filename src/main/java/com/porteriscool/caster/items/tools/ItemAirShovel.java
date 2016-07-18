package com.porteriscool.caster.items.tools;

import com.google.common.collect.Sets;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class ItemAirShovel extends ItemTool
{
    public ItemAirShovel()
    {
        super(ModItems.elementalMaterial, Sets.newHashSet(new Block[]{Blocks.DIRT}));
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airshovel");
        setRegistryName("airshovel");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);

        setHarvestLevel("shovel", this.toolMaterial.getHarvestLevel());
        this.damageVsEntity = this.toolMaterial.getDamageVsEntity() + 1.5f;
        this.attackSpeed = -3.0f;
    }
}
