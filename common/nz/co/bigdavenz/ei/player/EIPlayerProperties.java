package nz.co.bigdavenz.ei.player;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.skill.EISkill;

import java.util.List;

public class EIPlayerProperties implements IExtendedEntityProperties {

    EntityPlayerMP player;
    NBTTagCompound EICompound        = new NBTTagCompound("EIData");
    NBTTagCompound EISkillData       = new NBTTagCompound("EISkillData");
    NBTTagCompound EIAbilityData     = new NBTTagCompound("EIAbilityData");
    NBTTagCompound EIEnchantmentData = new NBTTagCompound("EIEnchantmentData");
    NBTTagCompound EIOwnershipData   = new NBTTagCompound("EIOwnershipData");
    NBTTagCompound EIMiscData        = new NBTTagCompound("EIMiscData");

    public static EIPlayerProperties getPlayerProperties(EntityPlayerMP player) {
        return (EIPlayerProperties) player.getExtendedProperties(Reference.MOD_NAME);
    }

    @Override
    public void saveNBTData(NBTTagCompound compound) {
        EIMiscData.setString("EI Save Version", Reference.MOD_VERSION);
        compound.setCompoundTag("EISkillData", EISkillData);
        compound.setCompoundTag("EIEnchantmentData", EIEnchantmentData);
        compound.setCompoundTag("EIAbilityData", EIAbilityData);
        compound.setCompoundTag("EIOwnershipData", EIOwnershipData);
        compound.setCompoundTag("EIMiscData", EIMiscData);
        EICompound.setTag("EIData", compound);

    }

    @Override
    public void loadNBTData(NBTTagCompound compound) {
        if (compound.hasKey("EISkillData")) {
            this.EISkillData = compound.getCompoundTag("EISkillData");
        } else {
            this.EISkillData = generateSkillData();
        }

        if (compound.hasKey("EIEnchantmentData")) {
            this.EIEnchantmentData = compound.getCompoundTag("EIEnchantmentData");
        } else {
            this.EIEnchantmentData = generateEnchantmentData();
        }

        if (compound.hasKey("EIAbilityData")) {
            this.EIAbilityData = compound.getCompoundTag("EIAbilityData");
        } else {
            this.EIAbilityData = generateAbilityData();
        }

        if (compound.hasKey("EIOwnershipData")) {
            this.EIOwnershipData = compound.getCompoundTag("EIOwnershipData");
        } else {
            this.EIOwnershipData = generateOwnershipData();
        }

        if (compound.hasKey("EIMiscData")) {
            this.EIMiscData = compound.getCompoundTag("EIMiscData");
        } else {
            this.EIMiscData = generateMiscData();
        }
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("NBT's Initialised for: " + player.getEntityName() + "... Class: " + player.getClass(), DebugType.NBT));

    }

    private NBTTagCompound generateMiscData() {
        NBTTagCompound miscCompound = new NBTTagCompound("EIMiscData");
        miscCompound.setString("EI Save Version", Reference.MOD_VERSION);
        return miscCompound;
    }

    private NBTTagCompound generateOwnershipData() {
        NBTTagCompound ownershipCompound = new NBTTagCompound("EIOwnershipData");
        return ownershipCompound;
    }

    private NBTTagCompound generateAbilityData() {
        NBTTagCompound abilitiesCompound = new NBTTagCompound("EIAbilityData");
        return abilitiesCompound;
    }

    private NBTTagCompound generateEnchantmentData() {
        NBTTagCompound enchantmentsCompound = new NBTTagCompound("EIEnchantmentData");
        return enchantmentsCompound;
    }

    private NBTTagCompound generateSkillData() {
        NBTTagCompound skillsCompound = new NBTTagCompound("EISkillData");
        for (EISkill skill : EISkill.skillList) {
            String skillName = skill.getSkillName();
            NBTTagCompound skillCompound = new NBTTagCompound(skillName);
            skillCompound.setInteger("XP", 0);
            skillsCompound.setCompoundTag(skillName, skillCompound);
        }
        return skillsCompound;
    }

    @Override
    public void init(Entity entity, World world) {
        player = (EntityPlayerMP) entity;
        loadNBTData(EICompound);
        saveNBTData(EICompound);
    }

    public int getSkillXP(String skillName) {
        NBTTagCompound compound = EISkillData.getCompoundTag(skillName);
        return compound.getInteger("XP");
    }

    public void addSkillXP(String skillName, int xpGain) {
        int currentXP = getSkillXP(skillName);
        int newXP = currentXP + xpGain;
        NBTTagCompound newCompound = EISkillData.getCompoundTag(skillName);
        newCompound.setInteger("XP", newXP);
        EISkillData.setCompoundTag(skillName, newCompound);
        EIDebugHandler.tempDebugToConsole(skillName + " " + xpGain);
    }
}
