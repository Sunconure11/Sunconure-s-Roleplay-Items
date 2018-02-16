package com.srp.common;

import com.srp.common.block.ModBlocks;
import com.srp.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by Joseph on 2/16/2018.
 */
@Mod.EventBusSubscriber(modid = LibMod.MOD_ID)
public final class RegistryEvents {

	private RegistryEvents() {
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		ModBlocks.register(event.getRegistry());
	}
}
