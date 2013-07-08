package BigDaveNz.EI.player;

import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;
import BigDaveNz.EI.event.EventHandler;

public class EIPlayerTracker implements IPlayerTracker{

    @Override
    public void onPlayerLogin(EntityPlayer player) {
        EventHandler.onPlayerLogin(player);
    }

    @Override
    public void onPlayerLogout(EntityPlayer player) {
    }

    @Override
    public void onPlayerChangedDimension(EntityPlayer player) {
    }

    @Override
    public void onPlayerRespawn(EntityPlayer player) {
    }


}
