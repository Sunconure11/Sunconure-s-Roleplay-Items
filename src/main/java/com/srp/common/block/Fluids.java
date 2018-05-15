package com.srp.common.block;

import com.srp.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.IFluidBlock;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * This class was created by Arekkuusu on 03/05/2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 */
@SuppressWarnings("WeakerAccess")
public final class Fluids {

	public static final Set<IFluidBlock> MOD_FLUID_BLOCKS = new HashSet<>();

	private Fluids() {
	}

	private static <T extends Block & IFluidBlock> Fluid createFluid(String name, boolean hasFlowIcon, Consumer<Fluid> fluidPropertyApplier, Function<Fluid, T> blockFactory, boolean hasBucket) {
		final ResourceLocation still = new ResourceLocation(LibMod.MOD_ID + ":blocks/fluid/" + name + "_still");
		final ResourceLocation flowing = hasFlowIcon ? new ResourceLocation(LibMod.MOD_ID + ":blocks/fluid/" + name + "_flow") : still;

		Fluid fluid = new Fluid(name, still, flowing);
		final boolean useOwnFluid = FluidRegistry.registerFluid(fluid);

		if (useOwnFluid) {
			fluidPropertyApplier.accept(fluid);
			MOD_FLUID_BLOCKS.add(blockFactory.apply(fluid));
			if (hasBucket)
				FluidRegistry.addBucketForFluid(fluid);
		} else {
			fluid = FluidRegistry.getFluid(name);
		}

		return fluid;
	}
}
