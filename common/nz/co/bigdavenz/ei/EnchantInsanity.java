package nz.co.bigdavenz.ei;

import net.minecraft.creativetab.CreativeTabs;
import nz.co.bigdavenz.ei.core.handler.CommandHandler;
import nz.co.bigdavenz.ei.core.proxy.CommonProxy;
import nz.co.bigdavenz.ei.creativetab.CreativeTabEI;
import nz.co.bigdavenz.ei.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
//import cpw.mods.fml.common.network.NetworkMod;

/**
 * Enchant Insanity
 * 
 * Created by BigDaveNz
 * 
 * Main Mod Class
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class EnchantInsanity {

    @Instance(Reference.MOD_ID)
    public static EnchantInsanity instance;
    public static CreativeTabs    tabsEI = new CreativeTabEI(CreativeTabs.getNextID(), Reference.MOD_ID);

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        CommandHandler.initCommands(event);
    }

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Load.loadEI(event);
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}