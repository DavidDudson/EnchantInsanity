package nz.co.bigdavenz.ei.client.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraftforge.client.GuiIngameForge;
import nz.co.bigdavenz.ei.client.render.EIFont;
import nz.co.bigdavenz.ei.client.render.RenderText;
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

        GL11.glScalef(UsefulFunctions.getScaledScreenWidth(),UsefulFunctions.getScaledScreenHeight(), 1.0f);
        //RenderText.eiFontRenderer.drawStringWithShadow("EI HUD is on", 10, 10, 0xFFFFFF);
        drawHotBar();
        drawCrosshair();

        RenderText.renderEIText("EI Hud activated", 10,10,Color.orange);



    }

    public static void drawHotBar() {
        ImageRegistry.hotbarBacking.drawIntoHudCorner(ScreenLocation.BOTTOM_MIDDLE);
        //RenderText.eiFontRenderer.drawStringWithShadow(mc.thePlayer.getHealth() + "/" + mc.thePlayer.getMaxHealth(), 830, 944, 0xFFFFFF);


    }

    public static void drawCrosshair(){
        switch (crosshairType){

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
