package nz.co.bigdavenz.ei.keybind;

import net.minecraft.client.settings.KeyBinding;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.hud.EIHUDHandler;

public class EIKeyPress {

    public static void processMenuCommand(KeyBinding kb) {
        KeyBind.EIKeyPressed = false;
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Menu Opened:", DebugType.GUI));

    }

    public static void processHUDCommand() {
        KeyBind.EIKeyPressed = false;
        EIHUDHandler.overrideVanillaHUD = !EIHUDHandler.overrideVanillaHUD;

    }
}
