package com.theundertaker11.moreavaritia.compat.tinkers;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModItems;
import morph.avaritia.recipe.extreme.ExtremeCraftingManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class TinkersRecipes {

	@Optional.Method(modid = Reference.TinkersModID)
	public static void init()
	{
		if(ConfigMain.enableTinkersCatalystItem)
		{
			RecipeUtil.addCatalystInput(new ItemStack(ModUtils.getItemByName(TCNames.METALS), 1, 2));//Manyullyn block
		}
		
		if(ConfigMain.enableCreativeModifier)
		{
			//Creative modifier
			RecipeUtil.addRecipe(
					new  ItemStack(ModUtils.getItemByName(TCNames.MATERIALS), 1, 50), 
					"IIRMMMRII",
					"IKKKKKKKI",
					"RKRGGGRKR",
					"MKGGBGGKM",
					"MKGBCBGKM",
					"MKGGBGGKM",
					"RKRGGGRKR",
					"IKKKKKKKI",
					"IIRMMMRII",
					'I', new ItemStack(ModUtils.getItemByName(TCNames.MATERIALS), 1, 16),//Silky jewel
					'R', new ItemStack(ModUtils.getItemByName(TCNames.MATERIALS), 1, 14),//Reinforcement modifier
					'K', new  ItemStack(ModUtils.getItemByName(TCNames.INGOTS), 1, 3),//Knightslime ingot
					'G', new ItemStack(ModUtils.getItemByName(TCNames.EDIBLES), 1, 32), //Purple gelatinous slime drop
					'B', new ItemStack(ModUtils.getItemByName(TCNames.METALS), 1, 2),//Manyullyn block
					'M', new ItemStack(ModUtils.getItemByName(TCNames.MATERIALS), 1, 19),//Mending moss
					'C', ModItems.infinity_catalyst
					);
		}
	}
}
