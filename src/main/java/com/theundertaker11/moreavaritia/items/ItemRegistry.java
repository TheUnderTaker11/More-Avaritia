package com.theundertaker11.moreavaritia.items;

import com.theundertaker11.moreavaritia.items.tools.InfinityMinus1Hoe;
import com.theundertaker11.moreavaritia.items.tools.InfinityMinus1Pick;
import com.theundertaker11.moreavaritia.render.IItemModelProvider;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber
public class ItemRegistry {

	public static Item InfinityHoeM1;
	public static Item InfinityPickM1;
	
	@SubscribeEvent
	public static void init(RegistryEvent.Register<Item> event) {
		InfinityPickM1 = register(event, new InfinityMinus1Pick("infinitympick"));
		InfinityHoeM1 = register(event, new InfinityMinus1Hoe("infinitymhoe"));
	}
	
	private static <T extends Item> T register(RegistryEvent.Register<Item> event, T item) {
		event.getRegistry().register(item);

		if (item instanceof IItemModelProvider) {
			((IItemModelProvider) item).registerItemModel(item);
		}
		return item;
	}
}
