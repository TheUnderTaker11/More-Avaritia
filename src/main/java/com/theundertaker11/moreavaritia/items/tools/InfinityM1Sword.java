package com.theundertaker11.moreavaritia.items.tools;

import com.theundertaker11.moreavaritia.MoreAvaritiaMain;
import com.theundertaker11.moreavaritia.render.IItemModelProvider;

import morph.avaritia.Avaritia;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class InfinityM1Sword extends ItemSword implements IItemModelProvider{

	private static String name;
	private static final ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("infinityswordm1", 32, 9999, 9999F, 56.0F, 200);
	
	public InfinityM1Sword(String name) {
		super(TOOL_MATERIAL);
		this.name = name;
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(MoreAvaritiaMain.tab);
	}
	
	@Override
	public void registerItemModel(Item item) {
		MoreAvaritiaMain.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
    public void setDamage(ItemStack stack, int damage) {
        super.setDamage(stack, 0);
    }
}
