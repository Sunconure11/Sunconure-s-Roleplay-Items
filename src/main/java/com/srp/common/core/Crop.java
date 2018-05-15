package com.srp.common.core;

import com.srp.common.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/**
 * This class was created by Arekkuusu on 28/02/2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 */
public enum Crop {
	COTTON(Blocks.FARMLAND),
	DEVILS_CLAW(Blocks.FARMLAND),
	FLAX(Blocks.FARMLAND),
	HEMP(Blocks.FARMLAND);

	private final Block soil;

	Crop(Block soil) {
		this.soil = soil;
	}

	public Block getSoil() {
		return soil;
	}
}