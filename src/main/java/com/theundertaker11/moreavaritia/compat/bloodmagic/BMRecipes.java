package com.theundertaker11.moreavaritia.compat.bloodmagic;

import com.theundertaker11.moreavaritia.ConfigMain;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.Reference;
import com.theundertaker11.moreavaritia.recipe.RecipeUtil;

import morph.avaritia.init.ModBlocks;
import morph.avaritia.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.Optional;

public class BMRecipes {

	@Optional.Method(modid = Reference.BloodMagicModID)
	public static void init()
	{
		if(ConfigMain.enableCreativeSacDagger)
		{
			/*ItemStack orb = new ItemStack(ModUtils.getItemByName(BMNames.BLOOD_ORB), 1, 0);
			orb.setTagCompound(new NBTTagCompound());
			orb.getTagCompound().setString("orb", Reference.BloodMagicModID + ":archmage");*/
			RecipeUtil.addRecipe(
					new ItemStack(ModUtils.getItemByName(BMNames.SAC_DAGGER), 1, 1),
					"IIINNNIII",
					"IABCDEFGI",
					"IHIJJJIKI",
					"NLJIPIJON",
					"NQJPRPJSN",
					"NTJIPIJUN",
					"IVIJJJIWI",
					"IabcdefgI",
					"IIINNNIII",
					'A', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_TELEPOSE)),
					'B', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_TRANSPOSITION)),
					'C', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_CLAW)),
					'D', ModItems.infinity_catalyst,
					'E', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_BOUNCE)),
					'F', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_FROST)),
					'G', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_DIVINATION)),
					'H', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_HOLDING)),
					'J', new ItemStack(ModUtils.getItemByName(BMNames.SLATE), 1, 4), // Ethereal Slate is J
					'K', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_AIR)),
					'L', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_SEVERANCE)),
					'N', new ItemStack(ModBlocks.resource, 1, 0), // Neutronium Block
					'O', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_WATER)),
					'P', new ItemStack(ModUtils.getItemByName(BMNames.TELEPOSITION), 1, 3), //Demonic Teleposition Focus
					'Q', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_COMPRESSION)),
					'R', new ItemStack(ModUtils.getItemByName(BMNames.SAC_DAGGER), 1, 0), // Normal dagger
					'S', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_LAVA)),
					'T', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_WHIRLWIND)),
					'U', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_VOID)),
					'V', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_PHANTOM_BRIDGE)),
					'W', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_GREEN_GROVE)),
					'a', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_SEER)),
					'b', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_FAST_MINER)),
					'c', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_HASTE)),
					'd', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_SUPRESSION)),
					'e', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_MAGNETISM)),
					'f', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_AFFINITY)),
					'g', new ItemStack(ModUtils.getItemByName(BMNames.SIGIL_LIGHT)),
					'I', ModItems.infinity_ingot
					);
		}
	}
}
