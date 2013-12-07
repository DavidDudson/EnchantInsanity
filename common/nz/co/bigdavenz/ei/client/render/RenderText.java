package nz.co.bigdavenz.ei.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import nz.co.bigdavenz.ei.lib.Colours;

/**
 * Created by David J. Dudson on 7/12/13.
 */
public class RenderText {
    public static FontRenderer fontRenderer = Minecraft.getMinecraft().fontRenderer;

    public static void renderEIText(String string, int poxX, int posY, int colour){
        fontRenderer.drawStringWithShadow(string, poxX, posY, colour);
    }

    public static void renderEIText(String string, int poxX, int posY){
        fontRenderer.drawStringWithShadow(string, poxX, posY, Colours.WHITE);
    }
}
