package com.theundertaker11.moreavaritia.compat.quantumflux;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import morph.avaritia.recipe.extreme.ExtremeCraftingManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class QuantumFluxRecipes {

	@Optional.Method(modid = Reference.RefinedStorageModID)
	public static void init()
	{
		if(ConfigMain.enableQuantumFluxCatalystItem)
		{
			RecipeUtil.addCatalystInput(new ItemStack(ModUtils.getItemByName(QFNames.QUIBIT_CLUSTER), 1, 5));
		}
		if(ConfigMain.enableCreativeQuibitCluster)
		{
			//Creative quibit cluster
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(QFNames.QUIBIT_CLUSTER), 1, 0),
					"BIIIBIIIB",
					"IQIICIIQI",
					"IIQZZZQII",
					"IIZQBQZII",
					"BCZBEBZCB",
					"IIZQBQZII",
					"IIQZZZQII",
					"IQIICIIQI",
					"BIIIBIIIB",
					'E', ModItems.emeraldSingularity,
					'I', new ItemStack(ModUtils.getItemByName(QFNames.CRAFTING_PART), 1, 6),
					'Q', new ItemStack(ModUtils.getItemByName(QFNames.QUIBIT_CLUSTER), 1, 5),//Qubit cluster level 5
					'C', ModUtils.getItemByName(QFNames.QUIBIT_CELL),
					'B', new ItemStack(ModBlocks.resource, 1, 1),//Infinity block
					'Z', ModUtils.getItemByName(QFNames.ZPE)
					);
		}
	}
}
