package com.theundertaker11.moreavaritia.compat.storagedrawers;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.recipe.extreme.ExtremeCraftingManager;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class StorageDrawersRecipes {

	@Optional.Method(modid = Reference.StorageDrawersModID)
	public static void init()
	{
		if(ConfigMain.enableCreativeStorageUpgrade)
		{
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(SDNames.CREATIVE_UPGRADE), 1, 0), 
					"         ",
					" NEEDEEN ",
					" ENDDDNE ",
					" EDNENDE ",
					" DDENEDD ",
					" EDNENDE ",
					" ENDDDNE ",
					" NEEDEEN ",
					"         ",
					'N', morph.avaritia.init.ModItems.neutronium_ingot,
					'E', new ItemStack(ModUtils.getItemByName(SDNames.UPGRADE), 1, 4), //Emerald drawer upgrade
					'D', new ItemStack(ModUtils.getItemByName(SDNames.BASIC_DRAWER), 1)//Basic Drawer
					);
		}
	}
}
