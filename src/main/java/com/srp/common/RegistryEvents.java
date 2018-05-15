package com.srp.common;

import com.srp.common.api.helper.internalApi.CropRegistry;
import com.srp.common.block.ModBlocks;
import com.srp.common.block.natural.BlockCrop;
import com.srp.common.core.Crop;
import com.srp.common.item.ModItems;
import com.srp.common.item.foliage.ItemCrop;
import com.srp.common.item.foliage.ItemSeed;
import com.srp.common.lib.LibItemName;
import com.srp.common.lib.LibMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.srp.common.core.Crop.COTTON;

/**
 * This class was created by <Arekkuusu> on 26/02/2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 */
@Mod.EventBusSubscriber(modid = LibMod.MOD_ID)
public final class RegistryEvents {

	private RegistryEvents() {
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		registerCrop(COTTON, ModBlocks.crop_cotton
				, new ItemCrop(LibItemName.COTTON, 1, 0.4F, false), LibItemName.SEED_COTTON);

		ModItems.register(event.getRegistry());
	}

	private static void registerCrop(Crop crop, BlockCrop placed, Item cropItem, String seedName) {
		CropRegistry.registerCrop(crop, placed, cropItem, new ItemSeed(seedName, placed, crop.getSoil()));
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		ModBlocks.register(event.getRegistry());
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll();
	}
}
