package nz.co.bigdavenz.ei.client.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraftforge.client.GuiIngameForge;
import nz.co.bigdavenz.ei.client.render.RenderUtils;
import nz.co.bigdavenz.ei.core.registry.ImageRegistry;
import nz.co.bigdavenz.ei.lib.ResourcePaths;
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
        ImageRegistry.hotbarBacking.drawIntoHud(sr.getScaledWidth()/2 - ImageRegistry.hotbarBacking.getImageWidth()/2,sr.getScaledHeight()- ImageRegistry.hotbarBacking.getImageHeight());
    }

    public static void setupOrtho() {
        ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, scaledresolution.getScaledWidth_double(), scaledresolution.getScaledHeight_double(), 0.0D, 1000.0D, 3000.0D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, - 2000.0F);
    }

    public static void setupHUDRender() {
        setupOrtho();
        drawHUD();
    }
}
