package com.theundertaker11.moreavaritia.compat.extremereactors;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.compat.psi.PSINames;
import com.theundertaker11.moreavaritia.recipe.RecipeUtil;

import morph.avaritia.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class ExtremeReactorsRecipes {

	@Optional.Method(modid = Reference.ExtremeReactorsModID)
	public static void init() {
		if (ConfigMain.enableERCreativeCoolantPort) {
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(ERNames.CREATIVE_COOLANT_PORT)),
					new Object[]{
							"    N    ", 
							"   NWN   ", 
							"  NWBWN  ", 
							" NWBDBWN ", 
							"NWBDPDBWN", 
							" NWBDBWN ",
							"  NWBWN  ", 
							"   NWN   ", 
							"    N    ",

							'D', ModItems.diamond_lattice, 
							'N', ModItems.neutron_pile, 
							'W', Items.WATER_BUCKET,
							'B', new ItemStack(ModUtils.getItemByName(ERNames.BEN_MINERAL)),
							'P', new ItemStack(ModUtils.getItemByName(ERNames.COOLANT_PORT))});
		}
		if (ConfigMain.enableERCreativeSteamGen) {
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(ERNames.CREATIVE_STEAM_GEN)),
					new Object[]{
							"GNNNNNNNG", 
							"NOOOIOOON", 
							"NOLLLLLON", 
							"NOLILILON", 
							"NILLTLLIN", 
							"NOLILILON",
							"NOLLLLLON", 
							"NOOOIOOON", 
							"GNNNNNNNG",

							'G', ModItems.goldSingularity, 
							'N', ModItems.neutronium_ingot, 
							'I', ModItems.infinity_ingot,
							'L', new ItemStack(ModUtils.getItemByName(ERNames.LUDICRITE)),
							'O', new ItemStack(ModUtils.getItemByName(ERNames.ANGLESITE)),
							'T', new ItemStack(ModUtils.getItemByName(ERNames.TURBINE_BEARING))});
		}
	}
}
