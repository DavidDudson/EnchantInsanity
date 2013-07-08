package BigDaveNz.EI.event;

import cpw.mods.fml.common.registry.GameRegistry;
import BigDaveNz.EI.player.EIPlayerTracker;
import net.minecraftforge.common.MinecraftForge;

public class Event {

    public static void init(){
        MinecraftForge.EVENT_BUS.register(new EventHandler());
        GameRegistry.registerPlayerTracker(new EIPlayerTracker());
    }
    
}
