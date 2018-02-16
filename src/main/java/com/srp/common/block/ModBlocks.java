package com.srp.common.block;

import com.srp.common.lib.LibBlockName;
import com.srp.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Joseph on 2/16/2018.
 */
@SuppressWarnings("ConstantConditions")
@GameRegistry.ObjectHolder(LibMod.MOD_ID)
public final class ModBlocks {

	private static Block PLACE_HOLDER = new Block(Material.AIR);
	//-----------------------------------------------------------//
	public static final Block test = PLACE_HOLDER;

	private ModBlocks() {

	}

	public static void register(final IForgeRegistry<Block> registry) {
		registry.registerAll(
				new BlockMod(LibBlockName.TEST, Material.ROCK).setHardness(5.0F)
		);
	}

	public static void init() {
		initOreDictionary();
	}

	private static void initOreDictionary() {
	}
}
