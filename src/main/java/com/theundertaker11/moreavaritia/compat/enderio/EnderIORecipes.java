package com.theundertaker11.moreavaritia.compat.enderio;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class EnderIORecipes {

	@Optional.Method(modid = Reference.EnderIOModID)
	public static void init()
	{
		if(ConfigMain.enableEnderIOCatalystItem)
		{
			//RecipeUtil.addCatalystInput(new ItemStack(ModUtils.getItemByName(EnderIONames.DIM_TRANSCEIVER), 1));
		}
		
		if(ConfigMain.enableCreativeCapBank)
		{
			//Creative Capacitor Bank
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(EnderIONames.CAP_BANK), 1, 0),
					"INIIIIINI",
					"NZEEEEEZN",
					"IECWWWCEI",
					"IEWZIZWEI",
					"IEWIVIWEI",
					"IEWZIZWEI",
					"IECWWWCEI",
					"NZEEEEEZN",
					"INIIIIINI",
					'I', ModItems.infinity_ingot,
					'N', ModItems.neutronium_ingot,
					'W', new ItemStack(ModUtils.getItemByName(EnderIONames.MATERIAL), 1, 18),//weather crystal
					'V', new ItemStack(ModUtils.getItemByName(EnderIONames.CAP_BANK), 1, 3),//Vibrant capacitor bank
					'Z', new ItemStack(ModUtils.getItemByName(EnderIONames.MATERIAL), 1, 42),//Frank'n'zombie
					'E', new ItemStack(ModUtils.getItemByName(EnderIONames.MATERIAL), 1, 44),//Sentient ender
					'C', new ItemStack(ModUtils.getItemByName(EnderIONames.MATERIAL), 1, 16)//Ender Crystal
					);
		}
	}
}
