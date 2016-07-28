package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import java.util.Random;

public class ItemLeafArmor extends ItemArmor
{
    Random random = new Random();

    public ItemLeafArmor(int reduction, EntityEquipmentSlot slot)
    {
        super(ModItems.crystalArmorMaterial, reduction, slot);
        if (slot == EntityEquipmentSlot.HEAD)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafhelmet");
            setRegistryName("leafhelmet");
        }
        if (slot == EntityEquipmentSlot.CHEST)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafchestplate");
            setRegistryName("leafchestplate");
        }
        if (slot == EntityEquipmentSlot.LEGS)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafleggings");
            setRegistryName("leafleggings");
        }
        if (slot == EntityEquipmentSlot.FEET)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".leafboots");
            setRegistryName("leafboots");
        }
        setCreativeTab(CreativeTabCaster.instance);
    }
}
