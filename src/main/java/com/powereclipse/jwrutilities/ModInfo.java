package com.powereclipse.jwrutilities;

public class ModInfo {
    public static final String PACKAGE_NAME = "com.powereclipse.";
    public static final String MOD_ID = "jwrutilities";
    public static final String MOD_NAME = "JWR Utilities";
    public static final String VERSION_BUILD = "1.1.4.6";
    public static final String MINECRAFT_VERSION = "@MCVERSION@";
    public static final String FORGE_VERSION = "@FORGEVERSION@";
    public static final String DEPENDENCIES = "required-after:Forge";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String UpdateJSON =  "https://raw.githubusercontent.com/PowerEclipse/JWR-Utilities/master/update.json";
    public static final String ServerSide = "com.powereclipse.jwrutilities.common.ProxyCommon";
    public static final String ClientSide = "com.powereclipse.jwrutilities.client.ProxyClient";

    private ModInfo() {

    }
}