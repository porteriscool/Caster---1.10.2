package com.porteriscool.caster.items.tools;

import com.google.common.collect.Sets;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Random;

public class ItemAirAxe extends ItemTool
{
    public ItemAirAxe()
    {
        super(ModItems.elementalMaterial, Sets.newHashSet(new Block[]{Blocks.PLANKS}));
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airaxe");
        setRegistryName("airaxe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);

        setHarvestLevel("axe", this.toolMaterial.getHarvestLevel());
        this.damageVsEntity = this.toolMaterial.getDamageVsEntity() + 5.0f;
        this.attackSpeed = -3.0f;
    }
}
