package com.theundertaker11.moreavaritia.compat.cyberware;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.recipe.RecipeUtil;

import morph.avaritia.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class CyberwearRecipes {

	@Optional.Method(modid = Reference.CyberwearModID)
	public static void init()
	{
		if(ConfigMain.enableCyberwearCreativeCapacitor)
		{
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(CyberNames.CREATIVE_BATTERY)), 
					"MMNNNNNMM",
					"MIRRRRRIM",
					"NRRSSSRRN",
					"NRSBCBSRN",
					"NRSCCCSRN",
					"NRSBCBSRN",
					"NRRSSSRRN",
					"MIRRRRRIM",
					"MMNNNNNMM",
					'B', new ItemStack(ModUtils.getItemByName(CyberNames.CHARGER)),
					'S', new ItemStack(ModUtils.getItemByName(CyberNames.ROBOSURGEON)),
					'I', ModItems.infinity_catalyst,
					'N', ModItems.neutronium_ingot,
					'R', ModItems.redstoneSingularity,
					'C', new ItemStack(ModUtils.getItemByName(CyberNames.DENSE_BATTERY)),
					'M', ModItems.crystal_matrix_ingot
					);
		}
	}
}
