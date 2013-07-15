package BigDaveNz.EI.core.handler;

import BigDaveNz.EI.command.CommandEI;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

public class CommandHandler {

    public static void initCommands(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandEI());
    }
}
