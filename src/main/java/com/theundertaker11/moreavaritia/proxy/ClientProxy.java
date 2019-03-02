package com.theundertaker11.moreavaritia.proxy;

import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.render.RenderRegistry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Reference.MODID + ":" + id, "inventory"));
	}

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		/*ResourceLocation GlassSyringeTextures = new ResourceLocation(Reference.MODID + ":" + "glasssyringefull");
		ResourceLocation MetalSyringeTextures = new ResourceLocation(Reference.MODID + ":" + "metalsyringefull");

		ModelBakery.registerItemVariants(GRItems.GlassSyringe, GlassSyringeTextures);
		ModelBakery.registerItemVariants(GRItems.MetalSyringe, MetalSyringeTextures);
		*/
		RenderRegistry.Render();
	}
}
