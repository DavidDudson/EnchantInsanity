package nz.co.bigdavenz.ei.hud;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class EIHUDTickHandler implements ITickHandler {

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
            Minecraft mc = Minecraft.getMinecraft();

            if (mc.currentScreen == null && EIHUDHandler.overrideVanillaHUD) {
                GuiIngame hud = new GuiIngame(mc);
                EIHUDHandler.drawHUD(hud);
            }
        }
    }
}
