package com.theundertaker11.moreavaritia.items;

import com.theundertaker11.moreavaritia.items.tools.BalancedInfinitySword;
import com.theundertaker11.moreavaritia.items.tools.InfinityM1Hoe;
import com.theundertaker11.moreavaritia.items.tools.InfinityM1Pick;
import com.theundertaker11.moreavaritia.items.tools.InfinityM1Sword;
import com.theundertaker11.moreavaritia.render.IItemModelProvider;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class ItemRegistry {

	public static Item InfinityM1Hoe;
	public static Item InfinityM1Pick;
	public static Item InfinityM1Sword;
	public static Item BalancedInfinitySword;
	
	@SubscribeEvent
	public static void init(RegistryEvent.Register<Item> event) {
		InfinityM1Pick = register(event, new InfinityM1Pick("infinitympick"));
		InfinityM1Hoe = register(event, new InfinityM1Hoe("infinitymhoe"));
		InfinityM1Sword = register(event, new InfinityM1Sword("infinitymsword"));
		BalancedInfinitySword = register(event, new BalancedInfinitySword("balancedinfinitysword"));
	}
	
	private static <T extends Item> T register(RegistryEvent.Register<Item> event, T item) {
		event.getRegistry().register(item);

		if (item instanceof IItemModelProvider) {
			((IItemModelProvider) item).registerItemModel(item);
		}
		return item;
	}
}
