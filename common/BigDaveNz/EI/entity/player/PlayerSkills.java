package BigDaveNz.EI.entity.player;

import net.minecraft.nbt.NBTTagCompound;

/**
Enchant Insantiy

Created by BigDaveNz

Skill XP calculation and level calculation
*/

public class PlayerSkills {
    
    public int UNBREAKING_XP = 0;
    
    public void writeCapabilitiesToNBT(NBTTagCompound par1NBTTagCompound)
    {
        NBTTagCompound nbttagcompound1 = new NBTTagCompound();
        nbttagcompound1.setBoolean("invulnerable", this.disableDamage);
        nbttagcompound1.setBoolean("flying", this.isFlying);
        nbttagcompound1.setBoolean("mayfly", this.allowFlying);
        nbttagcompound1.setBoolean("instabuild", this.isCreativeMode);
        nbttagcompound1.setBoolean("mayBuild", this.allowEdit);
        nbttagcompound1.setFloat("flySpeed", this.flySpeed);
        nbttagcompound1.setFloat("walkSpeed", this.walkSpeed);
        par1NBTTagCompound.setTag("abilities", nbttagcompound1);
}
