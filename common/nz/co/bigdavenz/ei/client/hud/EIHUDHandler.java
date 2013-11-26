package nz.co.bigdavenz.ei.client.hud;

import java.util.Arrays;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nz.co.bigdavenz.ei.client.render.RenderUtils;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class EIHUDHandler {

    public static boolean overrideVanillaHUD = false;
    public static boolean vanillaGUIOpen     = false;

    public static void drawHUD(Minecraft mc) {
        renderPlayerHotBar(mc);
    }

    private static void renderPlayerHotBar(Minecraft mc) {
        renderHotBarBlocks(mc);
    }

    private static void renderHotBarBlocks(Minecraft mc) {
        ItemStack[] mainInventory = mc.thePlayer.inventory.mainInventory;
        ItemStack[] hotbar = Arrays.copyOfRange(mainInventory, 0, 9);

        int posY = mc.displayHeight / 2 - mc.displayHeight / 25;
        int posX = 150;

        for (ItemStack item : hotbar) {
            if (item != null) {
                renderBlock(mc, item, posX, posY);
                posX += 20;
            }
        }
    }

    private static void renderBlock(Minecraft minecraft, ItemStack stack, int xPos, int yPos) {

        float overlayScale = 1.0f;
        int scale = (int) (8 * overlayScale);
        float blockScale = overlayScale;
        float overlayOpacity = 1.0f;

        GL11.glPushMatrix();
        ScaledResolution sr = new ScaledResolution(minecraft.gameSettings, minecraft.displayWidth, minecraft.displayHeight);
        GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, sr.getScaledWidth_double(), sr.getScaledHeight_double(), 0.0D, 1000.0D, 3000.0D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0F, 0.0F, -2000.0F);

        GL11.glPushMatrix();
        RenderHelper.enableGUIStandardItemLighting();
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        GL11.glEnable(GL11.GL_LIGHTING);

        if (minecraft.thePlayer.inventory.getCurrentItem() == stack) {
            if (!(stack.getItem() instanceof Item)) {
                RenderUtils.renderBlockIntoGUI(minecraft.fontRenderer, stack, xPos, yPos, -90, blockScale);
            } else {
                RenderUtils.renderRotatingBlockIntoGUI(minecraft.fontRenderer, stack, xPos, yPos, -90, blockScale);
            }
            GL11.glDisable(GL11.GL_LIGHTING);
        } else {
            // RenderBlocks.renderBlockAsItem(stack, scale, overlayOpacity);
            RenderUtils.renderItemIntoGUI(minecraft.fontRenderer, stack, xPos, yPos, 1.0f, 1.0f);
        }
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
