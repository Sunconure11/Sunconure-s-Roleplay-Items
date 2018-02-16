package com.srp.common.item;

import com.srp.common.lib.LibMod;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by Joseph on 2/16/2018.
 */
@SuppressWarnings("ConstantConditions")
@GameRegistry.ObjectHolder(LibMod.MOD_ID)
public final class ModItems {
	private static final Item PLACE_HOLDER = new Item();

	private ModItems() {
	}
	public static void register(final IForgeRegistry<Item> registry) {

	}
}
