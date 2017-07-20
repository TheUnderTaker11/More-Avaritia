package com.theundertaker11.moreavaritia.compat.appliedenergistics;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModItems;
import morph.avaritia.init.Recipes;
import morph.avaritia.recipe.extreme.ExtremeCraftingManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class AERecipes {

	@Optional.Method(modid = Reference.AppliedEnergisticsModID)
	public static void init()
	{
		if(ConfigMain.enableAECatalystItem)
		{
			Recipes.catalyst.getInput().add(new ItemStack(ModUtils.getItemByName(AENames.MATERIAL), 1, 38));//64k storage part
		}
		
		if(ConfigMain.enableAEEnergyCell)
		{
			ExtremeCraftingManager.getInstance().addRecipe(
					new ItemStack(ModUtils.getItemByName(AENames.CREATIVE_CELL)),
					"CCCCSCCCC",
					"CIAISIAIC",
					"CAIESEIAC",
					"CIEESEEIC",
					"SSSSKSSSS",
					"CIEESEEIC",
					"CAIESEIAC",
					"CIAISIAIC",
					"CCCCSCCCC",
					'I', ModItems.infinity_ingot,
					'C', new ItemStack(ModUtils.getItemByName(AENames.DENSE_CELL)),
					'K', new ItemStack(ModUtils.getItemByName(AENames.MATERIAL), 1, 38),
					'E', new ItemStack(ModUtils.getItemByName(AENames.MATERIAL), 1, 24),
					'S', new ItemStack(ModUtils.getItemByName(AENames.MATERIAL), 1, 47),
					'A', new ItemStack(ModUtils.getItemByName(AENames.VIBRATION_CHAMBER))
					);
		}
		
	}
}
