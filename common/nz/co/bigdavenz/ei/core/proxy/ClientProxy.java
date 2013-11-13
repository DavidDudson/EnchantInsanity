package nz.co.bigdavenz.ei.core.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import nz.co.bigdavenz.ei.gui.MainGUI;

/**
 * Enchant Insantiy
 * 
 * Created by BigDaveNz
 * 
 * Client Proxy Class
 */

public class ClientProxy extends CommonProxy {}
// @Override
// public Object getClientGuiElement(int ID, EntityPlayer player, World world,
// int x, int y, int z) {
// TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
// if (tileEntity != null) {
// switch (ID) {
// case 0:
// MainGUI.drawScreen(x, y, 1.0f);