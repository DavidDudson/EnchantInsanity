package nz.co.bigdavenz.ei.event;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
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
import net.minecraftforge.event.entity.player.EntityInteractEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.core.util.EILogger;
import nz.co.bigdavenz.ei.leaderboard.GlobalLeaderboard;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.player.EIPlayer;
import nz.co.bigdavenz.ei.skill.Skill;

/**
 * @author BigDaveNz
 * 
 */
public class EIEvent {

    public static void onPlayerLogout(EntityPlayer player) {

        String playerName = player.getEntityName();
        EIDebugHandler.sendDebugInfoToConsole(playerName + "logged out and EI info is unloaded");
    }

    @ForgeSubscribe
    public void EntityEvent(EntityConstructing event) {
        if (event.entity instanceof EntityPlayer) {
            EIPlayer.createEIPlayer((EntityPlayer) event.entity);
        }
    }

    @ForgeSubscribe
    public void EntityUpdate(LivingEvent event) {}

    @ForgeSubscribe
    public void LivingJumpEvent(LivingEvent event) {}

    @ForgeSubscribe
    public void onPlayerJoinWorld(EntityJoinWorldEvent event) {}

    @ForgeSubscribe
    public void onLivingAttack(LivingAttackEvent event) {}

    @ForgeSubscribe
    public void onLivingDeath(LivingDeathEvent event) {}

    @ForgeSubscribe
    public void onLivingHurt(LivingHurtEvent event) {
        EILivingHurt.process(event);
    }

    @ForgeSubscribe
    public void onLivingFall(LivingFallEvent event) {}

    @ForgeSubscribe
    public void onArrowLoose(ArrowLooseEvent event) {}

    @ForgeSubscribe
    public void onAttackEntity(AttackEntityEvent event) {}

    @ForgeSubscribe
    public void onBoneMeal(BonemealEvent event) {}

    @ForgeSubscribe
    public void onFillBucket(FillBucketEvent event) {}

    @ForgeSubscribe
    public void onPlayerInteract(PlayerInteractEvent event) {}

    @ForgeSubscribe
    public void onPlayerSleep(PlayerSleepInBedEvent event) {}

    @ForgeSubscribe
    public void onUseHoe(UseHoeEvent event) {}
}
