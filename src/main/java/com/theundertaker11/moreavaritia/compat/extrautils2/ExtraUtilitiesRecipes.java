package com.theundertaker11.moreavaritia.compat.extrautils2;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import morph.avaritia.recipe.extreme.ExtremeCraftingManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Optional;

public class ExtraUtilitiesRecipes {

	@Optional.Method(modid = Reference.ExtraUtilsModID)
	public static void init()
	{
		ItemStack mill = new ItemStack(ModUtils.getItemByName(ExUtilNames.GP_GEN), 1, 6);
		ItemStack spike = new ItemStack(ModUtils.getItemByName(ExUtilNames.CREATIVE_SPIKE));
		
		if(ConfigMain.enableExUCreativeMill)
		{
			//Creative Mill
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(ExUtilNames.GP_GEN), 1, 6),
					"INNGGGNNI",
					"NIGCCCGIN",
					"NGMWDWMGN",
					"GCWLCLWCG",
					"GCDCZCDCG",
					"GCWLCLWCG",
					"NGMWDWMGN",
					"NIGCCCGIN",
					"INNGGGNNI",
					'I', ModItems.infinity_catalyst,
					'N', ModItems.neutronium_ingot,
					'G', new ItemStack(ModUtils.getItemByName(ExUtilNames.INEFFABLE_GLASS), 1, 2),
					'C', new ItemStack(ModUtils.getItemByName(ExUtilNames.COMPRESSED_COBBLE), 1, 7),//Octuple compressed
					'M', new ItemStack(ModUtils.getItemByName(ExUtilNames.MAGICAL_WOOD), 1, 1),
					'W', new ItemStack(ModUtils.getItemByName(ExUtilNames.GP_GEN), 1, 3),//Water mill
					'D', new ItemStack(ModUtils.getItemByName(ExUtilNames.DECORATIVE), 1, 1),//Demon metal block
					'L', new ItemStack(ModUtils.getItemByName(ExUtilNames.GP_GEN), 1, 2),//Lava mill
					'Z', new ItemStack(ModUtils.getItemByName(ExUtilNames.GP_GEN), 1, 8)//Dragon Egg Mill
					);
		}
		else{
			mill = ModItems.infinity_ingot;
		}
		if(ConfigMain.enableExUCreativeSpikes)
		{
			RecipeUtil.addRecipe(
					spike,
					"IINNNNNII",
					"IDSSSSSDI",
					"NSSTTTSSN",
					"NSTCMCTSN",
					"NSTMKMTSN",
					"NSTCMCTSN",
					"NSSTTTSSN",
					"IDSSSSSDI",
					"IINNNNNII",
					'N', new ItemStack(ModBlocks.resource, 1, 0),
					'I', ModItems.infinity_ingot,
					'D', new ItemStack(ModBlocks.resource, 1, 2),
					'S', new ItemStack(ModUtils.getItemByName(ExUtilNames.DIAMOND_SPIKE)),
					'C', new ItemStack(ModUtils.getItemByName(ExUtilNames.LASSO), 1, 1),
					'T', new ItemStack(ModUtils.getItemByName(ExUtilNames.TRASH)),
					'M', new ItemStack(ModUtils.getItemByName(ExUtilNames.INGREDIENT), 1, 5),//Moonstone
					'K', new ItemStack(ModUtils.getItemByName(ExUtilNames.KIKOKU))
					);
		}
		else{
			spike = new ItemStack(ModBlocks.resource, 1, 1);
		}
		if(ConfigMain.enableExUCreativeDrum)
		{
			//Creative Drum
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(ExUtilNames.DRUM), 1, 4),
					"CIIIIIIIC",
					"IMBBBBBMI",
					"IBOOOOOBI",
					"IBOCCCOBI",
					"IBOCDCOBI",
					"IBOCCCOBI",
					"IBOOOOOBI",
					"IMBBBBBMI",
					"CIIIIIIIC",
					'C', new ItemStack(ModUtils.getItemByName(ExUtilNames.COMPRESSED_COBBLE), 1, 7),//Octuple compressed
					'I', ModItems.infinity_ingot,
					'M', mill,//Creative Mill
					'B', new ItemStack(ModBlocks.resource, 1, 1),//Infinity Block
					'O', new ItemStack(ModUtils.getItemByName(ExUtilNames.OPINIUM), 1, 8),//Perfected opiniom
					'D', new ItemStack(ModUtils.getItemByName(ExUtilNames.DRUM), 1, 3)//Demonic drum
					);
		}
		if(ConfigMain.enableExUCreativeEnergySource)
		{
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(ExUtilNames.CREATIVE_ENERGY)),
					"BOOOOOOOB",//Lol he said boob
					"OBBBBBBBO",
					"OBRRRRRBO",
					"OBRSMSRBO",
					"OBRMMMRBO",
					"OBRSMSRBO",
					"OBRRRRRBO",
					"OBBBBBBBO",
					"BOOOOOOOB",
					'M', mill,
					'B', new ItemStack(ModBlocks.resource, 1, 1),//Infinity Block
					'O', new ItemStack(ModUtils.getItemByName(ExUtilNames.OPINIUM), 1, 8),//Perfected opiniom
					'R', new ItemStack(ModUtils.getItemByName(ExUtilNames.RAINBOW_GEN)),
					'S', spike
					);
		}
	}
}
