package BigDaveNz.EI;

import net.minecraft.creativetab.CreativeTabs;

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
import BigDaveNz.EI.core.handler.CommandHandler;
import BigDaveNz.EI.core.handler.EIEventHandler;
import BigDaveNz.EI.core.proxy.CommonProxy;
import BigDaveNz.EI.core.util.EILogger;
import BigDaveNz.EI.lib.*;
import BigDaveNz.EI.network.PacketHandler;
import BigDaveNz.EI.skill.Skill;
import BigDaveNz.EI.creativetab.CreativeTabEI;
import BigDaveNz.EI.enchant.Enchant;
import BigDaveNz.EI.event.EIEvent;
import BigDaveNz.EI.item.ModItems;

/**
 * Enchant Insantiy
 * 
 * Created by BigDaveNz
 * 
 * Main Mod Class
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class EnchantInsanity {

    @Instance(Reference.MOD_ID)
    public static EnchantInsanity instance;
    public static CreativeTabs tabsEI = new CreativeTabEI(
            CreativeTabs.getNextID(), Reference.MOD_ID);

    @EventHandler
    public void serverStarting(FMLServerStartingEvent event) {
        CommandHandler.initCommands(event);
    }

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();

        Enchant.init();

        EILogger.init();
        
        EIEventHandler.init();
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
