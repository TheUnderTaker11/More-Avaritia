package com.theundertaker11.moreavaritia.items.tools;

import java.util.List;
import java.util.Set;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableSet;
import com.theundertaker11.moreavaritia.ModUtils;
import com.theundertaker11.moreavaritia.MoreAvaritiaMain;
import com.theundertaker11.moreavaritia.render.IItemModelProvider;

import morph.avaritia.init.ModItems;
import morph.avaritia.recipe.AvaritiaRecipeManager;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InfinityM1Pick extends ItemPickaxe implements IItemModelProvider{
	
	protected static String name;
	public static final ToolMaterial TOOL_MATERIAL_PICK = EnumHelper.addToolMaterial("infinitypick", 99, 99999, 9999999F, 6.0F, 200);
	
	public InfinityM1Pick(String name) {
		super(TOOL_MATERIAL_PICK);
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
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Shift Right Click to change enchantment mode");
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
                if(!world.isRemote) player.sendMessage(new TextComponentString("Set to Fortune III"));
            }else {
            	ModUtils.removeEnchant(stack, Enchantments.FORTUNE);
                stack.addEnchantment(Enchantments.SILK_TOUCH, 1);
                if(!world.isRemote) player.sendMessage(new TextComponentString("Set to Silk Touch"));
            }
            return new ActionResult<>(EnumActionResult.SUCCESS, stack);
        }
        return new ActionResult<>(EnumActionResult.PASS, stack);
    }
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "spade", "axe");
	}
	
	@Override
	public boolean canHarvestBlock(IBlockState blockIn) 
	{
	    return true;
	}
	
	@Override
	public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
		return 1000000;
    }
}
