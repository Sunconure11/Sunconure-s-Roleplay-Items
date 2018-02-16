package com.srp.common.item;

import com.srp.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.LoaderException;
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
		registry.registerAll(
		);
	}
	private static Item itemBlock(Block block) {
		if (block == null) {
			throw new LoaderException("[" + LibMod.MOD_NAME + "] Trying to register an ItemBlock for a null block");
		}
		if (block.getRegistryName() == null) {
			throw new LoaderException("[" + LibMod.MOD_NAME + "] Trying to register an ItemBlock for a block with null name - " + block.getUnlocalizedName());
		}
		if (block.getRegistryName().toString() == null) {
			throw new LoaderException("[" + LibMod.MOD_NAME + "] There's something wrong with the registry implementation of " + block.getUnlocalizedName());
		}
		return new ItemBlock(block).setRegistryName(block.getRegistryName());
	}

	public static void init() {
		initOreDictionary();
	}
	
	private static void initOreDictionary() {

	}
}
