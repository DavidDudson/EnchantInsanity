package nz.co.bigdavenz.ei.core.handler;

import net.minecraft.entity.player.EntityPlayer;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.logger.VanillaEILogger;

/**
 * @author BigDaveNz
 * 
 */
public class EIDebugHandler {

    public static void sendDebugToPlayer(EntityPlayer player, DebugMessage message) {
        if (Reference.debugMode == true) {
            sendDebugInfoToConsole(message);
            player.addChatMessage("[DEBUG] " + message);
        }
    }

    public static void sendDebugInfoToConsole(DebugMessage message) {

        if (Reference.debugMode) {
            if (message.debugType == DebugType.PLAYER) {
                message.message = " [ " + message.player.username + " ] " + message.message;
                VanillaEILogger.info("[DEBUG] " + message.message);
            } else {
                VanillaEILogger.info("[DEBUG] " + message.message);
            }
        }
    }

    public static void tempDebugToConsole(String Message) {
        DebugMessage message = new DebugMessage(Message, DebugType.TEMP);
        sendDebugInfoToConsole(message);
    }
}
