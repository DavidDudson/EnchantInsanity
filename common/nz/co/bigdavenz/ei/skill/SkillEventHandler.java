package nz.co.bigdavenz.ei.skill;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.IExtendedEntityProperties;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.event.EIEventType;
import nz.co.bigdavenz.ei.lib.XPModifiers;

public class SkillEventHandler {

    public static void processLivingHurtEvent(LivingHurtEvent event) {
        int xpGain = 0;
        if (event.entityLiving instanceof EntityPlayerMP) {
            SkillLivingEvent skillEvent = new SkillLivingEvent(event, EIEventType.PLAYER_HURT);
            int amount = (int) event.ammount;
            DamageSource damageSource = event.source;
            String damageType = damageSource.getDamageType();

            switch (damageType) {

                case "fall":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_FALL;
                    break;
                case "infire":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_IN_FIRE;
                    break;
                case "onfire":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_ON_FIRE;
                    break;
                case "starve":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_STARVE;
                    break;
                case "drown":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_DROWN;
                    break;
                case "inWall":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_IN_WALL;
                    break;
                case "outOfWorld":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_OUT_OF_WORLD;
                    break;
                case "generic":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_GENERIC;
                    break;
                case "magic":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_MAGIC;
                    break;
                case "wither":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_WITHER;
                    break;
                case "anvil":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_ANVIL;
                    break;
                case "fallingBlock":
                    xpGain = amount * XPModifiers.XP_PER_DAMAGE_FALLING_BLOCK;
                    break;
                default:
                    EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("unaccounted for damage type: " + damageType, DebugType.TRACKING));

            }
            EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Player: " + skillEvent.getPlayerName() + " Was hurt by: " + damageType + ". Amount: " + amount + ". XP Gain: " + xpGain, DebugType.TRACKING));
        }
    }

    public static void processLivingJumpEvent(LivingJumpEvent event) {
        EntityPlayerMP player = (EntityPlayerMP) event.entityLiving;
        String playerName = player.getEntityName();
        IExtendedEntityProperties props = player.getExtendedProperties("EI");
        int xpGain = 1;
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Player: " + playerName + "Jumped. XP Gain: " + xpGain, DebugType.TRACKING));
    }

    public static void processLivingAttackEvent(AttackEntityEvent event){
        
        if(event.entity instanceof EntityPlayerMP){
            SkillLivingEvent attackerEvent = new SkillLivingEvent(event, EIEventType.PLAYER_ATTACK);
        }
        if(event.target instanceof EntityPlayerMP){
            SkillLivingEvent defenderEvent = new SkillLivingEvent(event, EIEventType.PLAYER_DEFEND);
        }
    }
}
