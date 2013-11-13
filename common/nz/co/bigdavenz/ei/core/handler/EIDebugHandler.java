package nz.co.bigdavenz.ei.core.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatMessageComponent;
import nz.co.bigdavenz.ei.core.util.EILogger;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.Reference;

/**
 * @author BigDaveNz
 * 
 */
public class EIDebugHandler {

	public static void sendDebugToPlayer(DebugMessage message) {
		if (Reference.debugMode == true) {
			sendDebugInfoToConsole(message);
			// player.addChatMessage("[DEBUG] " + message);
		}
	}

	public static void sendDebugInfoToConsole(DebugMessage message){
        
        if(Reference.debugMode){
        	if(message.debugType == DebugType.PLAYER){
        		message.message = " [ " + message.player.username + " ] " + message.message;
        		EILogger.info("[DEBUG] " + message.message);
        	}
        	else{
        		EILogger.info("[DEBUG] " + message.message);
        	}
        }
    }
	
	public static void tempDebugToConsole(String Message){
		DebugMessage message = new DebugMessage(Message, DebugType.TEMP);
		sendDebugInfoToConsole(message);
	}
}
