package com.porteriscool.caster.init;

import com.porteriscool.caster.items.misc.*;
import com.porteriscool.caster.items.misc.ItemGuideBook;
import com.porteriscool.caster.items.tools.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems
{
    public static Item guidebook;
    public static Item emptybottle;
    public static Item bottleofelixir;
    public static Item leaf;
    public static Item twig;
    public static Item leafcrystal;
    public static Item firecrystal;

    public static Item elementalpickaxe;
    public static Item elementalaxe;
    public static Item elementalshovel;
    public static Item elementalsword;
    public static Item elementalsickle;
    public static Item sorcererswand;
    public static Item ironsickle;

    public static Item crafting;

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

        leafcrystal = new ItemLeafCrystal();
        GameRegistry.register(leafcrystal);

        firecrystal = new ItemFireCrystal();
        GameRegistry.register(firecrystal);

        elementalpickaxe = new ItemElementalPickaxe();
        GameRegistry.register(elementalpickaxe);

        elementalaxe = new ItemElementalAxe();
        GameRegistry.register(elementalaxe);

        elementalshovel = new ItemElementalShovel();
        GameRegistry.register(elementalshovel);

        elementalsword = new ItemElementalSword();
        GameRegistry.register(elementalsword);

        elementalsickle = new ItemElementalSickle();
        GameRegistry.register(elementalsickle);

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
