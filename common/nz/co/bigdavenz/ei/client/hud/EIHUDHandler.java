package nz.co.bigdavenz.ei.client.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraftforge.client.GuiIngameForge;
import nz.co.bigdavenz.ei.core.registry.ImageRegistry;
import nz.co.bigdavenz.ei.core.util.ImageResource;
import nz.co.bigdavenz.ei.core.util.ScreenLocation;
import org.lwjgl.opengl.GL11;

public class EIHUDHandler {

    public static boolean overrideVanillaHUD = false;
    public static boolean vanillaGUIOpen = false;
    public static Minecraft mc = Minecraft.getMinecraft();
    public static GuiIngameForge gui = (GuiIngameForge) mc.ingameGUI;
    public static TextureManager textMan = mc.getTextureManager();
    public static ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);

    public static void drawHUD() {

        mc.fontRenderer.drawStringWithShadow("EI HUD is on", 10, 10, 0xFFFFFF);
        drawHotBar();


    }

    public static void drawHotBar() {
        GL11.glPushMatrix();
        //ImageRegistry.hotbarBacking.drawIntoHudCentre();
        //ImageRegistry.hungerBar.drawIntoHud(10,10);
        //ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.TOP_LEFT, 50, 0.0625f);
        //ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.TOP_CENTRE, 10, 0.0625f);
        //ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.TOP_RIGHT, 10, 0.125f);
        //ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.MIDDLE_LEFT, 10, 0.125f);
        //ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.MIDDLE_CENTRE, 10, 0.125f);
        //ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.MIDDLE_RIGHT, 10, 0.125f);
        //ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.BOTTOM_LEFT, 10, 0.125f);
        ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.BOTTOM_MIDDLE, 10, 0.0625f);
        //ImageRegistry.iconOffence.drawIntoHudCorner(ScreenLocation.BOTTOM_RIGHT, 50, 0.0625f);
        GL11.glPopMatrix();


    }

    public static void setupOrtho() {
        ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, sr.getScaledWidth_double(), sr.getScaledHeight_double(), 0.0D, 1000.0D, 3000.0D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, - 2000.0F);
    }

    public static void setupHUDRender() {
        setupOrtho();
        drawHUD();
    }
}
