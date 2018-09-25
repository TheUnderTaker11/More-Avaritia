package com.theundertaker11.moreavaritia.compat.thermal;

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

public class ThermalRecipes {

	@Optional.Method(modid = Reference.ThermalExpansionModID)
	public static void init()
	{
		if(ConfigMain.enableThermalCatalystItem)
		{
			RecipeUtil.addCatalystInput(new ItemStack(ModUtils.getItemByName(ThermalNames.STORAGE_BLOCK), 1, 7));
		}
		if(ConfigMain.enableThermalCreativeUpgrade)
		{
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(ThermalNames.UPGRADE), 1, 256), 
					"NNIIIIINN",
					"NNAAAAANN",
					"IAABBBAAI",
					"IABCECBAI",
					"IABEEEBAI",
					"IABCECBAI",
					"IAABBBAAI",
					"NNAAAAANN",
					"NNIIIIINN",
					'I', ModItems.infinity_ingot,
					'N', ModItems.neutronium_ingot,
					'B', new ItemStack(ModBlocks.resource, 1, 1),//Infinity block
					'A', new ItemStack(ModUtils.getItemByName(ThermalNames.AUGMENT), 1, 128),//Secondary reception coil
					'E', new ItemStack(ModUtils.getItemByName(ThermalNames.UPGRADE), 1, 35),//Enderium conversion kit
					'C', ModItems.infinity_catalyst
					);
			
		}
		
		if(ConfigMain.enableThermalCapacitor)
		{
			ItemStack creativeCap = new ItemStack(ModUtils.getItemByName(ThermalNames.CAPACITOR), 1, 32000);
			creativeCap.setTagCompound(new NBTTagCompound());
			creativeCap.getTagCompound().setInteger("Energy", 1210000000);
			RecipeUtil.addRecipe(
					creativeCap, 
					"IIIIRIIII",
					"IDDDRDDDI",
					"IDDDRDDDI",
					"IDDSRSDDI",
					"RRRRFRRRR",
					"IDDSRSDDI",
					"IDDDRDDDI",
					"IDDDRDDDI",
					"IIIIRIIII",
					'I', ModItems.infinity_ingot,
					'R', ModItems.redstoneSingularity,
					'S', ModItems.diamondSingularity,
					'F', new ItemStack(ModUtils.getItemByName(ThermalNames.CAPACITOR), 1, 4),
					'D', new ItemStack(ModUtils.getItemByName(ThermalNames.DYNAMO), 1, 4)
					);
		}
	}
}
