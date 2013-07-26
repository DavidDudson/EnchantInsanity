package nz.co.bigdavenz.ei.core.handler;

import nz.co.bigdavenz.ei.command.CommandEI;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommandHandler {

    public static void initCommands(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandEI());
    }
}
