package com.theundertaker11.moreavaritia;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModUtils {

	
	public static Item getItemByName(String registryName)
	{
		 return Item.REGISTRY.getObject(new ResourceLocation(registryName));
	}
}
