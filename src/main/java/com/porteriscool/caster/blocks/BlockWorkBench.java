package com.porteriscool.caster.blocks;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockWorkbench extends Block
{
    public BlockWorkbench()
    {
        super(Material.WOOD);
        this.setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".workbench");
        this.setHardness(1.0F);
        this.setCreativeTab(CreativeTabCaster.instance);
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean canRenderInLayer(BlockRenderLayer layer)
    {
        if (layer == BlockRenderLayer.CUTOUT)
        {
            return true;
        }
        return false;
    }
}