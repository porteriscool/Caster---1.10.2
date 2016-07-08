package com.porteriscool.caster.items.misc;

import com.porteriscool.caster.init.ModItems;
import com.porteriscool.caster.items.ItemBase;
import com.porteriscool.caster.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.security.InvalidParameterException;
import java.util.List;

import static com.porteriscool.caster.items.misc.ItemCrafting.types;

public class ItemGuideBook extends ItemBase
{
    public ItemGuideBook()
    {
        setUnlocalizedName(Reference.MOD_ID.toLowerCase() + ".guidebook");
        setHasSubtypes(true);
        setRegistryName("guidebook");
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> list)
    {
        for (int meta = 0; meta < types.length; meta++)
        {
            list.add(new ItemStack(item, 1, meta));
        }
    }

    public static ItemStack getStack(String name, int count)
    {
        for (int i = 0; i < types.length; i++)
        {
            if (types[i].equalsIgnoreCase(name))
            {
                return new ItemStack(ModItems.guidebook, count, i);
            }
        }
        throw new InvalidParameterException("Stack not found: " + name);
    }

    public static ItemStack getStack(String name)
    {
        return getStack(name, 1);
    }
}
