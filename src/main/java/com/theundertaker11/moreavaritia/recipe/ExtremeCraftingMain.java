package com.theundertaker11.moreavaritia.recipe;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.compat.extrautils2.ExUtilNames;
import com.theundertaker11.moreavaritia.items.ItemRegistry;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;

public class ExtremeCraftingMain {

	public static void init() {
		
		//Infinity-1 Pickaxe
		if(ConfigMain.enableInfinityMPick) {
			RecipeUtil.addRecipe( new ItemStack(ItemRegistry.InfinityM1Pick),
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
			RecipeUtil.addRecipe( new ItemStack(ItemRegistry.InfinityM1Hoe),
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

		//Infinity-1 Sword
		if(ConfigMain.enableInfinityMSword) {
			RecipeUtil.addRecipe( new ItemStack(ItemRegistry.InfinityM1Sword),
					"       II",
					"      III",
					"     III ",
					"    III  ",
					" M III   ",
					"  MII    ",
					"  NM     ",
					" N  M    ",
					"I        ",
					'M', ModItems.crystal_matrix_ingot,
					'N', new ItemStack(ModBlocks.resource, 1, 0), // Neutronium Block
					'I', new ItemStack(ModBlocks.resource, 1, 2)// Crytal matrix block
					);
		}
		
		//Balanced Infinity Sword
		if(ConfigMain.enableBalancedInfinitySword) {
			RecipeUtil.addRecipe( new ItemStack(ItemRegistry.BalancedInfinitySword),
					"       II",
					"      III",
					"     III ",
					"    III  ",
					" M III   ",
					"  MII    ",
					"  NM     ",
					" N  M    ",
					"C        ",
					'M', ModItems.crystal_matrix_ingot,
					'N', new ItemStack(ModBlocks.resource, 1, 0), // Neutronium Block
					'I', ModItems.infinity_ingot,
					'C', ModItems.infinity_catalyst
					);
		}
	}
}
