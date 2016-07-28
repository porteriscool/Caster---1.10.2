package com.porteriscool.caster.worldgen;

import com.porteriscool.caster.init.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGen implements IWorldGenerator
{
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.getDimension())
        {
            case 0: //The Overworld
                this.runGenerator(elixirCrystalOre, world, random, chunkX, chunkZ, 5, 0, 16);
                this.runGenerator(sorcerstoneOre, world, random, chunkX, chunkZ, 8, 12, 24);
                this.runGenerator(slate, world, random, chunkX, chunkZ, 30, 0, 60);
                break;

            case 1: //The End
                break;

            case -1: //The Nether
                break;
        }
    }

    public WorldGenerator elixirCrystalOre;
    public WorldGenerator sorcerstoneOre;
    public WorldGenerator slate;

    public OreGen()
    {
        elixirCrystalOre = new WorldGenMinable(ModBlocks.elixircrystalore.getDefaultState(), 8);
        sorcerstoneOre = new WorldGenMinable(ModBlocks.sorcererstoneore.getDefaultState(), 8);
        slate = new WorldGenMinable(ModBlocks.slate.getDefaultState(), 8);
    }

    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight)
    {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;

        for (int i = 0; i < chancesToSpawn; i ++)
        {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, new BlockPos(x, y, z));
        }
    }
}
