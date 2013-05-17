package com.Minebot.TestMod;

import com.Minebot.TestMod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(
	modid = Reference.ModID,
	name = Reference.ModName,
	version = Reference.Version
)
@NetworkMod(
		serverSideRequired = false,
		clientSideRequired = true
		
)


public class TestMod {

}
