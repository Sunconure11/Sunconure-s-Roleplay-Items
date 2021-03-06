package com.srp.common.block;

import com.srp.client.core.IModelRegister;
import com.srp.client.handler.ModelHandler;
import com.srp.common.core.SRPCreativeTabs;
import com.srp.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Joseph on 2/16/2018.
 */
public class BlockMod extends Block implements IModelRegister {

	public BlockMod(String id, Material material) {
		super(material);
		setUnlocalizedName(id);
		setDefaultState(defaultState());
		setRegistryName(LibMod.MOD_ID, id);
		setCreativeTab(SRPCreativeTabs.ITEMS_AND_BLOCKS_TAB);
	}

	protected IBlockState defaultState() {
		return blockState.getBaseState();
	}

	public Block setSound(SoundType type) {
		return super.setSoundType(type);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModel() {
		ModelHandler.registerModel(this, 0);
	}
}
