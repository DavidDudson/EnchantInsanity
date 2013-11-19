package nz.co.bigdavenz.ei.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.hud.EIHUDHandler;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.player.EIPlayerProperties;
import nz.co.bigdavenz.ei.skill.SkillEventHandler;

/**
 * @author BigDaveNz
 * 
 */
public class EIEvent {

    public static void onPlayerLogin(EntityPlayer player) {
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage(player.getEntityName() + " logged In!", DebugType.EVENT));
    }

    public static void onPlayerLogout(EntityPlayer player) {

        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage(player.getEntityName() + "logged out and EI info is unloaded", DebugType.EVENT));
    }

    @ForgeSubscribe
    public void onEntityConstruct(EntityConstructing event) {
        if (event.entity instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) event.entity;
            player.registerExtendedProperties(Reference.MOD_NAME, new EIPlayerProperties());
        }
    }

    @ForgeSubscribe
    public void EntityUpdate(LivingEvent event) {
    }

    @ForgeSubscribe
    public void LivingJumpEvent(LivingEvent event) {
        // if (event.entityLiving instanceof EntityPlayerMP) {
        // SkillEventHandler.processLivingJumpEvent((net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent) event);
        // }
    }

    @ForgeSubscribe
    public void onPlayerJoinWorld(EntityJoinWorldEvent event) {
    }

    @ForgeSubscribe
    public void onLivingAttack(LivingAttackEvent event) {

    }

    @ForgeSubscribe
    public void onLivingDeath(LivingDeathEvent event) {
    }

    @ForgeSubscribe
    public void onLivingHurt(LivingHurtEvent event) {
        SkillEventHandler.processLivingHurtEvent(event);
    }

    @ForgeSubscribe
    public void onLivingFall(LivingFallEvent event) {
    }

    @ForgeSubscribe
    public void onArrowLoose(ArrowLooseEvent event) {
    }

    @ForgeSubscribe
    public void onAttackEntity(AttackEntityEvent event) {
    }

    @ForgeSubscribe
    public void onBoneMeal(BonemealEvent event) {
    }

    @ForgeSubscribe
    public void onFillBucket(FillBucketEvent event) {
    }

    @ForgeSubscribe
    public void onPlayerInteract(PlayerInteractEvent event) {
    }

    @ForgeSubscribe
    public void onPlayerSleep(PlayerSleepInBedEvent event) {
    }

    @ForgeSubscribe
    public void onUseHoe(UseHoeEvent event) {
    }

    @ForgeSubscribe
    public void onRenderGameOverlay(RenderGameOverlayEvent event) {
        if (EIHUDHandler.overrideVanillaHUD) {
            event.setCanceled(true);
        }
    }

}
