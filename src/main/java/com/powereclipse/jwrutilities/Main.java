package com.powereclipse.jwrutilities;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION_BUILD,dependencies = ModInfo.DEPENDENCIES, updateJSON = ModInfo.UpdateJSON)
public class Main {
    
    //@SidedProxy(serverSide = "com.powereclipse.jwrutilities.common.ProxyCommon", clientSide = "com.powereclipse.jwrutilities.client.ProxyClient")
    @Mod.Instance("jwrutilities")
    public static Main instance;

    }
