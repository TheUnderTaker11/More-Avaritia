package com.theundertaker11.moreavaritia.compat.thaumcraft;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.compat.storagedrawers.SDNames;
import com.theundertaker11.moreavaritia.recipe.RecipeUtil;

import morph.avaritia.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class ThaumcraftRecipes {

	@Optional.Method(modid = Reference.ThaumcraftModID)
	public static void init()
	{
		if(ConfigMain.enableCreativeFluxSponge)
		{
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(ThaumcraftNames.FLUX_SPONGE), 1),
					
					"XXXXXXXXX",
					"XVMBBBMVX",
					"XMBCCCBMX",
					"XBCTSTCBX",
					"XBCSISCBX",
					"XBCTSTCBX",
					"XMBCCCBMX",
					"XVMBBBMVX",
					"XXXXXXXXX",
					/*
					"         ",
					"         ",
					"         ",
					"         ",
					"IIIIIIIII",
					"         ",
					"         ",
					"         ",
					"         ",*/
					'I', ModItems.infinity_ingot,
					'S', new ItemStack(Blocks.SPONGE, 1),
					'X', new ItemStack(ModUtils.getItemByName(ThaumcraftNames.SOAP), 1),
					'B', new ItemStack(ModUtils.getItemByName(ThaumcraftNames.VOID_METAL_BLOCK), 1),
					'V', new ItemStack(ModUtils.getItemByName(ThaumcraftNames.VOIDSEER_CHARM), 1),
					'M', new ItemStack(ModUtils.getItemByName(ThaumcraftNames.SALIS_MUNDUS), 1),
					'C', new ItemStack(ModUtils.getItemByName(ThaumcraftNames.CAUSALITY_COLLAPSER), 1),
					'T', new ItemStack(ModUtils.getItemByName(ThaumcraftNames.UNDYING_CHARM), 1)

					);
		}
	}
}
