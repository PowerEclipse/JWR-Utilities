package com.powereclipse.jwrutilities;

import com.powereclipse.jwrutilities.common.ProxyCommon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION_BUILD,dependencies = ModInfo.DEPENDENCIES, updateJSON = ModInfo.UpdateJSON)
public class Main {
    
    @SidedProxy(serverSide = ModInfo.ServerSide, clientSide = ModInfo.ClientSide)
    //@Mod.Instance("jwrutilities")
    public static Main instance = new Main(); 
    public static ProxyCommon proxy;
    
    
    @EventHandler
    public void preInit (FMLPreInitializationEvent event) {
      

        proxy.preInit();
    
    }


}