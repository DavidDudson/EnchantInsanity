package nz.co.bigdavenz.ei.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import nz.co.bigdavenz.ei.lib.Colours;
import nz.co.bigdavenz.ei.lib.ResourcePaths;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;

/**
 * Created by David J. Dudson on 7/12/13.
 */
public class RenderText {


    public static void renderEIText(String string, float posX, float posY, Color colour){
        Color.white.bind();
        EIFont.mainFont.drawString(posX, posY, string, colour);
    }
}
