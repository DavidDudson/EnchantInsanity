package nz.co.bigdavenz.ei.core.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.GuiIngameForge;
import nz.co.bigdavenz.ei.client.render.RenderUtils;
import org.lwjgl.opengl.GL11;

/**
 * Created by David J. Dudson on 8/12/13.
 * <p/>
 * Class that deals with Image's being loaded and
 */

class Coordinate {

    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public float getXPosAsFloat() {
        return (float) x;
    }

    public float getYPosAsFloat() {
        return (float) y;
    }
}

public class ImageResource {

    private static Minecraft mc = Minecraft.getMinecraft();
    private static TextureManager textureManager = mc.getTextureManager();
    private static GuiIngameForge gui = (GuiIngameForge) Minecraft.getMinecraft().ingameGUI;
    private ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);

    private static int defaultBuffer = 50;

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

    public void drawIntoHudCentre() {
        drawIntoHudCentre(defaultBuffer);
    }

    public void drawIntoHudCentre(int buffer) {
        drawIntoHudCorner(ScreenLocation.MIDDLE_CENTRE, buffer, 0, 0);
    }

    public void drawIntoHudatLocation(int xPos, int yPos) {
        drawIntoHudatLocation(xPos, yPos, 1.0f);
    }

    public void drawIntoHudatLocation(int xPos, int yPos, float scale) {
        textureManager.bindTexture(this.resourceLocation);
        scaleImage(scale * sr.getScaleFactor());
        gui.drawTexturedModalRect(xPos, yPos, 0, 0, getImageWidth(), getImageHeight());
    }

    public void drawIntoHudCorner(ScreenLocation loc) {
        drawIntoHudCorner(loc, defaultBuffer, 0, 0);
    }

    public void drawIntoHudCorner(ScreenLocation loc, int buffer, int xBuffer, int yBuffer) {
        Coordinate coords = getPos(loc, buffer, xBuffer, yBuffer);
        textureManager.bindTexture(this.resourceLocation);
        RenderUtils.drawTexturedQuad(coords.x, coords.y, this);

    }

    private void scaleImage(float scale) {
        GL11.glScalef(scale, scale, 1.0f);
    }

    private void scaleImage(float scaleX, float scaleY) {
        GL11.glScalef(scaleX, scaleY, 1.0f);
    }

    private Coordinate getPos(ScreenLocation loc, int buffer, int offsetX, int offsetY) {

        int displayWidth = 1920;
        int displayHeight = 1080;

        switch (loc) {

            case TOP_LEFT:
                return new Coordinate(buffer + offsetX, buffer + offsetY);

            case TOP_CENTRE:
                return new Coordinate((displayWidth - imageWidth) / 2 + offsetX, buffer + offsetY);

            case TOP_RIGHT:
                return new Coordinate(displayWidth - imageWidth - buffer + offsetX, buffer + offsetY);

            case MIDDLE_LEFT:
                return new Coordinate(buffer + offsetX, (displayHeight - imageHeight) / 2 + offsetY);

            case MIDDLE_CENTRE:
                return new Coordinate((displayWidth - imageWidth) / 2 + offsetX, (displayHeight - imageHeight) / 2 + offsetY);

            case MIDDLE_RIGHT:
                return new Coordinate(displayWidth - imageWidth - buffer + offsetX, (displayHeight - imageHeight) / 2 + offsetY);

            case BOTTOM_LEFT:
                return new Coordinate(buffer + offsetX, displayHeight - imageHeight - buffer + offsetY);

            case BOTTOM_MIDDLE:
                return new Coordinate((displayWidth - imageWidth) / 2 + offsetX, displayHeight - imageHeight - buffer + offsetY);

            case BOTTOM_RIGHT:
                return new Coordinate(displayWidth - imageWidth - buffer + offsetX, displayHeight - imageHeight - buffer + offsetY);

            default:
                return new Coordinate(0, 0);
        }
    }

    private Coordinate getPos(ScreenLocation loc, int buffer) {
        return getPos(loc, buffer, 0, 0);
    }

    private Coordinate getPos(ScreenLocation loc) {
        return getPos(loc, defaultBuffer);
    }
}
