package com.theundertaker11.moreavaritia.items.tools;

import com.theundertaker11.moreavaritia.MoreAvaritiaMain;
import com.theundertaker11.moreavaritia.items.ItemRegistry;
import com.theundertaker11.moreavaritia.render.IItemModelProvider;

import morph.avaritia.Avaritia;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BalancedInfinitySword extends ItemSword implements IItemModelProvider{
	
	private static String name;
	private static final ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("infinityswordbalanced", 32, 9999, 9999F, 396.0F, 200);
	
	public BalancedInfinitySword(String name) {
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
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if(tab != MoreAvaritiaMain.tab) return;
		ItemStack stack = new ItemStack(ItemRegistry.BalancedInfinitySword);
		stack.addEnchantment(Enchantments.LOOTING, 5);
		items.add(stack);
	}
}
