package com.srp.common.core.proxy;

import com.srp.common.core.ISidedProxy;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.ArrayList;

/**
 * Created by Joseph on 2/16/2018.
 */
public class ServerProxy implements ISidedProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		//NO-OP
	}

	@Override
	public void init(FMLInitializationEvent event) {
		//NO-OP
	}

	@Override
	public void displayRecordText(ITextComponent text) {
		//NO-OP
	}

	@Override
	public boolean isFancyGraphicsEnabled() {
		return false;
	}

	@Override
	public void loadActionsClient(ArrayList<String> actions) {
		// NO-OP
	}
}
