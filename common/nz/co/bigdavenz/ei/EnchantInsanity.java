package nz.co.bigdavenz.ei;

import net.minecraft.creativetab.CreativeTabs;
import nz.co.bigdavenz.ei.core.handler.CommandHandler;
import nz.co.bigdavenz.ei.core.handler.EIEventHandler;
import nz.co.bigdavenz.ei.core.proxy.CommonProxy;
import nz.co.bigdavenz.ei.core.util.EILogger;
import nz.co.bigdavenz.ei.creativetab.CreativeTabEI;
import nz.co.bigdavenz.ei.enchant.Enchant;
import nz.co.bigdavenz.ei.event.EIEvent;
import nz.co.bigdavenz.ei.item.ModItems;
import nz.co.bigdavenz.ei.leaderboard.GlobalLeaderboard;
import nz.co.bigdavenz.ei.lib.*;
import nz.co.bigdavenz.ei.network.PacketHandler;
import nz.co.bigdavenz.ei.skill.Skill;

import cpw.mods.fml.common.Mod;

import cpw.mods.fml.common.Mod.EventHandler;
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
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Enchant Insanity
 * 
 * Created by BigDaveNz
 * 
 * Main Mod Class
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class EnchantInsanity {

    // TODO IScheduladedTickHandler
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
    public void load(FMLInitializationEvent event) {}

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
}
