package nz.co.bigdavenz.ei.client.render;

import net.minecraft.client.Minecraft;
import nz.co.bigdavenz.ei.lib.ResourcePaths;
import org.newdawn.slick.TrueTypeFont;

import java.awt.*;
import java.io.InputStream;

/**
 * Created by David J. Dudson on 9/12/13.
 * <p/>
 * Custom font for use with Enchant Insanity
 */
public class EIFont {

    public static TrueTypeFont mainFont;

    private static InputStream fontStream;


    public static void init() {

        try {
            fontStream = Minecraft.getMinecraft().getResourceManager().getResource(ResourcePaths.PATH_FONT).getInputStream();
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStream);
            font.deriveFont(12f);
            mainFont = new TrueTypeFont(font, true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
