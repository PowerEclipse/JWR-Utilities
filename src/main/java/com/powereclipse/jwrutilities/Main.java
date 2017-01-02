package com.powereclipse.jwrutilities;

import com.powereclipse.jwrutilities.common.ProxyCommon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION_BUILD,dependencies = ModInfo.DEPENDENCIES, updateJSON = "https://raw.githubusercontent.com/PowerEclipse/JWR-Utilities/master/update.json")
public class Main {
    
    @SidedProxy(serverSide = "com.powereclipse.jwrutilities.common.ProxyCommon", clientSide = "com.powereclipse.jwrutilities.client.ProxyClient")
    public static ProxyCommon proxy;

    
    
    @Mod.Instance("jwrutilities")
    public static Main instance = new Main(); 
    
    
    @EventHandler
    public void preInit (FMLPreInitializationEvent event) {
      

        proxy.preInit();
    
    }


}