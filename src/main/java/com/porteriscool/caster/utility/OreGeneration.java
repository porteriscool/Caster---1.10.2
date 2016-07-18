package com.porteriscool.caster.utility;

import com.porteriscool.caster.handler.ConfigurationHandler;
import com.porteriscool.caster.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGeneration implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.getDimension())
        {
            case -1:
                break;
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
                break;
            case 1:
                break;
        }
    }

    public void generateSurface(World world, Random random, int chunkX, int chunkZ)
    {
        int firstBlockXCoord = chunkX + random.nextInt(16);
        int firstBlockZCoord = chunkZ + random.nextInt(16);

        int oreGenY = random.nextInt(20);
        BlockPos oreGenPos = new BlockPos(firstBlockXCoord, oreGenY, firstBlockZCoord);

        if (ConfigurationHandler.enableaGeneration)
            (new WorldGenMinable(ModBlocks.sorcererstoneore.getDefaultState(), 10)).generate(world, random, oreGenPos);
            (new WorldGenMinable(ModBlocks.elixircrystalore.getDefaultState(), 10)).generate(world, random, oreGenPos);
    }
}
