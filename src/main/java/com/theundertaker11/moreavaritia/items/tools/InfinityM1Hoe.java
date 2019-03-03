package com.theundertaker11.moreavaritia.items.tools;

import com.theundertaker11.moreavaritia.MoreAvaritiaMain;
import com.theundertaker11.moreavaritia.render.IItemModelProvider;

import morph.avaritia.Avaritia;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class InfinityM1Hoe extends ItemHoe implements IItemModelProvider{

	private static final ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("INFINITY_HOE-1", 0, 9999, 9999F, 3.0F, 200);
	private static String name;
	
	public InfinityM1Hoe(String name) {
		super(TOOL_MATERIAL);
		this.name = name;
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Avaritia.tab);
	}

	@Override
    public void setDamage(ItemStack stack, int damage) {
        super.setDamage(stack, 0);
    }
	
	
	@Override
	public void registerItemModel(Item item) {
		MoreAvaritiaMain.proxy.registerItemRenderer(this, 0, name);
	}
}
