package nz.co.bigdavenz.ei.core.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatMessageComponent;
import nz.co.bigdavenz.ei.core.util.EILogger;
import nz.co.bigdavenz.ei.lib.Reference;

/**
 * @author BigDaveNz
 *
 */
public class EIDebugHandler {
    
    public static void sendDebugToPlayer(String message, EntityPlayer player){ 
        if(Reference.debugMode == true){
            player.addChatMessage("[DEBUG] " + message);
        }   
    }
    
    public static void sendDebugInfoToConsole(String message){
        
        if(Reference.debugMode == true){
            EILogger.info("[DEBUG] " + message);
        }
    }
}
