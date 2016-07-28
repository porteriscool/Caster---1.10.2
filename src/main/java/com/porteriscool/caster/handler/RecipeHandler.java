package com.porteriscool.caster.handler;

import com.porteriscool.caster.init.ModBlocks;
import com.porteriscool.caster.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler
{
    public static void registerCraftingRecipes()
    {
        //Minecraft Vanilla Recipe Handler (STAYS THE SAME)
        GameRegistry.addRecipe(new ItemStack(ModItems.ironsickle), new Object[]{" I ","  I","TTI", 'I', Items.IRON_INGOT, 'T', ModItems.twig});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.guidebook,1), new Object[]{Items.BOOK, Items.BLAZE_POWDER, Items.SNOWBALL, ModItems.leaf, Items.FEATHER});

        //To be edited in future to implement recipe in Workbench
        GameRegistry.addRecipe(new ItemStack(ModBlocks.castingaltar), new Object[]{"BGB","WSW","SSS", 'B', ModItems.emptybottle, 'G', ModItems.guidebook, 'W', Blocks.LOG, 'S', ModBlocks.polishedslate});

        //To be edited in future to implement recipe in Casting Altar
        registerArmorRecipes(ModItems.airhelmet, ModItems.airchestplate, ModItems.airleggings, ModItems.airboots, ModItems.aircrystal);
        registerArmorRecipes(ModItems.firehelmet, ModItems.firechestplate, ModItems.fireleggings, ModItems.fireboots, ModItems.firecrystal);
        registerArmorRecipes(ModItems.waterhelmet, ModItems.waterchestplate, ModItems.waterleggings, ModItems.waterboots, ModItems.watercrystal);
        registerArmorRecipes(ModItems.leafhelmet, ModItems.leafchestplate, ModItems.leafleggings, ModItems.leafboots, ModItems.leafcrystal);
        registerArmorRecipes(ModItems.elementalhelmet, ModItems.elementalchestplate, ModItems.elementalleggings, ModItems.elementalboots, ModItems.elementalgemstone);

        registerToolRecipes(ModItems.airpickaxe, ModItems.airaxe, ModItems.airhoe, ModItems.airshovel, ModItems.airsword, ModItems.airsickle, ModItems.aircrystal);
        registerToolRecipes(ModItems.firepickaxe, ModItems.fireaxe, ModItems.firehoe, ModItems.fireshovel, ModItems.firesword, ModItems.firesickle, ModItems.firecrystal);
        registerToolRecipes(ModItems.waterpickaxe, ModItems.wateraxe, ModItems.waterhoe, ModItems.watershovel, ModItems.watersword, ModItems.watersickle, ModItems.watercrystal);
        registerToolRecipes(ModItems.leafpickaxe, ModItems.leafaxe, ModItems.leafhoe, ModItems.leafshovel, ModItems.leafsword, ModItems.leafsickle, ModItems.leafcrystal);
        registerToolRecipes(ModItems.elementalpickaxe, ModItems.elementalaxe, ModItems.elementalhoe, ModItems.elementalshovel, ModItems.elementalsword, ModItems.elementalsickle, ModItems.elementalgemstone);
    }

    public static void registerFurnaceRecipes()
    {

    }

    public static void registerArmorRecipes(Item helmet, Item chestplate, Item leggings, Item boots, Item gem)
    {
        //To be edited in future to implement recipe in Casting Altar
        GameRegistry.addRecipe(new ItemStack(helmet), new Object[] {"GGG","G G","   ", 'G', gem});
        GameRegistry.addRecipe(new ItemStack(helmet), new Object[] {"   ","GGG","G G", 'G', gem});
        GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] {"G G","GGG","GGG", 'G', gem});
        GameRegistry.addRecipe(new ItemStack(leggings), new Object[] {"GGG","G G","G G", 'G', gem});
        GameRegistry.addRecipe(new ItemStack(boots), new Object[] {"G G","G G","   ", 'G', gem});
        GameRegistry.addRecipe(new ItemStack(boots), new Object[] {"   ","G G","G G", 'G', gem});
    }

    public static void registerToolRecipes(Item pickaxe, Item axe, Item hoe, Item shovel, Item sword, Item sickle, Item gem)
    {
        //To be edited in future to implement in Casting Altar
        GameRegistry.addRecipe(new ItemStack(pickaxe), new Object[] {"GGG"," T "," T ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(axe), new Object[] {" GG"," TG"," T ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(axe), new Object[] {"GG ","GT "," T ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {"GG "," T "," T ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(hoe), new Object[] {" GG"," T "," T ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {" G "," T "," T ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"G  ","T  ","T  ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(shovel), new Object[] {"  G","  T","  T", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"  G","  G","  T", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(sword), new Object[] {" G "," G "," T ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(sword), new Object[] {"G  ","G  ","T  ", 'G', gem, 'T', ModItems.twig});
        GameRegistry.addRecipe(new ItemStack(sickle), new Object[] {" G ","  G","TTG", 'G', gem, 'T', ModItems.twig});
    }
}
