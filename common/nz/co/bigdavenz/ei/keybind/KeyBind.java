package nz.co.bigdavenz.ei.keybind;

import java.util.EnumSet;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import nz.co.bigdavenz.ei.EnchantInsanity;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class KeyBind extends KeyHandler {

	public static boolean EiKeyPressed = false;

	private EnumSet tickTypes = EnumSet.of(TickType.CLIENT);

	public static void init() {
		KeyBinding[] key = { new KeyBinding("EI MegaButton", Keyboard.KEY_GRAVE) };
		boolean[] repeat = { false };
		KeyBindingRegistry.registerKeyBinding(new KeyBind(key, repeat));
		EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Keybind's Initialized",DebugType.KEYBIND));
	}

	public KeyBind(KeyBinding[] keyBindings, boolean[] repeatings) {
		super(keyBindings, repeatings);
	}

	@Override
	public String getLabel() {
		return "EI MegaButton";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb,
			boolean tickEnd, boolean isRepeat) {
		if (EiKeyPressed) {
			EiKeyPressed = false;
		} else if (!EiKeyPressed) {
			EiKeyPressed = true;
		}
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
	}

	@Override
	public EnumSet<TickType> ticks() {
		return tickTypes;
	}
}
