package com.srp.common.api.helper;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Joseph on 2/16/2018.
 */
public interface IModelRegister {
	@SideOnly(Side.CLIENT)
	void registerModel();
}
