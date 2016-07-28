package com.porteriscool.caster.items.armor;

import com.porteriscool.caster.CreativeTabCaster;
import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

import java.util.Random;

public class ItemFireArmor extends ItemArmor
{
    Random random = new Random();

    public ItemFireArmor(int reduction, EntityEquipmentSlot slot)
    {
        super(ModItems.crystalArmorMaterial, reduction, slot);
        if (slot == EntityEquipmentSlot.HEAD)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".firehelmet");
            setRegistryName("firehelmet");
        }
        if (slot == EntityEquipmentSlot.CHEST)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".firechestplate");
            setRegistryName("firechestplate");
        }
        if (slot == EntityEquipmentSlot.LEGS)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".fireleggings");
            setRegistryName("fireleggings");
        }
        if (slot == EntityEquipmentSlot.FEET)
        {
            setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".fireboots");
            setRegistryName("fireboots");
        }
        setCreativeTab(CreativeTabCaster.instance);
    }
}
