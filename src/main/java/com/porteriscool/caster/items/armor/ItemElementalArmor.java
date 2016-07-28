package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import java.util.Random;

public class ItemElementalArmor extends ItemArmor
{
    Random random = new Random();

    public ItemElementalArmor(int reduction, EntityEquipmentSlot slot)
    {
        super(ModItems.elementalArmorMaterial, reduction, slot);
        if (slot == EntityEquipmentSlot.HEAD)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalhelmet");
            setRegistryName("elementalhelmet");
        }
        if (slot == EntityEquipmentSlot.CHEST)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalchestplate");
            setRegistryName("elementalchestplate");
        }
        if (slot == EntityEquipmentSlot.LEGS)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalleggings");
            setRegistryName("elementalleggings");
        }
        if (slot == EntityEquipmentSlot.FEET)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".elementalboots");
            setRegistryName("elementalboots");
        }
        setCreativeTab(CreativeTabCaster.instance);
    }
}
