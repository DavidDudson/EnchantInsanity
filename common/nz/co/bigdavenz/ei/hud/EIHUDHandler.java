package nz.co.bigdavenz.ei.hud;

import net.minecraft.client.gui.GuiIngame;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;

public class EIHUDHandler {

    public static boolean overrideVanillaHUD = false;

    public static void drawHUD(GuiIngame hud) {
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Switched to EI HUD", DebugType.HUD));
    }

}
