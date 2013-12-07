package nz.co.bigdavenz.ei.item;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by David J. Dudson on 5/12/13.
 */
public class EISkull {

    public static ItemStack getPlayerHead(String playerName){
        ItemStack head = new ItemStack(Block.skull);
        head.setItemName(playerName + "'s Skull");
        NBTTagCompound compound = changeSkullNBT(head.getTagCompound(), playerName);
        head.writeToNBT(compound);
        return head;
    }

    public static NBTTagCompound changeSkullNBT(NBTTagCompound compound, String playerName){
                    compound.setString("ExtraType", playerName);
                    return compound;
    }
}
