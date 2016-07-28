package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import java.util.Random;

public class ItemWaterArmor extends ItemArmor
{
    Random random = new Random();

    public ItemWaterArmor(int reduction, EntityEquipmentSlot slot)
    {
        super(ModItems.crystalArmorMaterial, reduction, slot);
        if (slot == EntityEquipmentSlot.HEAD)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterhelmet");
            setRegistryName("waterhelmet");
        }
        if (slot == EntityEquipmentSlot.CHEST)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterchestplate");
            setRegistryName("waterchestplate");
        }
        if (slot == EntityEquipmentSlot.LEGS)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterleggings");
            setRegistryName("waterleggings");
        }
        if (slot == EntityEquipmentSlot.FEET)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".waterboots");
            setRegistryName("waterboots");
        }
        setCreativeTab(CreativeTabCaster.instance);
    }
}
