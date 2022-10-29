package com.theundertaker11.moreavaritia.compat.storagedrawers;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.recipe.RecipeUtil;

import morph.avaritia.init.ModItems;
import net.minecraft.init.Items;
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
					"    S    ",
					" NDDDDDN ",
					" DNDDDND ",
					" DDNDNDD ",
					"SDDDEDDDS",
					" DDNDNDD ",
					" DNDDDND ",
					" NDDDDDN ",
					"    S    ",
					'N', ModItems.neutron_nugget,
					'S', Items.NETHER_STAR,
					'E', new ItemStack(ModUtils.getItemByName(SDNames.UPGRADE), 1, 4), //Emerald drawer upgrade
					'D', new ItemStack(ModUtils.getItemByName(SDNames.BASIC_DRAWER), 1, 0)//Normal drawer
					);
		}
	}
}
