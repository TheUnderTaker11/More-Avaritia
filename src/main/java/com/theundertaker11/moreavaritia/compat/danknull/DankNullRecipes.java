package com.theundertaker11.moreavaritia.compat.danknull;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.recipe.RecipeUtil;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class DankNullRecipes {
	
	@Optional.Method(modid = Reference.DankNullModID)
	public static void init()
	{
		if(ConfigMain.enableDankNull)
		{
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(DankNullNames.CREATIVE_DANK_NULL)), 
					"         ",
					"  NNNNN  ",
					" NBBBBBN ",
					" NBEEEBN ",
					" NBEIEBN ",
					" NBEEEBN ",
					" NBBBBBN ",
					"  NNNNN  ",
					"         ",
					'B', new ItemStack(ModBlocks.resource, 1, 0), // Neutronium Block
					'I', ModItems.infinity_catalyst,
					'N', ModItems.neutronium_ingot,
					'E', new ItemStack(ModUtils.getItemByName(DankNullNames.EMERALD_DANK_NULL))
					);
		}
	}
}
