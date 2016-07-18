package com.porteriscool.caster.blocks;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockElixirCrystalOre extends Block
{
    public BlockElixirCrystalOre()
    {
        super(Material.ROCK);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elixircrystalore");
        setHardness(1.0F);
        setCreativeTab(CreativeTabCaster.instance);
    }
}