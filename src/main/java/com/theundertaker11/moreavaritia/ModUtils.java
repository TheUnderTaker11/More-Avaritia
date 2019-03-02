package com.theundertaker11.moreavaritia;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ResourceLocation;

public class ModUtils {

	
	public static Item getItemByName(String registryName)
	{
		 return Item.REGISTRY.getObject(new ResourceLocation(registryName));
	}
	
	public static boolean removeEnchant(ItemStack stack, Enchantment targetEnchant) {
		
		NBTTagList nbttaglist = stack.getEnchantmentTagList();
		
        for (int i = 0; i < nbttaglist.tagCount(); ++i)
        {
            NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
            Enchantment enchantment = Enchantment.getEnchantmentByID(nbttagcompound.getShort("id"));

            if (enchantment == targetEnchant)
            {
                nbttaglist.removeTag(i);
            }
        }
		return false;
	}
}
