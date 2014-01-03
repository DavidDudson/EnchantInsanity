package nz.co.bigdavenz.ei.client.keybind;

import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * Created by David J. Dudson on 3/01/14.
 */
public class KeyHandler {

    InputEvent.KeyInputEvent event = null;

    public static boolean isKeyStateDown(){
        if(Keyboard.getEventKeyState()){
            return
        }
    }

    public void processKeyPress(InputEvent.KeyInputEvent event) {

        this.event = event;

        switch (Keyboard.getEventKey()){

            case Keyboard.KEY_GRAVE:

        }
    }
}
