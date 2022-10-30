package com.theundertaker11.moreavaritia.recipe;

import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.Avaritia;
import morph.avaritia.init.ModItems;
import morph.avaritia.recipe.AvaritiaRecipeManager;
import morph.avaritia.recipe.extreme.ExtremeShapedRecipe;
import morph.avaritia.recipe.extreme.IExtremeRecipe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.CraftingHelper.ShapedPrimer;

public class RecipeUtil {
	
	public static void addRecipe(ItemStack result, Object...objects) {
		Object[] list = new Object[objects.length + 1];
		list[0] = (Object) false;
		System.arraycopy(objects, 0, list, 1, objects.length);
		
		ShapedPrimer primer = CraftingHelper.parseShaped(list);
		primer.mirrored = false;
		
		ExtremeShapedRecipe recipe = new ExtremeShapedRecipe(result, primer);
		ResourceLocation key = result.getItem().getRegistryName();
		AvaritiaRecipeManager.EXTREME_RECIPES.put(key, recipe.setRegistryName(key));
	}
	
	public static void addCatalystInput(ItemStack stack) {
		//ResourceLocation loc = new ResourceLocation(Avaritia.MOD_ID, "items/infinity_catalyst");
		IExtremeRecipe recipe = AvaritiaRecipeManager.EXTREME_RECIPES.get(new ResourceLocation(Reference.InfinityCatalystResourceLocationString));
		if(recipe != null) {
			recipe.getIngredients().add(CraftingHelper.getIngredient(stack));
		}
	}

}
