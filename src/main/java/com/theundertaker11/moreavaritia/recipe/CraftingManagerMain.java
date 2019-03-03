package com.theundertaker11.moreavaritia.recipe;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.compat.extrautils2.ExUtilNames;
import com.theundertaker11.moreavaritia.items.ItemRegistry;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;

public class CraftingManagerMain {

	public static void init() {
		
		//Infinity-1 Pickaxe
		if(ConfigMain.enableInfinityMPick) {
			RecipeUtil.addRecipe( new ItemStack(ItemRegistry.InfinityPickM1),
				" MMMBMMM ",
				"MBBBBBBBM",
				"MB  N  BM",
				"    N    ",
				"    N    ",
				"    N    ",
				"    N    ",
				"    N    ",
				"    N    ",
				'M', ModItems.crystal_matrix_ingot,
				'N', new ItemStack(ModBlocks.resource, 1, 0), // Neutronium Block
				'B', new ItemStack(ModBlocks.resource, 1, 2)
				);
		}
		//Infinity-1 Hoe
		if(ConfigMain.enableInfinityMHoe) {
			RecipeUtil.addRecipe( new ItemStack(ItemRegistry.InfinityHoeM1),
				"     N   ",
				" BBBBBB  ",
				"BMMMMMM  ",
				"B    MM  ",
				"     N   ",
				"     N   ",
				"     N   ",
				"     N   ",
				"     N   ",
				'M', ModItems.crystal_matrix_ingot,
				'N', new ItemStack(ModBlocks.resource, 1, 0), // Neutronium Block
				'B', new ItemStack(ModBlocks.resource, 1, 2) // Crytal matrix block
				);
		}

	}
}
