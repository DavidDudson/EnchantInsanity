package nz.co.bigdavenz.ei.core.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.GuiIngameForge;
import org.lwjgl.opengl.GL11;

/**
 * Created by David J. Dudson on 8/12/13.
 * <p/>
 * Class that deals with Image's being loaded and
 */
public class ImageResource {

    private static Minecraft mc = Minecraft.getMinecraft();
    private static TextureManager textureManager = mc.getTextureManager();
    private static GuiIngameForge gui = (GuiIngameForge) Minecraft.getMinecraft().ingameGUI;
    private static ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);

    private ResourceLocation resourceLocation;

    private int imageWidth;
    private int imageHeight;

    public ImageResource(ResourceLocation res, int width, int height) {
        this.resourceLocation = res;
        this.imageWidth = width;
        this.imageHeight = height;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public ResourceLocation getRes() {
        return resourceLocation;
    }

    public void drawIntoHud(int xPos, int yPos) {
        GL11.glPushMatrix();
        textureManager.bindTexture(this.resourceLocation);
        gui.drawTexturedModalRect(xPos, yPos, 0, 1, getImageWidth(), getImageHeight());
        GL11.glPopMatrix();
    }
}
