/**
 * 
 */
package nz.co.bigdavenz.ei.world;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.WorldSavedData;
import nz.co.bigdavenz.ei.lib.Reference;

/**
 * @author BigDaveNz
 * 
 */
public class EIWorldSavedData extends WorldSavedData {

    /**
     * @param par1Str
     */
    public EIWorldSavedData(String par1Str) {
        super(par1Str);
    }

    @Override
    public void writeToNBT(NBTTagCompound nbttagcompound) {
        NBTTagCompound eiWorldNBT = new NBTTagCompound();
        eiWorldNBT.setString("version", Reference.MOD_VERSION);
        eiWorldNBT.setTag("eiWorldData", eiWorldNBT);
    }

    @Override
    public void readFromNBT(NBTTagCompound eiWorldNBT) {
        eiWorldNBT.getCompoundTag("eiWorldData");
    }
}
