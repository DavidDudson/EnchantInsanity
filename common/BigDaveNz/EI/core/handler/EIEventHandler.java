package BigDaveNz.EI.core.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import BigDaveNz.EI.event.EIEvent;
import BigDaveNz.EI.player.EIPlayerTracker;
import net.minecraftforge.common.MinecraftForge;

public class EIEventHandler {

    public static void init(){
        MinecraftForge.EVENT_BUS.register(new EIEvent());
        GameRegistry.registerPlayerTracker(new EIPlayerTracker());
    }
    
}
