package com.theundertaker11.moreavaritia.compat.refinedstorage;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import morph.avaritia.recipe.extreme.ExtremeCraftingManager;
import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.Optional;

public class RefinedStorageRecipes {
/* For copy pasting
	ExtremeCraftingManager.getInstance().addRecipe(
			new ItemStack(), 
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			
			);
*/
	@Optional.Method(modid = Reference.RefinedStorageModID)
	public static void init()
	{
		if(ConfigMain.enableRSInfinityCatalystItem)
		{
			RecipeUtil.addCatalystInput(new ItemStack(ModUtils.getItemByName(RSNames.STORAGE_PART), 1, 3));
		}
		if(ConfigMain.enableRSWirelessGrid)
		{
			//Creative Wireless Grid
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(RSNames.WIRELESS_GRID), 1, 1), 
					"         ",
					"         ",
					" UWWWWWU ",
					" WDDGCCW ",
					" WRGPGTW ",
					" WDDGCCW ",
					" UWWWWWU ",
					"         ",
					"         ",
					'P', ModItems.endest_pearl,
					'G', new ItemStack(ModUtils.getItemByName(RSNames.WIRELESS_GRID), 1, 0),//Non creative grid
					'D', new ItemStack(ModUtils.getItemByName(RSNames.CORE), 1, 1),//Destruction core
					'C', new ItemStack(ModUtils.getItemByName(RSNames.CORE), 1, 0),//Construction core
					'R', new ItemStack(ModUtils.getItemByName(RSNames.RECEIVER), 1),
					'T', new ItemStack(ModUtils.getItemByName(RSNames.TRANSMITTER), 1),
					'U', new ItemStack(ModUtils.getItemByName(RSNames.UPGRADE), 1, 1),//Range upgrade
					'W', new ItemStack(ModUtils.getItemByName(RSNames.WIRELESS_TRANSMITTER), 1));
		}
		
		if(ConfigMain.enableRSController)
		{
			//Creative Controller
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(RSNames.CONTROLLER), 1, 1),
					"INNNANNNI",
					"NFFFAFFFN",
					"NFFIAIFFN",
					"NFIICIIFN",
					"AAACCCAAA",
					"NSIICIISN",
					"NSSIAISSN",
					"NSSSASSSN",
					"INNNANNNI",
					'C', new ItemStack(ModUtils.getItemByName(RSNames.CONTROLLER), 1, 0),//Regular controller
					'A', new ItemStack(ModUtils.getItemByName(RSNames.PROCESSOR), 1, 5),//Advanced proccessor
					'N', ModItems.neutronium_ingot,
					'I', ModItems.infinity_ingot,
					'S', new ItemStack(ModUtils.getItemByName(RSNames.STORAGE_PART), 1, 3),//64k item storage
					'F', new ItemStack(ModUtils.getItemByName(RSNames.FLUID_STORAGE_PART), 1, 3)//512k fluid storage
					);
		}
		//If storage disk and controller recipe are enabled, it uses the controller in this recipe
		if(ConfigMain.enableRSStorageDisk&&ConfigMain.enableRSController)
		{
			//Creative Storage Disk
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(RSNames.STORAGE_DISK), 1, 4),
					"CIIINIIIC",
					"IIIINIIII",
					"IIIINIIII",
					"IIISCSIII",
					"NNNCSCNNN",
					"IIISCSIII",
					"IIIINIIII",
					"IIIINIIII",
					"CIIINIIIC",
					'C', new ItemStack(ModUtils.getItemByName(RSNames.CONTROLLER), 1, 1),//Creative controller
					'I', new ItemStack(ModBlocks.resource, 1, 1),//Infinity Block
					'N', new ItemStack(ModBlocks.neutronium_compressor, 1),
					'S', new ItemStack(ModUtils.getItemByName(RSNames.STORAGE_PART), 1, 3)//64k item storage
					);
		}
		//If storage disk is enable but the controller recipe isn't, substitutes another block
		else if(ConfigMain.enableRSStorageDisk&&!ConfigMain.enableRSController)
		{
			//Still creative storage disk
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(RSNames.STORAGE_DISK), 1, 4),
					"CIIINIIIC",
					"IIIINIIII",
					"IIIINIIII",
					"IIISISIII",
					"NNNISINNN",
					"IIISISIII",
					"IIIINIIII",
					"IIIINIIII",
					"IIIINIIII",
					'I', new ItemStack(ModBlocks.resource, 1, 1),//Infinity Block
					'N', new ItemStack(ModBlocks.neutronium_compressor, 1),
					'S', new ItemStack(ModUtils.getItemByName(RSNames.STORAGE_PART), 1, 3)//64k item storage
					);
		}
		
		if(ConfigMain.enableRSFluidStorageDisk&&ConfigMain.enableRSController)
		{
			//Creative Storage Disk
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(RSNames.FLUID_STORAGE_DISK), 1, 4),
					"CIIINIIIC",
					"IIIINIIII",
					"IIIINIIII",
					"IIISCSIII",
					"NNNCSCNNN",
					"IIISCSIII",
					"IIIINIIII",
					"IIIINIIII",
					"CIIINIIIC",
					'C', new ItemStack(ModUtils.getItemByName(RSNames.CONTROLLER), 1, 1),//Creative controller
					'I', new ItemStack(ModBlocks.resource, 1, 1),//Infinity Block
					'N', new ItemStack(ModBlocks.neutronium_compressor, 1),
					'S', new ItemStack(ModUtils.getItemByName(RSNames.FLUID_STORAGE_PART), 1, 3)//64k item storage
					);
		}
		else if(ConfigMain.enableRSStorageDisk&&!ConfigMain.enableRSController)
		{
			//Still creative storage disk
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(RSNames.FLUID_STORAGE_DISK), 1, 4),
					"CIIINIIIC",
					"IIIINIIII",
					"IIIINIIII",
					"IIISISIII",
					"NNNISINNN",
					"IIISISIII",
					"IIIINIIII",
					"IIIINIIII",
					"IIIINIIII",
					'I', new ItemStack(ModBlocks.resource, 1, 1),//Infinity Block
					'N', new ItemStack(ModBlocks.neutronium_compressor, 1),
					'S', new ItemStack(ModUtils.getItemByName(RSNames.FLUID_STORAGE_PART), 1, 3)//64k item storage
					);
		}
	}
}
