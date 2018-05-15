package com.srp.common.item.foliage;

import com.srp.client.core.IModelRegister;
import com.srp.client.handler.ModelHandler;
import com.srp.common.core.SRPCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

/**
 * This class was created by Arekkuusu on 27/02/2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 */
@SuppressWarnings("WeakerAccess")
public class ItemSeed extends ItemSeeds implements IModelRegister {

	protected final Block crop;
	protected final Block soil;

	public ItemSeed(String id, Block crop, Block soil) {
		super(crop, soil);
		setRegistryName(id);
		setUnlocalizedName(id);
		setCreativeTab(SRPCreativeTabs.ITEMS_AND_BLOCKS_TAB);
		this.crop = crop;
		this.soil = soil;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
		tooltip.add(TextFormatting.ITALIC + I18n.format("srp.tooltip." + getNameInefficiently(stack) + "_description.name"));
	}

	public String getNameInefficiently(ItemStack stack) {
		return getUnlocalizedName().substring(5);
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return soil == Blocks.FARMLAND ? EnumPlantType.Crop : EnumPlantType.Water;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModel() {
		ModelHandler.registerModel(this, 0);
	}
}