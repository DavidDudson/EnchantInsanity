package nz.co.bigdavenz.ei.client.gui;

import nz.co.bigdavenz.ei.EnchantInsanity;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GUI {

    public static void init() {
        NetworkRegistry.INSTANCE.registerGuiHandler(EnchantInsanity.instance, EnchantInsanity.instance.proxy);
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("GUI's Initailized", DebugType.GUI));
    }

}
