package com.srp.common;

import com.srp.common.block.ModBlocks;
import com.srp.common.core.ISidedProxy;
import com.srp.common.item.ModItems;
import com.srp.common.lib.LibMod;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.srp.common.lib.LibMod.MOD_NAME;

/**
 * Created by Joseph on 2/15/2018.
 */
@SuppressWarnings("WeakerAccess")
@Mod(modid = LibMod.MOD_ID, name = MOD_NAME, version = LibMod.MOD_VER, dependencies = LibMod.DEPENDENCIES, acceptedMinecraftVersions = "[1.12,1.13]")
public class SRP {

	public static final Logger logger = LogManager.getLogger(MOD_NAME);
	@SidedProxy(serverSide = LibMod.PROXY_COMMON, clientSide = LibMod.PROXY_CLIENT)
	public static ISidedProxy proxy;
	@Mod.Instance(LibMod.MOD_ID)
	public static SRP instance;

	static {
		FluidRegistry.enableUniversalBucket();
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);

		logger.info("Hope is your survival");
		logger.info("A captive path I lead");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);

		ModItems.init();
		ModBlocks.init();

		logger.info("No matter where you go, I will find you");
		logger.info("If it takes a long long time");
		logger.info("No matter where you go, I will find you");
		logger.info("If it takes a thousand years");
	}
}
