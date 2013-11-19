package nz.co.bigdavenz.ei.keybind;

import java.util.EnumSet;

import net.minecraft.client.settings.KeyBinding;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class KeyBind extends KeyHandler {

    public static boolean EIKeyDown = false;

    private final EnumSet tickTypes = EnumSet.of(TickType.CLIENT);

    public static boolean EIKeyPressed;

    public static void init() {

        KeyBinding[] EIKeyBindings = {
                new KeyBinding("EI MegaButton", Keyboard.KEY_GRAVE),
                new KeyBinding("Menu Button", Keyboard.KEY_1),
                new KeyBinding("HUD Switch", Keyboard.KEY_2) };

        boolean[] repeat = new boolean[EIKeyBindings.length];

        KeyBindingRegistry.registerKeyBinding(new KeyBind(EIKeyBindings, repeat));

        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Keybind's Initialized", DebugType.KEYBIND));
    }

    public KeyBind(KeyBinding[] keyBindings, boolean[] repeatings) {
        super(keyBindings, repeatings);
    }

    @Override
    public String getLabel() {
        return "EI Keybindings";
    }

    @Override
    public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat) {
        switch (kb.keyDescription) {

            case "EI MegaButton":
                EIKeyDown = true;

            case "Menu Button":
                if (EIKeyPressed) {
                    EIKeyPress.processMenuCommand(kb);
                }

            case "HUD Switch":
                if (EIKeyPressed) {
                    EIKeyPress.processHUDCommand();
                }
        }
    }

    @Override
    public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
        if (EIKeyDown) {
            EIKeyPressed = true;
            EIKeyDown = false;
        }
    }

    @Override
    public EnumSet<TickType> ticks() {
        return tickTypes;
    }
}
