package com.theundertaker11.moreavaritia;

import com.theundertaker11.moreavaritia.compat.CompatMain;

import net.minecraft.init.Blocks;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION, dependencies = "required-after:avaritia", acceptedMinecraftVersions = Reference.MCVersions)//,after:enderio,after:storagedrawers")
public class MoreAvaritiaMain
{
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        ConfigMain.init(config);
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        CompatMain.init();
    }
}
