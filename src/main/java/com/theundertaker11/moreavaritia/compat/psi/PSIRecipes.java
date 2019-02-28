package com.theundertaker11.moreavaritia.compat.psi;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class PSIRecipes {

	@Optional.Method(modid = Reference.PSIModID)
	public static void init()
	{
		if(ConfigMain.enablePSICatalystItem)
		{
			RecipeUtil.addCatalystInput(new ItemStack(ModUtils.getItemByName(PSINames.DECORATIVE), 1, 2));//Psigem block
		}
		
		if(ConfigMain.enableCreativeCadAssembly)
		{
			//Creative CAD assembly
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(PSINames.CAD_ASSEMBLY), 1, 5), 
					"PRRRBRRRP",
					"RNNNBNNNR",
					"RNBBBBBNR",
					"RNBCICBNR",
					"BBBIAIBBB",
					"RNBCICBNR",
					"RNBBBBBNR",
					"RNNNBNNNR",
					"PRRRBRRRP",
					'A', new ItemStack(ModUtils.getItemByName(PSINames.CAD_ASSEMBLY), 1, 4),//Ivory CAD assembly
					'R', ModItems.redstoneSingularity,
					'P', ModItems.endest_pearl,
					'I', new ItemStack(ModUtils.getItemByName(PSINames.DECORATIVE), 1, 2),//Psigem block
					'N', ModItems.neutronium_ingot,
					'B', ModItems.infinity_ingot,
					'C', new ItemStack(ModBlocks.resource, 1, 1)//Infinity Block
					);
		}
	}
}
