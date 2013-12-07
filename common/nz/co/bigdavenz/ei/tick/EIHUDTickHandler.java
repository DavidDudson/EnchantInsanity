package nz.co.bigdavenz.ei.tick;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.GuiIngameForge;
import nz.co.bigdavenz.ei.client.hud.EIHUDHandler;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.IScheduledTickHandler;
import cpw.mods.fml.common.TickType;

public class EIHUDTickHandler implements IScheduledTickHandler {

    @Override
    public EnumSet<TickType> ticks() {
        return EnumSet.of(TickType.CLIENT, TickType.RENDER);
    }

    @Override
    public String getLabel() {
        return "EIHUD";
    }

    @Override
    public void tickStart(EnumSet<TickType> type, Object... tickData) {
    }

    @Override
    public void tickEnd(EnumSet<TickType> type, Object... tickData) {
        if (type.equals(EnumSet.of(TickType.RENDER))) {
            Minecraft mc = FMLClientHandler.instance().getClient();
            EntityPlayer player = mc.thePlayer;
            if (mc.currentScreen == null && EIHUDHandler.vanillaGUIOpen) {
                EIHUDHandler.vanillaGUIOpen = false;
                EIHUDHandler.overrideVanillaHUD = true;
            }

            if (mc.currentScreen == null && EIHUDHandler.overrideVanillaHUD && player != null) {
                EIHUDHandler.setupHUDRender();
            } else if (mc.currentScreen != null && EIHUDHandler.overrideVanillaHUD && player != null) {
                EIHUDHandler.overrideVanillaHUD = false;
                EIHUDHandler.vanillaGUIOpen = true;
            }
        }
    }

    @Override
    public int nextTickSpacing() {
        // TODO Auto-generated method stub
        return 0;
    }
}
