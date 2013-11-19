package nz.co.bigdavenz.ei.player;

import net.minecraft.entity.player.EntityPlayer;
import nz.co.bigdavenz.ei.event.EIEvent;
import cpw.mods.fml.common.IPlayerTracker;

public class EIPlayerTracker implements IPlayerTracker{

    @Override
    public void onPlayerLogin(EntityPlayer player) {
        EIEvent.onPlayerLogin(player);
    }

    @Override
    public void onPlayerLogout(EntityPlayer player) {
        EIEvent.onPlayerLogout(player);
    }

    @Override
    public void onPlayerChangedDimension(EntityPlayer player) {
    }

    @Override
    public void onPlayerRespawn(EntityPlayer player) {
    }
}
