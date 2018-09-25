package com.theundertaker11.moreavaritia.compat.botania;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.RecipeUtil;
import com.theundertaker11.moreavaritia.Reference;

import morph.avaritia.recipe.extreme.ExtremeCraftingManager;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Optional;

public class BotaniaRecipes {

	@Optional.Method(modid = Reference.BotaniaModID)
	public static void init()
	{
		if(ConfigMain.enableBotaniaCatalystItem)
		{
			RecipeUtil.addCatalystInput(new ItemStack(ModUtils.getItemByName(BotaniaNames.RESOURCE), 1, 14));
		}
		
		if(ConfigMain.enableCreativeManaPool&&ConfigMain.enableCreativeManaTablet)
		{
			ItemStack tablet = new ItemStack(ModUtils.getItemByName(BotaniaNames.TABLET));
			tablet.setTagCompound(new NBTTagCompound());
			tablet.getTagCompound().setBoolean("creative", true);
			tablet.getTagCompound().setInteger("mana", 500000);
			//Creative Mana pool
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(BotaniaNames.POOL), 1, 1), 
					"PPPPPPPPP",
					"FBIIIIIBF",
					"FIINNNIIF",
					"FINNNNNIF",
					"FINNMNNIF",
					"FINNNNNIF",
					"FIINNNIIF",
					"FBIIIIIBF",
					"FFFFFFFFF",
					'I', morph.avaritia.init.ModItems.infinity_ingot,
					'N', morph.avaritia.init.ModItems.neutronium_ingot,
					'P', ModUtils.getItemByName(BotaniaNames.POOL),
					'F', new ItemStack(ModUtils.getItemByName(BotaniaNames.POOL), 1, 3),
					'B', new ItemStack(ModUtils.getItemByName(BotaniaNames.STORAGE), 1, 4),//Terrasteel block
					'M', tablet
					);
		}
		if(ConfigMain.enableCreativeManaTablet)
		{
			ItemStack tablet = new ItemStack(ModUtils.getItemByName(BotaniaNames.TABLET));
			tablet.setTagCompound(new NBTTagCompound());
			tablet.getTagCompound().setBoolean("creative", true);
			tablet.getTagCompound().setInteger("mana", 500000);
			//Creative Mana Tablet
			RecipeUtil.addRecipe(
					tablet, 
					"ZIIIYIIIX",
					"IPPGTSPPI",
					"IPBBEBBPI",
					"IOBLMLBRI",
					"QBEMAMEBU",
					"IDBLMLBDI",
					"IPBBEBBPI",
					"IPPDBDPPI",
					"FIIIVIIIW",
					'Z', new ItemStack(ModUtils.getItemByName(BotaniaNames.RUNE), 1, 14),//Envy
					'Y', new ItemStack(ModUtils.getItemByName(BotaniaNames.RUNE), 1, 10),//Gluttany
					'X', new ItemStack(ModUtils.getItemByName(BotaniaNames.RUNE), 1, 7),//Winter
					'I', morph.avaritia.init.ModItems.infinity_ingot,
					'P', new ItemStack(ModUtils.getItemByName(BotaniaNames.POOL), 1, 3),//Fabulous mana pool
					'G', ModUtils.getItemByName(BotaniaNames.GRISAIA_FRUIT),
					'T', ModUtils.getItemByName(BotaniaNames.FLIGHT_ITEM),
					'S', ModUtils.getItemByName(BotaniaNames.KING_KEY),
					'B', new ItemStack(ModUtils.getItemByName(BotaniaNames.STORAGE), 1, 1),//Terrasteel block
					'E', ModUtils.getItemByName(BotaniaNames.FLUGEL_EYE),
					'O', ModUtils.getItemByName(BotaniaNames.ODIN),
					'R', ModUtils.getItemByName(BotaniaNames.THOR),
					'L', ModUtils.getItemByName(BotaniaNames.LIFE_AGGREGATOR),
					'M', ModUtils.getItemByName(BotaniaNames.MIRROR),
					'Q', new ItemStack(ModUtils.getItemByName(BotaniaNames.RUNE), 1, 9),//Lust
					'A', ModUtils.getItemByName(BotaniaNames.TABLET),
					'U', new ItemStack(ModUtils.getItemByName(BotaniaNames.RUNE), 1, 15),//Pride
					'D', ModUtils.getItemByName(BotaniaNames.DICE),
					'F', new ItemStack(ModUtils.getItemByName(BotaniaNames.RUNE), 1, 13),//Wrath
					'V', new ItemStack(ModUtils.getItemByName(BotaniaNames.RUNE), 1, 11),//Greed
					'W', new ItemStack(ModUtils.getItemByName(BotaniaNames.RUNE), 1, 12)//Sloth
					);
		}
	}
}
