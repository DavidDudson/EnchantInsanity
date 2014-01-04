package nz.co.bigdavenz.ei.core.handler;

import net.minecraftforge.common.MinecraftForge;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.event.EIEvent;

/**
 * Created by David J. Dudson on 4/01/14.
 */
public class EIEventHandler {

    public static void init(){
        MinecraftForge.EVENT_BUS.register(new EIEvent());
        EIDebugHandler.sendDebugInfoToConsole(EIDebugHandler.createDebugMessage("Event Handler Initialized", DebugType.EVENT));
    }
}
