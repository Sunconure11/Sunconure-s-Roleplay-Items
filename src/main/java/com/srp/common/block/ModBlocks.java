package com.srp.common.block;

import com.srp.common.block.natural.BlockCrop;
import com.srp.common.lib.LibBlockName;
import com.srp.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Joseph on 2/16/2018.
 */
@SuppressWarnings("ConstantConditions")
@GameRegistry.ObjectHolder(LibMod.MOD_ID)
public final class ModBlocks {

	public static final BlockCrop crop_cotton = null;
	private static Block PLACE_HOLDER = new Block(Material.AIR);
	//-----------------------------------------------------------//

	private ModBlocks() {

	}

	public static void register(final IForgeRegistry<Block> registry) {
		for (final IFluidBlock fluidBlock : Fluids.MOD_FLUID_BLOCKS) {
			registry.register((Block) fluidBlock);
		}
		//Crops
		registry.registerAll(
				new BlockCrop(LibBlockName.CROP_COTTON)
		);
	}

	public static void init() {
		initOreDictionary();
	}

	private static void initOreDictionary() {
	}
}
