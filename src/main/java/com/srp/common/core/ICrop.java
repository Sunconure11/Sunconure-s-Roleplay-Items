package com.srp.common.core;

import net.minecraft.item.Item;

/**
 * This class was created by <Arekkuusu> on 27/06/2017.
 * It's distributed as part of Solar Epiphany under
 * the MIT license.
 */
public interface ICrop {

	int getMaxAge();

	Item getSeed();

	void setSeed(Item seed);

	Item getCrop();

	void setCrop(Item crop);
}