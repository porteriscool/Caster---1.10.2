package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import java.util.Random;

public class ItemAirArmor extends ItemArmor
{
    Random random = new Random();

    public ItemAirArmor(int reduction, EntityEquipmentSlot slot)
    {
        super(ModItems.crystalArmorMaterial, reduction, slot);
        if (slot == EntityEquipmentSlot.HEAD)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airhelmet");
            setRegistryName("airhelmet");
        }
        if (slot == EntityEquipmentSlot.CHEST)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airchestplate");
            setRegistryName("airchestplate");
        }
        if (slot == EntityEquipmentSlot.LEGS)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airleggings");
            setRegistryName("airleggings");
        }
        if (slot == EntityEquipmentSlot.FEET)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".airboots");
            setRegistryName("airboots");
        }
        setCreativeTab(CreativeTabCaster.instance);
    }
}
