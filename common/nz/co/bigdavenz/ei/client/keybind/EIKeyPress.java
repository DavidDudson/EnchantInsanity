package nz.co.bigdavenz.ei.client.keybind;

import net.minecraft.client.settings.KeyBinding;
import nz.co.bigdavenz.ei.client.hud.EIHUDHandler;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;

public class EIKeyPress {

    public static void processMenuCommand(KeyBinding kb) {
        KeyBind.EIKeyPressed = false;
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Menu Opened:", DebugType.GUI));

    }

    public static void processHUDCommand() {
        KeyBind.EIKeyPressed = false;
        EIHUDHandler.overrideVanillaHUD = !EIHUDHandler.overrideVanillaHUD;
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("EI HUD Switch", DebugType.HUD));

    }
}
