package com.srp.common.lib;

/**
 * This class was created by <Arekkuusu> on 26/02/2017.
 * It's distributed as part of Bewitchment under
 * the MIT license.
 */
public final class LibMod {

	//ID for MOD
	public static final String MOD_ID = "srp";

	//Name of MOD
	public static final String MOD_NAME = "Suns_Roleplay_Items";

	//Version of MOD
	public static final String MOD_VER = "@VERSION@";

	//Dependency
	public static final String DEPENDENCIES = "required-after:forge@[14.23.2.2611,]";

	//Client proxy location
	public static final String PROXY_CLIENT = "com.srp.client.core.ClientProxy";

	//Server proxy location
	public static final String PROXY_COMMON = "com.srp.common.core.proxy.ServerProxy";

	private LibMod() {
	}
}