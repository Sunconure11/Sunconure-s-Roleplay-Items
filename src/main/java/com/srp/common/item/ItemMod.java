package com.srp.common.item;

import com.srp.client.handler.ModelHandler;
import com.srp.common.api.helper.IModelRegister;
import com.srp.common.core.SRPCreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Joseph on 2/16/2018.
 */
public class ItemMod extends Item implements IModelRegister {

	public ItemMod(String id) {
		super();
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