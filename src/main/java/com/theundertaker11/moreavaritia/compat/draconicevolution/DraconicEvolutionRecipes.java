package com.theundertaker11.moreavaritia.compat.draconicevolution;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import morph.avaritia.recipe.extreme.ExtremeCraftingManager;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Optional;

public class DraconicEvolutionRecipes {

	@Optional.Method(modid = Reference.DraconicEvolutionModID)
	public static void init()
	{
		if(ConfigMain.enableDEInfinityCatalystItem)
		{
			RecipeUtil.addCatalystInput(new ItemStack(ModUtils.getItemByName(DENames.AWAKENED_CORE), 1));
		}
		
		ItemStack creativeCapacitor = new ItemStack(ModBlocks.resource, 1, 1);
		
		if(ConfigMain.enableDECreativeCapacitor)
		{
			//Creative Flux capacitor
			creativeCapacitor = new ItemStack(ModUtils.getItemByName(DENames.CAPACITOR), 1, 2);
			creativeCapacitor.setTagCompound(new NBTTagCompound());
			creativeCapacitor.getTagCompound().setInteger("Energy", 1073000000);
			RecipeUtil.addRecipe(
					creativeCapacitor, 
					"IIIISIIII",
					"ICCFSFCCI",
					"ICFDSDFCI",
					"IFDDSDDFI",
					"SSSSRSSSS",
					"IFDDSDDFI",
					"ICFDSDFCI",
					"ICCFSFCCI",
					"IIIISIIII",
					'I', ModItems.infinity_ingot,
					'S', new ItemStack(ModUtils.getItemByName(DENames.REACTOR_PART), 1, 0),//Reactor stabilizer
					'C', new ItemStack(ModUtils.getItemByName(DENames.CHAOTIC_CORE), 1),
					'D', new ItemStack(ModUtils.getItemByName(DENames.CAPACITOR), 1, 1),//Draconic flux capacitor
					'R', new ItemStack(ModUtils.getItemByName(DENames.REACTOR_CORE), 1),
					'F', new ItemStack(ModUtils.getItemByName(DENames.CRAFTING_INJECTOR), 1, 3)//Chaotic fusion crafting injectorr
					);
		}
		if(ConfigMain.enableDECreativeRFSource)
		{
			//Creative RF source
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(DENames.RF_SOURCE)), 
					"BBSSSSSBB",
					"BBBBBBBBB",
					"SBIIIIIBS",
					"SBISDSIBS",
					"SBIDRDIBS",
					"SBISDSIBS",
					"SBIIIIIBS",
					"BBBBBBBBB",
					"BBSSSSSBB",
					'I', ModItems.infinity_ingot,
					'S', new ItemStack(ModUtils.getItemByName(DENames.REACTOR_PART), 1, 0),//Reactor stabilizer
					'B', new ItemStack(ModBlocks.resource, 1, 1),//Infinity Block
					'D', creativeCapacitor,
					'R', new ItemStack(ModUtils.getItemByName(DENames.REACTOR_CORE), 1),
					'F', new ItemStack(ModUtils.getItemByName(DENames.CRAFTING_INJECTOR), 1, 3)//Chaotic fusion crafting injectorr
					);
		}
	}
}
