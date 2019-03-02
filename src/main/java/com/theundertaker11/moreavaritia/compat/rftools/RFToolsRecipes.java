package com.theundertaker11.moreavaritia.compat.rftools;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.recipe.RecipeUtil;

import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class RFToolsRecipes {

	@Optional.Method(modid = Reference.RFToolsModID)
	public static void init() {
		if (ConfigMain.enableCreativePowercell) {
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(RFToolsNames.CREATIVE_POWERCELL)),
					new Object[]{
							"NNNNNNNNN", 
							"NMIIIIIMN", 
							"NIAAAAAIN", 
							"NIARDRAIN", 
							"NIADPDAIN", 
							"NIARDRAIN",
							"NIAAAAAIN", 
							"NMIIIIIMN", 
							"BBBBBBBBB",

							'A', new ItemStack(ModUtils.getItemByName(RFToolsNames.ADV_POWERCELL)),
							'I', ModItems.infinity_ingot, 
							'M', ModItems.crystal_matrix_ingot, 
							'N', ModItems.neutronium_ingot,
							'R', ModItems.redstoneSingularity, 
							'B', new ItemStack(ModUtils.getItemByName(RFToolsNames.BOOSTER)), 
							'D', new ItemStack(ModUtils.getItemByName(RFToolsNames.INFUSED_DIAMOND)), 
							'P', ModItems.endest_pearl});
		}
		/*if (ConfigMain.enableDimShardRecipe) {
			IRecipe dimShard = new ShapedOreRecipe(new ItemStack(ModUtils.getItemByName("rftools:dimensional_shard")),
					new Object[]{" x ", "xyx", " x ", 'x'), "gemDiamond", 'y'),
							"gemEmerald"});
			GameRegistry.addRecipe(dimShard);
		}*/
	}
}
