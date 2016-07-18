package com.porteriscool.caster.items.tools;

import com.google.common.collect.Sets;
import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

public class ItemWaterPickaxe extends ItemTool
{
    public ItemWaterPickaxe()
    {
        super(ModItems.elementalMaterial, Sets.newHashSet(new Block[]{Blocks.STONE}));
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterpickaxe");
        setRegistryName("waterpickaxe");
        setMaxStackSize(1);
        setCreativeTab(CreativeTabCaster.instance);

        setHarvestLevel("pickaxe", this.toolMaterial.getHarvestLevel());
        this.damageVsEntity = this.toolMaterial.getDamageVsEntity() + 1.0f;
        this.attackSpeed = -2.8f;
    }
}
