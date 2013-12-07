package nz.co.bigdavenz.ei.client.gui;

import nz.co.bigdavenz.ei.EnchantInsanity;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.tick.EIHUDTickHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class GUI {

    public static void init() {
        NetworkRegistry.instance().registerGuiHandler(EnchantInsanity.instance, EnchantInsanity.instance.proxy);
        EnchantInsanity instance = EnchantInsanity.instance;
        TickRegistry.registerScheduledTickHandler(new EIHUDTickHandler(), Side.CLIENT);
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("GUI's Initailized", DebugType.GUI));
    }

}
