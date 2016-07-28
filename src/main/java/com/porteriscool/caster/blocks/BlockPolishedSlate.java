package com.porteriscool.caster.blocks;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPolishedSlate extends Block
{
    public BlockPolishedSlate()
    {
        super(Material.ROCK);
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".polishedslate");
        setHardness(1.0F);
        setCreativeTab(CreativeTabCaster.instance);
    }
}
