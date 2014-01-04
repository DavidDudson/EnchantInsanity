package nz.co.bigdavenz.ei.client.keybind;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by David J. Dudson on 3/01/14.
 */
public class KeyHandler {

    public static final int EIKEY = Keyboard.KEY_GRAVE;

    public static Map<Integer, Boolean> activeKeys = new HashMap<>();

    public static void init() {

        while (Keyboard.next())

        {
            if (Keyboard.getEventKeyState()) {
                processKeyPress(Keyboard.getEventKey());
            } else {
                processKeyRelease(Keyboard.getEventKey());
            }
        }
    }

    private static void processKeyRelease(int eventKey) {
        if (activeKeys.containsKey(eventKey)) {
            if (activeKeys.get(eventKey)) {
                activeKeys.replace(eventKey, false);
            }
        } else {
            activeKeys.put(eventKey, false);
        }
    }

    public static void processKeyPress(int eventKey) {

        if (activeKeys.containsKey(eventKey)) {
            if (! activeKeys.get(eventKey)) {
                activeKeys.replace(eventKey, true);
            }
        } else {
            activeKeys.put(eventKey, true);
        }


        if (activeKeys.get(EIKEY)) {

            switch (eventKey) {

                case Keyboard.KEY_1:
                    EIKeyPress.processHUDCommand();

                case Keyboard.KEY_2:
                    if (Minecraft.getMinecraft().currentScreen == null) {
                        EIKeyPress.processMenuCommand();
                    }
            }
        }
    }
}
