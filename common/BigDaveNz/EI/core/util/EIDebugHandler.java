package BigDaveNz.EI.core.util;

import net.minecraft.entity.player.EntityPlayer;
import BigDaveNz.EI.lib.Reference;

/**
 * @author BigDaveNz
 *
 */
public class EIDebugHandler {
    
    public static void sendDebugToPlayer(String message, EntityPlayer player){
        
        if(Reference.debugMode == true){
            player.sendChatToPlayer(message);
        }   
    }
    
    public static void sendDebugInfoToConsole(String message){
        
        if(Reference.debugMode == true){
            EILogger.info("[DEBUG] " + message);
        }
    }
}
