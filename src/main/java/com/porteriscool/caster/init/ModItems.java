package com.porteriscool.caster.init;

import com.porteriscool.caster.items.armor.*;
import com.porteriscool.caster.items.misc.*;
import com.porteriscool.caster.items.tools.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.*;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item.*;

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

    //Armor Materials
    public static ArmorMaterial crystalArmorMaterial = EnumHelper.addArmorMaterial("crystalArmor", "caster:crystalArmor", 15, new int[]{2,5,6,2}, 9, null, 0);
    public static ArmorMaterial elementalArmorMaterial = EnumHelper.addArmorMaterial("elementalArmor", "caster:elementalArmor", 33, new int[]{3,6,8,3}, 10, null, 2.0f);

    //Tool Materials
    public static ToolMaterial elementalMaterial = EnumHelper.addToolMaterial("elementalMaterial", 3, 1050, 8.0f, 3.0f, 15);
    public static ToolMaterial crystalMaterial = EnumHelper.addToolMaterial("crystalMaterial", 3, 520, 6.0f, 3.0f, 10);

    public static void init()
    {
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

        elementalhelmet = new ItemElementalArmor(3, EntityEquipmentSlot.HEAD);
        GameRegistry.register(elementalhelmet);

        elementalchestplate = new ItemElementalArmor(8, EntityEquipmentSlot.CHEST);
        GameRegistry.register(elementalchestplate);

        elementalleggings = new ItemElementalArmor(6, EntityEquipmentSlot.LEGS);
        GameRegistry.register(elementalleggings);

        elementalboots = new ItemElementalArmor(3, EntityEquipmentSlot.FEET);
        GameRegistry.register(elementalboots);

        leafhelmet = new ItemLeafArmor(2, EntityEquipmentSlot.HEAD);
        GameRegistry.register(leafhelmet);

        leafchestplate = new ItemLeafArmor(6, EntityEquipmentSlot.CHEST);
        GameRegistry.register(leafchestplate);

        leafleggings = new ItemLeafArmor(5, EntityEquipmentSlot.LEGS);
        GameRegistry.register(leafleggings);

        leafboots = new ItemLeafArmor(2, EntityEquipmentSlot.FEET);
        GameRegistry.register(leafboots);

        firehelmet = new ItemFireArmor(2, EntityEquipmentSlot.HEAD);
        GameRegistry.register(firehelmet);

        firechestplate = new ItemFireArmor(6, EntityEquipmentSlot.CHEST);
        GameRegistry.register(firechestplate);

        fireleggings = new ItemFireArmor(5, EntityEquipmentSlot.LEGS);
        GameRegistry.register(fireleggings);

        fireboots = new ItemFireArmor(2, EntityEquipmentSlot.FEET);
        GameRegistry.register(fireboots);

        waterhelmet = new ItemWaterArmor(2, EntityEquipmentSlot.HEAD);
        GameRegistry.register(waterhelmet);

        waterchestplate = new ItemWaterArmor(6, EntityEquipmentSlot.CHEST);
        GameRegistry.register(waterchestplate);

        waterleggings = new ItemWaterArmor(5, EntityEquipmentSlot.LEGS);
        GameRegistry.register(waterleggings);

        waterboots = new ItemWaterArmor(2, EntityEquipmentSlot.FEET);
        GameRegistry.register(waterboots);

        airhelmet = new ItemAirArmor(2, EntityEquipmentSlot.HEAD);
        GameRegistry.register(airhelmet);

        airchestplate = new ItemAirArmor(6, EntityEquipmentSlot.CHEST);
        GameRegistry.register(airchestplate);

        airleggings = new ItemAirArmor(5, EntityEquipmentSlot.LEGS);
        GameRegistry.register(airleggings);

        airboots = new ItemAirArmor(2, EntityEquipmentSlot.FEET);
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
    }
}
