package com.powereclipse.jwrutilities;

import com.powereclipse.jwrutilities.common.ProxyCommon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION_BUILD,dependencies = ModInfo.DEPENDENCIES, updateJSON = ModInfo.UpdateJSON)
public class Main {
    
    @SidedProxy(serverSide = ModInfo.ServerSide, clientSide = ModInfo.ClientSide)
    @Mod.Instance("jwrutilities")
    public static Main instance;
    public static ProxyCommon proxy;
    }

