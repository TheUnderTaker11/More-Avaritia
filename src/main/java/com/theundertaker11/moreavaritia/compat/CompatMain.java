package com.theundertaker11.moreavaritia.compat;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.compat.advsolarpanels.AdvSolarPanelsRecipes;
import com.theundertaker11.moreavaritia.compat.appliedenergistics.AERecipes;
import com.theundertaker11.moreavaritia.compat.botania.BotaniaRecipes;
import com.theundertaker11.moreavaritia.compat.cyberware.CyberwearRecipes;
import com.theundertaker11.moreavaritia.compat.draconicevolution.DraconicEvolutionRecipes;
import com.theundertaker11.moreavaritia.compat.enderio.EnderIORecipes;
import com.theundertaker11.moreavaritia.compat.extrautils2.ExtraUtilitiesRecipes;
import com.theundertaker11.moreavaritia.compat.extremereactors.ExtremeReactorsRecipes;
import com.theundertaker11.moreavaritia.compat.psi.PSIRecipes;
import com.theundertaker11.moreavaritia.compat.quantumflux.QuantumFluxRecipes;
import com.theundertaker11.moreavaritia.compat.refinedstorage.RefinedStorageRecipes;
import com.theundertaker11.moreavaritia.compat.rftools.RFToolsRecipes;
import com.theundertaker11.moreavaritia.compat.simplyjetpacks2.SimplyJetpacksRecipes;
import com.theundertaker11.moreavaritia.compat.storagedrawers.StorageDrawersRecipes;
import com.theundertaker11.moreavaritia.compat.thermal.ThermalRecipes;
import com.theundertaker11.moreavaritia.compat.tinkers.TinkersRecipes;

public class CompatMain {

	public static void init()
	{
		if(ConfigMain.enableAdvSolarPanels)
		{
			try{
				AdvSolarPanelsRecipes.init();
			}catch(NoSuchMethodError e){}
		}
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
		
		if(ConfigMain.enableExtremeReactors)
		{
			try{
				ExtremeReactorsRecipes.init();
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
		
		if(ConfigMain.enableRFTools)
		{
			try{
				RFToolsRecipes.init();
			}catch(NoSuchMethodError e){}
		}
		
		if(ConfigMain.enableSimplyJetpacks)
		{
			try{
				SimplyJetpacksRecipes.init();
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
