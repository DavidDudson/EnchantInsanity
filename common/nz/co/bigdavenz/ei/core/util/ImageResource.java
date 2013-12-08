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

class Coordinate {

    int xPos;
    int yPos;

    public Coordinate(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;

    }

    public float getXPosAsFloat(){
        return (float)xPos;
    }

    public float getYPosAsFloat(){
        return (float)yPos;
    }
}

public class ImageResource {

    private static Minecraft mc = Minecraft.getMinecraft();
    private static TextureManager textureManager = mc.getTextureManager();
    private static GuiIngameForge gui = (GuiIngameForge) Minecraft.getMinecraft().ingameGUI;
    private static ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);

    private static int defaultBuffer = 50;

    private ResourceLocation resourceLocation;

    private int imageWidth;
    private int imageHeight;
    private float imageScale;
    private int scaledImageHeight;
    private int scaledImageWidth;

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
        drawIntoHudCentre(buffer, 1.0f);
    }

    public void drawIntoHudCentre(int buffer, float scale) {
        drawIntoHudCorner(ScreenLocation.MIDDLE_CENTRE, buffer, scale);
    }

    public void drawIntoHudatLocation(int xPos, int yPos) {
        drawIntoHudatLocation(xPos, yPos, 1.0f);
    }

    public void drawIntoHudatLocation(int xPos, int yPos, float scale) {
        textureManager.bindTexture(this.resourceLocation);
        scaleImage(scale);
        gui.drawTexturedModalRect(xPos, yPos, 0, 0, getImageWidth(), getImageHeight());
    }

    public void drawIntoHudCorner(ScreenLocation loc) {
        drawIntoHudCorner(loc, defaultBuffer);
    }

    public void drawIntoHudCorner(ScreenLocation loc, int buffer) {
        drawIntoHudCorner(loc, buffer, 1.0f);
    }

    public void drawIntoHudCorner(ScreenLocation loc, int buffer, float scale) {
        GL11.glPushMatrix();
        Coordinate coords = getPos(loc, buffer);
        textureManager.bindTexture(this.resourceLocation);
        scaleImage(scale);
        gui.drawTexturedModalRect(coords.xPos, coords.yPos, 0, 0, getImageWidth(), getImageHeight());
        GL11.glPopMatrix();

    }

    private void scaleImage(float scale) {
        GL11.glScalef(scale, scale, 1.0f);
        this.imageScale = scale;
        this.scaledImageWidth = (int)(imageWidth * scale);
        this.scaledImageHeight = (int)(imageHeight * scale);
    }

    private Coordinate getPos(ScreenLocation loc, int buffer) {

        switch (loc) {

            case TOP_LEFT:
                return new Coordinate(0 + buffer, 0 + buffer);

            case TOP_CENTRE:
                return new Coordinate((sr.getScaledWidth() - scaledImageWidth) / 2, 0 + buffer);

            case TOP_RIGHT:
                return new Coordinate(sr.getScaledWidth() - scaledImageWidth - buffer, 0 + buffer);

            case MIDDLE_LEFT:
                return new Coordinate(0 + buffer, sr.getScaledHeight() - scaledImageHeight / 2);

            case MIDDLE_CENTRE:
                return new Coordinate((sr.getScaledWidth() - scaledImageWidth) / 2, (sr.getScaledHeight() - scaledImageHeight) / 2);

            case MIDDLE_RIGHT:
                return new Coordinate(sr.getScaledWidth() - scaledImageWidth - buffer, (sr.getScaledHeight() - scaledImageHeight) / 2);

            case BOTTOM_LEFT:
                return new Coordinate(0 + buffer, sr.getScaledHeight() - scaledImageHeight - buffer);

            case BOTTOM_MIDDLE:
                return new Coordinate((sr.getScaledWidth() - scaledImageWidth) / 2, sr.getScaledHeight() - scaledImageHeight - buffer);

            case BOTTOM_RIGHT:
                return new Coordinate(sr.getScaledWidth() - scaledImageWidth - buffer, sr.getScaledHeight() - scaledImageHeight - buffer);

            default:
                return new Coordinate(0, 0);
        }
    }
}
