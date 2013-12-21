package nz.co.bigdavenz.ei.client.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraftforge.client.GuiIngameForge;
import nz.co.bigdavenz.ei.client.render.RenderText;
import nz.co.bigdavenz.ei.client.render.RenderUtils;
import nz.co.bigdavenz.ei.core.registry.ImageRegistry;
import nz.co.bigdavenz.ei.core.util.ScreenLocation;
import nz.co.bigdavenz.ei.core.util.UsefulFunctions;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;

public class EIHUDHandler {

    public static boolean overrideVanillaHUD = false;
    public static boolean vanillaGUIOpen = false;
    public static Minecraft mc = Minecraft.getMinecraft();
    public static GuiIngameForge gui = (GuiIngameForge) mc.ingameGUI;
    public static TextureManager textMan = mc.getTextureManager();
    public static ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
    public static int crosshairType = 1;


    public static void drawHUD() {

        GL11.glScalef(UsefulFunctions.getScaledScreenWidth(), UsefulFunctions.getScaledScreenHeight(), 1.0f);
        drawHotBar();
        drawArmourBar();
        drawCrosshair();

        RenderText.renderEIText("EI Hud activated", 50, 50, Color.orange);
        RenderText.renderEIText("", 10, 10, Color.white);


    }

    public static void drawArmourBar() {

        int yBuffer = 20;

        ImageRegistry.armourbarBacking.drawIntoHudCorner(ScreenLocation.MIDDLE_RIGHT);
        ImageRegistry.armourbarBacking.drawIntoHudCorner(ScreenLocation.MIDDLE_RIGHT, 50, 0, (ImageRegistry.armourbarBacking.getImageHeight() + yBuffer) * 1);
        ImageRegistry.armourbarBacking.drawIntoHudCorner(ScreenLocation.MIDDLE_RIGHT, 50, 0, (ImageRegistry.armourbarBacking.getImageHeight() + yBuffer) * 2);
        ImageRegistry.armourbarBacking.drawIntoHudCorner(ScreenLocation.MIDDLE_RIGHT, 50, 0, (ImageRegistry.armourbarBacking.getImageHeight() + yBuffer) * 3);
        ImageRegistry.armourbarBacking.drawIntoHudCorner(ScreenLocation.MIDDLE_RIGHT, 50, 0, (ImageRegistry.armourbarBacking.getImageHeight() + yBuffer) * 4);
        RenderUtils.renderItemIntoGUI(mc.fontRenderer,mc.thePlayer.inventory.armorInventory[1],1920/2, 1080/2, 1.0f, 1.0f);

    }

    public static void drawHotBar() {
        ImageRegistry.hotbarBacking.drawIntoHudCorner(ScreenLocation.BOTTOM_MIDDLE);
        ImageRegistry.hungerBar.drawIntoHudCorner(ScreenLocation.BOTTOM_MIDDLE, 50,ImageRegistry.hungerBar.getImageWidth()/2 + 4, - ImageRegistry.hotbarBacking.getImageHeight() + 104);


    }

    public static void drawCrosshair() {
        switch (crosshairType) {

            case 1:
                ImageRegistry.crosshairCircle.drawIntoHudCentre();
                break;
            case 2:
                ImageRegistry.crosshairCross.drawIntoHudCentre();
                break;
            case 3:
                ImageRegistry.crosshairHollowCross.drawIntoHudCentre();
                break;

            default:
                ImageRegistry.crosshairCross.drawIntoHudCentre();
        }
    }

    public static void setupOrtho() {
        ScaledResolution sr = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, mc.displayWidth, mc.displayHeight, 0.0D, 1000.0D, 3000.0D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, - 2000.0F);
    }

    public static void setupHUDRender() {
        setupOrtho();
        drawHUD();
    }
}
