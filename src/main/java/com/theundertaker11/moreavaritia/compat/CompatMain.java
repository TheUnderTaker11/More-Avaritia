package com.theundertaker11.moreavaritia.compat;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.compat.appliedenergistics.AERecipes;
import com.theundertaker11.moreavaritia.compat.botania.BotaniaRecipes;
import com.theundertaker11.moreavaritia.compat.cyberware.CyberwearRecipes;
import com.theundertaker11.moreavaritia.compat.draconicevolution.DraconicEvolutionRecipes;
import com.theundertaker11.moreavaritia.compat.enderio.EnderIORecipes;
import com.theundertaker11.moreavaritia.compat.extrautils2.ExtraUtilitiesRecipes;
import com.theundertaker11.moreavaritia.compat.psi.PSIRecipes;
import com.theundertaker11.moreavaritia.compat.quantumflux.QuantumFluxRecipes;
import com.theundertaker11.moreavaritia.compat.refinedstorage.RefinedStorageRecipes;
import com.theundertaker11.moreavaritia.compat.storagedrawers.StorageDrawersRecipes;
import com.theundertaker11.moreavaritia.compat.thermal.ThermalNames;
import com.theundertaker11.moreavaritia.compat.thermal.ThermalRecipes;
import com.theundertaker11.moreavaritia.compat.tinkers.TinkersRecipes;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CompatMain {

	public static void init()
	{
		RecipeUtil.addRecipe(
				new ItemStack(ModUtils.getItemByName(ThermalNames.UPGRADE), 1, 256), 
				"AAAAAAAAA",
				"AAAAAAAAA",
				"AAAAAAAAA",
				"AAAAAAAAA",
				"AAAAAAAAA",
				"AAAAAAAAA",
				"AAAAAAAAA",
				"AAAAAAAAA",
				"AAAAAAAAA",
				'A', Items.IRON_INGOT
				);
		
		if(ConfigMain.enableAE)
		{
			try{
				AERecipes.init();
			}catch(NoSuchMethodError e){}
		}
		
		if(ConfigMain.enableBotania)
		{
			try{
				BotaniaRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		if(ConfigMain.enableCyberwear)
		{
			try{
				CyberwearRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		if(ConfigMain.enableDE)
		{
			try{
				DraconicEvolutionRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		
		if(ConfigMain.enableEnderIO)
		{
			try{
				EnderIORecipes.init();
			}catch(NoSuchMethodError e){}
		}
		
		if(ConfigMain.enableExtraUtilities)
		{
			try{
				ExtraUtilitiesRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		if(ConfigMain.enablePSI)
		{
			try{
				PSIRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		
		if(ConfigMain.enableQuantumFlux)
		{
			try{
				QuantumFluxRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		if(ConfigMain.enableRS)
		{
			try{
				RefinedStorageRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		
		if(ConfigMain.enableStorageDrawers)
		{
			try{
				StorageDrawersRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		
		if(ConfigMain.enableThermalExpansion)
		{
			try{
				ThermalRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		if(ConfigMain.enableTinkers)
		{
			try{
				TinkersRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		
	}
}
