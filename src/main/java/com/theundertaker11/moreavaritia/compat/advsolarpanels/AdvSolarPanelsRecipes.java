package com.theundertaker11.moreavaritia.compat.advsolarpanels;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class AdvSolarPanelsRecipes {

	@Optional.Method(modid = Reference.AdvancedSolarPanelsModID)
	public static void init() {
		if (ConfigMain.enableQuantumGenerator) {
			RecipeUtil.addRecipe(new ItemStack(ModUtils.getItemByName(AdvSolarNames.MACHINES), 1, 1),
							new Object[]{
									"IMMMQMMMI", 
									"MIDDQDDIM", 
									"MDQQQQQDM", 
									"MDQPIPQDM", 
									"QQQINIQQQ", 
									"MDQPIPQDM",
									"MDQQQQQDM", 
									"MIDDQDDIM", 
									"IMMMQMMMI",
									'Q', new ItemStack(ModUtils.getItemByName(AdvSolarNames.MACHINES), 1, 5),
									'I', ModItems.infinity_ingot, 
									'D', ModItems.diamondSingularity, 
									'P', new ItemStack(ModBlocks.resource, 1, 1),//Infinity Block
									'N', new ItemStack(ModUtils.getItemByName(Ic2Names.TE), 1, 22), 
									'M', new ItemStack(ModUtils.getItemByName(Ic2Names.TE), 1, 75)});
		}
	}
}
