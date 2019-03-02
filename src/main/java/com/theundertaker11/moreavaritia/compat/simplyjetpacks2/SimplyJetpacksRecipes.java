package com.theundertaker11.moreavaritia.compat.simplyjetpacks2;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.recipe.RecipeUtil;

import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class SimplyJetpacksRecipes {

	private static boolean hasEnderIO = false;
	private static boolean hasThermal = false;

	@Optional.Method(modid = Reference.SimplyJetpacksModID)
	public static void init() {
		if (ConfigMain.enableCreativeJetpack) {
			try {
				testEnderIO();
			} catch (NoSuchMethodError e) {}
			try {
				//testThermal();
			} catch (NoSuchMethodError e) {}
			
			ItemStack thruster = ItemStack.EMPTY;
			ItemStack jetplate = ItemStack.EMPTY;
			ItemStack jetpack = ItemStack.EMPTY;
			if (hasEnderIO) {
				thruster = new ItemStack(ModUtils.getItemByName(SJNames.META_ITEMS), 1, 11);
				jetplate = new ItemStack(ModUtils.getItemByName(SJNames.JETPACK), 1, 9);
				jetpack = new ItemStack(ModUtils.getItemByName(SJNames.JETPACK), 1, 8);
			}/* else if (hasThermal) {
				thruster = new ItemStack(ModUtils.getItemByName(SJNames.META_ITEMS), 1, 16);
				jetplate = new ItemStack(ModUtils.getItemByName(SJNames.META_ITEMS), 1, 7);
				jetpack = new ItemStack(ModUtils.getItemByName(SJNames.JETPACK), 1, 14);
			}*/
			if (hasEnderIO) { //|| (hasThermal)) {
				RecipeUtil.addRecipe(
						new ItemStack(ModUtils.getItemByName(SJNames.JETPACK), 1, 0),
						new Object[]{
								"         ", 
								"   NNN   ", 
								"  NNINN  ", 
								"NNNIPINNN", 
								"MIIPJPIIM", 
								"MTTTPTTTM",
								"MTTTPTTTM", 
								"MTTTPTTTM", 
								"MMMMPMMMM",

								'I', ModItems.infinity_catalyst, 
								'T', thruster,
								'J', jetplate, 
								'P', jetpack,
								'N', ModItems.neutronium_ingot, 
								'M', ModItems.crystal_matrix_ingot});
			}
		}
	}

	@Optional.Method(modid = Reference.EnderIOModID)
	private static void testEnderIO() {
		hasEnderIO = true;
	}

	/*@Optional.Method(modid = Reference.ThermalExpansionModID)
	private static void testThermal() {
		hasThermal = true;
	}*/
}
