package com.srp.common.item;

import com.srp.client.core.IModelRegister;
import com.srp.client.handler.ModelHandler;
import com.srp.common.core.SRPCreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * This class was created by Arekkuusu on 28/02/2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 */
public class ItemModFood extends ItemFood implements IModelRegister {

	public ItemModFood(String id, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setRegistryName(id);
		setUnlocalizedName(id);
		setCreativeTab(SRPCreativeTabs.ITEMS_AND_BLOCKS_TAB);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerModel() {
		ModelHandler.registerModel(this, 0);
	}
}