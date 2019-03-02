package com.theundertaker11.moreavaritia.items.tools;

import java.util.HashMap;
import java.util.Map;

import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.MoreAvaritiaMain;
import com.theundertaker11.moreavaritia.render.IItemModelProvider;

import morph.avaritia.Avaritia;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class InfinityMinus1Pick extends ItemPickaxe implements IItemModelProvider{
	
	private static String name;
	private static final ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("INFINITY_PICKAXEM1", 99, 99999, 9999999F, 6.0F, 200);
	
	public InfinityMinus1Pick(String name) {
		super(TOOL_MATERIAL);
		this.name = name;
		setRegistryName(name);
		setUnlocalizedName(name);
		setCreativeTab(Avaritia.tab);
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
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack stack = player.getHeldItem(hand);
        if (player.isSneaking()) {
            NBTTagCompound tag = stack.getTagCompound();
            if (tag == null) {
                stack.setTagCompound(new NBTTagCompound());
            }
            if (EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, stack) > 0) {
                stack.addEnchantment(Enchantments.FORTUNE, 3);
                ModUtils.removeEnchant(stack, Enchantments.SILK_TOUCH);
                player.sendMessage(new TextComponentString("Set to Fortune III"));
            }else {
            	ModUtils.removeEnchant(stack, Enchantments.FORTUNE);
                stack.addEnchantment(Enchantments.SILK_TOUCH, 1);
                player.sendMessage(new TextComponentString("Set to Silk Touch"));
            }
            return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
        return new ActionResult<>(EnumActionResult.PASS, stack);
    }
}
