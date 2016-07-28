package com.porteriscool.caster.blocks;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModBlocks;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSlate extends Block
{
    public BlockSlate()
    {
        super(Material.ROCK);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".slate");
        setHardness(1.0F);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
