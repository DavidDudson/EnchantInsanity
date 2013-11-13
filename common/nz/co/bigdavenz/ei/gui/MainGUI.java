package nz.co.bigdavenz.ei.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import nz.co.bigdavenz.ei.lib.Reference;

import org.lwjgl.opengl.GL11;

public class MainGUI extends GuiScreen {
	@Override
	public void drawScreen(int x, int y, float f) {
		drawDefaultBackground();

		ResourceLocation location = new ResourceLocation(Reference.MOD_NAME, "/logo.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.renderEngine.bindTexture(location);

		int posX = (this.width - 211) / 2;
		int posY = (this.height - 47) / 2;

		drawTexturedModalRect(posX, posY, 0, 0, 211, 47);

		super.drawScreen(x, y, f);
	}
}
