package com.theundertaker11.moreavaritia.items.armor;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class BalancedInfinityArmor extends ItemArmor{

	private static ArmorMaterial balancedInfinity = EnumHelper.addArmorMaterial("balancedinfinityarmor", "moreavaritia:balancedinfinityarmor", 9999, new int[]{3, 6, 8, 3}, 200, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
	
	public BalancedInfinityArmor(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(balancedInfinity, renderIndexIn, equipmentSlotIn);
	}

}
