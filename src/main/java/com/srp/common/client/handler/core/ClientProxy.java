package com.srp.common.client.handler.core;

import com.srp.common.client.handler.ModelHandler;
import com.srp.common.core.ISidedProxy;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

/**
 * Created by Joseph on 2/16/2018.
 */
@SideOnly(Side.CLIENT)
@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy implements ISidedProxy {

	/**
	 * Here you can register your Item models that do not have a class.
	 * <p>
	 * According to the registry name of the item, the model loader will look
	 * into the models file and bind the item to its corresponding model.
	 * </p>
	 */
	@SubscribeEvent
	public static void registerItemModels(ModelRegistryEvent event) {
		ModelHandler.registerModels();
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		registerRenders();
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}

	public void postInit(FMLPostInitializationEvent event) {
	}

	/**
	 * Register here all Renders. For example:
	 * {@code RenderingRegistry.registerEntityRenderingHandler(Entity.class, RenderEntity::new);}
	 * or
	 * {@code ClientRegistry.bindTileEntitySpecialRenderer(Tile.class, new RenderTile());}
	 *
	 * @see RenderingRegistry
	 */
	private void registerRenders() {
	}

	/**
	 * Display a Record text with a format and localization.
	 *
	 * @param text An {@link ITextComponent}
	 */
	@Override
	public void displayRecordText(ITextComponent text) {
		Minecraft.getMinecraft().ingameGUI.setRecordPlayingMessage(text.getFormattedText());
	}

	@Override
	public boolean isFancyGraphicsEnabled() {
		return Minecraft.getMinecraft().gameSettings.fancyGraphics;
	}

	@Override
	public void loadActionsClient(ArrayList<String> actions) {
	}
}