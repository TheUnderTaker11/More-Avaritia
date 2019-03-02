package com.theundertaker11.moreavaritia;

import com.theundertaker11.moreavaritia.compat.CompatMain;
import com.theundertaker11.moreavaritia.items.ItemRegistry;
import com.theundertaker11.moreavaritia.proxy.CommonProxy;
import com.theundertaker11.moreavaritia.recipe.CraftingManagerMain;

import appeng.core.CreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Reference.MODID, version = Reference.VERSION, dependencies = "required-after:avaritia", acceptedMinecraftVersions = Reference.MCVersions)//,after:enderio,after:storagedrawers")
public class MoreAvaritiaMain
{
	CreativeTabs tab = new MATab(CreativeTabs.getNextID(), "MATab");
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        ConfigMain.init(config);
        //ItemRegistry.init();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        CompatMain.init();
        CraftingManagerMain.init();
    }
}

class MATab extends CreativeTabs {
    
	public MATab(int p1, String kstab) {
        super(p1, kstab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemRegistry.InfinityPickM1);
    }
}
