package com.theundertaker11.moreavaritia;

import net.minecraftforge.common.config.Configuration;

public class ConfigMain {
	
	public static boolean enableAE;
	public static boolean enableAECatalystItem;
	public static boolean enableAEEnergyCell;
	
	public static boolean enableBotania;
	public static boolean enableBotaniaCatalystItem;
	public static boolean enableCreativeManaPool;
	public static boolean enableCreativeManaTablet;
	
	public static boolean enableCyberwear;
	public static boolean enableCyberwearCreativeCapacitor;
	
	public static boolean enableDE;
	public static boolean enableDEInfinityCatalystItem;
	public static boolean enableDECreativeCapacitor;
	public static boolean enableDECreativeRFSource;
	
	public static boolean enableEnderIO;
	public static boolean enableEnderIOCatalystItem;
	public static boolean enableCreativeCapBank;
	
	public static boolean enableExtraUtilities;
	public static boolean enableExUCreativeMill;
	public static boolean enableExUCreativeSpikes;
	public static boolean enableExUCreativeEnergySource;
	public static boolean enableExUCreativeDrum;
	
	public static boolean enablePSI;
	public static boolean enablePSICatalystItem;
	public static boolean enableCreativeCadAssembly;
	
	public static boolean enableQuantumFlux;
	public static boolean enableQuantumFluxCatalystItem;
	public static boolean enableCreativeQuibitCluster;
	
	public static boolean enableRS;
	public static boolean enableRSController;
	public static boolean enableRSWirelessGrid;
	public static boolean enableRSStorageDisk;
	public static boolean enableRSFluidStorageDisk;
	public static boolean enableRSInfinityCatalystItem;
	
	public static boolean enableStorageDrawers;
	public static boolean enableCreativeStorageUpgrade;
	
	public static boolean enableThermalExpansion;
	public static boolean enableThermalCatalystItem;
	public static boolean enableThermalCapacitor;
	public static boolean enableThermalCreativeUpgrade;
	
	public static boolean enableTinkers;
	public static boolean enableTinkersCatalystItem;
	public static boolean enableCreativeModifier;
	
	public static void init(Configuration config)
	{
		config.load();
		
		//Start master switch config.
		final String MASTER = "A Master Config";
		config.addCustomCategoryComment(MASTER, "Set any values to false to disable all interactions with that mod. Disabling a mod here will make all other config options releating to it pointless.");
		enableAE = config.getBoolean("Applied Energistics 2", MASTER, true, "");
		enableBotania = config.getBoolean("Botania", MASTER, true, "");
		enableCyberwear = config.getBoolean("Cyberware", MASTER, true, "");
		enableDE = config.getBoolean("Draconic Evolution", MASTER, true, "");
		enableEnderIO = config.getBoolean("EnderIO", MASTER, true, "");
		enableExtraUtilities = config.getBoolean("Extra Utilities", MASTER, true, "");
		enablePSI = config.getBoolean("PSI", MASTER, true, "");
		enableQuantumFlux = config.getBoolean("Quantum Flux", MASTER, true, "");
		enableRS = config.getBoolean("Refined Storage", MASTER, true, "");
		enableStorageDrawers = config.getBoolean("Storage Drawers", MASTER, true, "");
		enableThermalExpansion = config.getBoolean("Thermal Expansion", MASTER, true, "");
		enableTinkers = config.getBoolean("Tinkers Construct", MASTER, true, "");
		
		//Start config for adding items to the infinity catalyst recipe
		final String INF = "AB Infinity Catalyst Items";
		config.addCustomCategoryComment(INF, "Set any values to false to stop this mod from adding an item to the infinty catalyst.");
		enableAECatalystItem = config.getBoolean("Applied Energistics 2", INF, true, "");
		enableBotaniaCatalystItem = config.getBoolean("Botania", INF, true, "");
		enableDEInfinityCatalystItem = config.getBoolean("Draconic Evolution", INF, true, "");
		enableEnderIOCatalystItem = config.getBoolean("EnderIO", INF, true, "");
		enablePSICatalystItem = config.getBoolean("PSI", INF, true, "");
		enableRSInfinityCatalystItem = config.getBoolean("Refined Storage", INF, true, "");
		enableThermalCatalystItem = config.getBoolean("Thermal Expansion/Foundation", INF, true, "");
		enableTinkersCatalystItem = config.getBoolean("Tinkers Construct", INF, true, "");
		
		enableQuantumFluxCatalystItem = config.getBoolean("Quantum Flux", INF, false, "");
		
		//Start Applied Energistics 2
		final String AE = "Applied Energistics 2 Config";
		enableAEEnergyCell = config.getBoolean("Enable Creative Energy Cell", AE, true, "Keep in mind this can only be used to power your applied energistics system, no other machines or anything.");
		
		//Start Botania
		final String B = "Botania Config";
		enableCreativeManaPool = config.getBoolean("Enable Guilty Pool recipe", B, true, "");
		enableCreativeManaTablet = config.getBoolean("Enable Creative Mana Tablet", B, true, "Disabling this will automatically disable the Guilty Pool recipe.");
		
		//Start Cyberwear
		final String CYBER = "Cyberwear Config";
		enableCyberwearCreativeCapacitor = config.getBoolean("Enable Creative Capacitor recipe", CYBER, true, "Currently Doesn't work.");
		
		//Start Draconic Evolution
		final String DE = "Draconic Evolution Config";
		enableDECreativeCapacitor = config.getBoolean("Enable Creative Flux Capacitor recipe", DE, true, "");
		enableDECreativeRFSource = config.getBoolean("Enable Creative RF Source recipe", DE, true, "");
		//Start EnderIO
		final String ENDERIO = "EnderIO Config";
		enableCreativeCapBank = config.getBoolean("Enable Creative Capacitor Bank recipe", ENDERIO, true, "");
		
		//Start Extra Utilities
		final String EU = "Extra Utilities Config";
		config.addCustomCategoryComment(EU, "All blocks in this mod can only be broken with world breaker. (Might have changed in later version of ExUtilities!");
		enableExUCreativeMill = config.getBoolean("Enable Creative Mill recipe", EU, true, "Block that generates 10k GP");
		enableExUCreativeEnergySource = config.getBoolean("Enable Creative Energy Source recipe", EU, true, "");
		enableExUCreativeSpikes = config.getBoolean("Enable Creative Spikes recipe", EU, true, "");
		enableExUCreativeDrum = config.getBoolean("Enable Creative Drum recipe", EU, true, "");
		
		//Start PSI
		final String PSI = "PSI Config";
		enableCreativeCadAssembly = config.getBoolean("Enable Creative CAD Assembly recipe", PSI, true, "");
		
		//Start Quantum Flux
		final String QF = "Quantum Flux Config";
		enableCreativeQuibitCluster = config.getBoolean("Enable Creative Quibit Cluster recipe", QF, true, "");
		//Start Refined Storage
		final String RS = "Refined Storage Config";
		enableRSController = config.getBoolean("Enable Creative Controller recipe", RS, true, "Disabling this will make the recipe for Creative disk a bit easier if they are still enabled.");
		enableRSWirelessGrid = config.getBoolean("Enable Creative Wireless Grid recipe", RS, true, "");
		enableRSStorageDisk = config.getBoolean("Enable Creative Storage Disk recipe", RS, true, "Look at recipe before disabling, it is rough.");
		enableRSFluidStorageDisk = config.getBoolean("Enable Creative Fluid Storage Disk recipe", RS, true, "Look at recipe before disabling, it is rough.");
		
		//Start Storage Drawers
		final String SD = "Storage Drawers Config";
		enableCreativeStorageUpgrade = config.getBoolean("Enable Creative Storage Upgrade recipe", SD, true, "Doesn't allow infinite pulling from the drawer, only practically infinite storage.");
		
		//Start Thermal Expansion
		final String TE = "Thermal Expansion Config";
		enableThermalCapacitor = config.getBoolean("Enable Creative Capacitor recipe", TE, true, "");
		enableThermalCreativeUpgrade = config.getBoolean("Enable Creative Upgrade recipe", TE, true, "Machines upgraded with this can only be broken using the world breaker.");
		
		//Start Tinkers
		final String TIC = "Tinkers Construct Config";
		enableCreativeModifier = config.getBoolean("Enable Creative Modifier recipe", TIC, true, "");
		
		
		config.save();
	}

}
