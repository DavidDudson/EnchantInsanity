package BigDaveNz.EI.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.ForgeSubscribe;

/**
 * @author BigDaveNz
 * 
 */
public class EventHandler {

    private boolean playerLoggedIn = true;
    
    public static void onPlayerLogin(EntityPlayer player) {

        String playerName = player.getEntityName();
        player.sendChatToPlayer("This Worked!");
    }

}
