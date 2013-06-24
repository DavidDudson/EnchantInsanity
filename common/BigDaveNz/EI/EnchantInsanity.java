package BigDaveNz.EI;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import BigDaveNz.EI.core.proxy.CommonProxy;
import BigDaveNz.EI.lib.*;

/**
Enchant Insantiy

Created by BigDaveNz

Main Mod Class
*/

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class EnchantInsanity {
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) { 
    }
    
    @Init
    public void load(FMLInitializationEvent event) {    
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
    }
}
