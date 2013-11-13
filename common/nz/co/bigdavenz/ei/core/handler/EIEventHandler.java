package nz.co.bigdavenz.ei.core.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.event.EIEvent;
import nz.co.bigdavenz.ei.player.EIPlayerTracker;

public class EIEventHandler {

    public static void init(){
        MinecraftForge.EVENT_BUS.register(new EIEvent());
        GameRegistry.registerPlayerTracker(new EIPlayerTracker());
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Event Handler Initialized", DebugType.EVENT));
    }
    
}
