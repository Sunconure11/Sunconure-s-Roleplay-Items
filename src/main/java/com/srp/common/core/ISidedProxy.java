package com.srp.common.core;

import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;

/**
 * Created by Joseph on 2/16/2018.
 */
public interface ISidedProxy {

	void preInit(FMLPreInitializationEvent event);

	void init(FMLInitializationEvent event);

	void displayRecordText(ITextComponent text);

	boolean isFancyGraphicsEnabled();

	void loadActionsClient(ArrayList<String> actions);
}
