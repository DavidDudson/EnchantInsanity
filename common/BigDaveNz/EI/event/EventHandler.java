package BigDaveNz.EI.event;


import BigDaveNz.EI.core.util.EIDebugHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.ForgeSubscribe;

/**
 * @author BigDaveNz
 * 
 */
public class EventHandler {

    private static boolean playerLoggedIn = false;
    
    public static void onPlayerLogin(EntityPlayer player) {

        String playerName = player.getEntityName();
        player.addChatMessage("Welcome to Enchant Insanity!");
        EIDebugHandler.sendDebugToPlayer("Debug mode is currently active", player);
        
        playerLoggedIn = true;
    }

    public static void onPlayerLogout(EntityPlayer player) {
        
        String playerName = player.getEntityName();
        playerLoggedIn = false;
        EIDebugHandler.sendDebugInfoToConsole(playerName + "logged out and EI is unloaded");
    }
}
