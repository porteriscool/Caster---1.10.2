package com.porteriscool.caster.init;

import com.porteriscool.caster.items.armor.*;
import com.porteriscool.caster.items.misc.*;
import com.porteriscool.caster.items.tools.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.Item.*;

import java.util.ArrayList;
import java.util.List;

public class ModItems
{
    public static Item
            crafting, guidebook, emptybottle, bottleofelixir, leaf, twig, leafstew, leafcrystal, firecrystal,
            aircrystal, watercrystal, elixircrystal, sorcererstone, elementalgemstone, elementalpickaxe,
            elementalsword, elementalaxe, elementalshovel, elementalhoe, elementalsickle, sorcererswand, ironsickle,
            elementalboots, elementalleggings, elementalchestplate, elementalhelmet, airaxe, airhoe, airpickaxe,
            airshovel, airsickle, airsword, fireaxe, firehoe, firepickaxe, fireshovel, firesickle, firesword,
            leafaxe, leafhoe, leafpickaxe, leafshovel, leafsickle, leafsword, wateraxe, waterhoe, waterpickaxe,
            watershovel, watersickle, watersword, fireboots, waterboots, leafboots, airboots, firechestplate,
            airchestplate, leafchestplate, waterchestplate, firehelmet, waterhelmet, leafhelmet, airhelmet,
            fireleggings, waterleggings, leafleggings, airleggings;

    public static ToolMaterial elementalMaterial = EnumHelper.addToolMaterial("elementalMaterial", 3, 1050, 7.0f, 3.0f, 10);

    public static List<Item> registeredItems;

    public static final void init()
    {
        registeredItems = new ArrayList<Item>();

        guidebook = new ItemGuideBook();
        GameRegistry.register(guidebook);

        emptybottle = new ItemEmptyBottle();
        GameRegistry.register(emptybottle);

        bottleofelixir = new ItemBottleElixir();
        GameRegistry.register(bottleofelixir);

        leaf = new ItemLeaf();
        GameRegistry.register(leaf);

        twig = new ItemTwig();
        GameRegistry.register(twig);

        leafstew = new ItemLeafStew();
        GameRegistry.register(leafstew);

        leafcrystal = new ItemLeafCrystal();
        GameRegistry.register(leafcrystal);

        firecrystal = new ItemFireCrystal();
        GameRegistry.register(firecrystal);

        watercrystal = new ItemWaterCrystal();
        GameRegistry.register(watercrystal);

        aircrystal = new ItemAirCrystal();
        GameRegistry.register(aircrystal);

        elixircrystal = new ItemElixirCrystal();
        GameRegistry.register(elixircrystal);

        sorcererstone = new ItemSorcererStone();
        GameRegistry.register(sorcererstone);

        elementalgemstone = new ItemElementalGemstone();
        GameRegistry.register(elementalgemstone);

        elementalhelmet = new ItemElementalHelmet();
        GameRegistry.register(elementalhelmet);

        elementalchestplate = new ItemElementalChestplate();
        GameRegistry.register(elementalchestplate);

        elementalleggings = new ItemElementalLeggings();
        GameRegistry.register(elementalleggings);

        elementalboots = new ItemElementalBoots();
        GameRegistry.register(elementalboots);

        leafhelmet = new ItemLeafHelmet();
        GameRegistry.register(elementalhelmet);

        leafchestplate = new ItemLeafChestplate();
        GameRegistry.register(leafchestplate);

        leafleggings = new ItemLeafLeggings();
        GameRegistry.register(leafleggings);

        leafboots = new ItemLeafBoots();
        GameRegistry.register(leafboots);

        firehelmet = new ItemFireHelmet();
        GameRegistry.register(firehelmet);

        firechestplate = new ItemFireChestplate();
        GameRegistry.register(firechestplate);

        fireleggings = new ItemFireLeggings();
        GameRegistry.register(fireleggings);

        fireboots = new ItemFireBoots();
        GameRegistry.register(fireboots);

        waterhelmet = new ItemWaterHelmet();
        GameRegistry.register(waterhelmet);

        waterchestplate = new ItemWaterChestplate();
        GameRegistry.register(waterchestplate);

        waterleggings = new ItemWaterLeggings();
        GameRegistry.register(waterleggings);

        waterboots = new ItemWaterBoots();
        GameRegistry.register(waterboots);

        airhelmet = new ItemAirHelmet();
        GameRegistry.register(airhelmet);

        airchestplate = new ItemAirChestplate();
        GameRegistry.register(airchestplate);

        airleggings = new ItemAirLeggings();
        GameRegistry.register(airleggings);

        airboots = new ItemAirBoots();
        GameRegistry.register(airboots);

        elementalpickaxe = new ItemElementalPickaxe();
        GameRegistry.register(elementalpickaxe);

        leafpickaxe = new ItemLeafPickaxe();
        GameRegistry.register(leafpickaxe);

        firepickaxe = new ItemFirePickaxe();
        GameRegistry.register(firepickaxe);

        waterpickaxe = new ItemWaterPickaxe();
        GameRegistry.register(waterpickaxe);

        airpickaxe = new ItemAirPickaxe();
        GameRegistry.register(airpickaxe);

        elementalaxe = new ItemElementalAxe();
        GameRegistry.register(elementalaxe);

        leafaxe = new ItemLeafAxe();
        GameRegistry.register(leafaxe);

        fireaxe = new ItemFireAxe();
        GameRegistry.register(fireaxe);

        wateraxe = new ItemWaterAxe();
        GameRegistry.register(wateraxe);

        airaxe = new ItemAirAxe();
        GameRegistry.register(airaxe);

        elementalshovel = new ItemElementalShovel();
        GameRegistry.register(elementalshovel);

        leafshovel = new ItemLeafShovel();
        GameRegistry.register(leafshovel);

        fireshovel = new ItemFireShovel();
        GameRegistry.register(fireshovel);

        watershovel = new ItemWaterShovel();
        GameRegistry.register(watershovel);

        airshovel = new ItemAirShovel();
        GameRegistry.register(airshovel);

        elementalsword = new ItemElementalSword();
        GameRegistry.register(elementalsword);

        leafsword = new ItemLeafSword();
        GameRegistry.register(leafsword);

        firesword = new ItemFireSword();
        GameRegistry.register(firesword);

        watersword = new ItemWaterSword();
        GameRegistry.register(watersword);

        airsword = new ItemAirSword();
        GameRegistry.register(airsword);

        elementalhoe = new ItemElementalHoe();
        GameRegistry.register(elementalhoe);

        leafhoe = new ItemLeafHoe();
        GameRegistry.register(leafhoe);

        firehoe = new ItemFireHoe();
        GameRegistry.register(firehoe);

        waterhoe = new ItemWaterHoe();
        GameRegistry.register(waterhoe);

        airhoe = new ItemAirHoe();
        GameRegistry.register(airhoe);

        elementalsickle = new ItemElementalSickle();
        GameRegistry.register(elementalsickle);

        leafsickle = new ItemLeafSickle();
        GameRegistry.register(leafsickle);

        firesickle = new ItemFireSickle();
        GameRegistry.register(firesickle);

        watersickle = new ItemWaterSickle();
        GameRegistry.register(watersickle);

        airsickle = new ItemAirSickle();
        GameRegistry.register(airsickle);

        ironsickle = new ItemIronSickle();
        GameRegistry.register(ironsickle);

        sorcererswand = new ItemSorcerersWand();
        GameRegistry.register(sorcererswand);

        int i;

        for (i = 0; i < ItemCrafting.types.length; ++i)
        {
            String[] name = ItemCrafting.types.clone();
            registerOreDictValues(crafting, i, name[i]);
        }
    }

    static void registerOreDictValues(Item item, int meta, String value)
    {
        OreDictionary.registerOre(value, new ItemStack(item, 1, meta));
    }
}
