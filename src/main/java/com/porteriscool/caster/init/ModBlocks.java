/*package com.porteriscool.caster.init;

import com.porteriscool.caster.blocks.BlockSorcererStoneOre;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static Block sorcererstoneore;

    public static void init()
    {
        sorcererstoneore = new BlockSorcererStoneOre();
    }

    public static void register()
    {
        registerBlock(sorcererstoneore);
    }

    private static void registerBlock(Block block)
    {
        GameRegistry.register(sorcererstoneore);

        ItemBlock item = new ItemBlock(block);

        item.setRegistryName(block.getRegistryName());

        GameRegistry.register(item);
    }

    public static void registerRenders()
    {
        registerRender(sorcererstoneore);
    }

    private static void registerRender(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
*/