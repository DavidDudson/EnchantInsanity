package BigDaveNz.EI;

import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import BigDaveNz.EI.core.proxy.CommonProxy;
import BigDaveNz.EI.lib.*;
import BigDaveNz.EI.skill.Skill;
import BigDaveNz.EI.command.CommandHandler;
import BigDaveNz.EI.creativetab.CreativeTabEI;
import BigDaveNz.EI.item.ModItems;

/**
Enchant Insantiy

Created by BigDaveNz

Main Mod Class
*/

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class EnchantInsanity {
    
    @Instance(Reference.MOD_ID)
    public static EnchantInsanity instance;
    
    public static CreativeTabs tabsEI = new CreativeTabEI(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @ServerStarting
    public void serverStarting(FMLServerStartingEvent event) {
        CommandHandler.initCommands(event);
    }
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) { 
        ModItems.init();
        
        Skill.init();
    }
    
    @Init
    public void load(FMLInitializationEvent event) {    
        
    }
    
    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
    }
}
