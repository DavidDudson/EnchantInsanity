package BigDaveNz.EI.event;

import BigDaveNz.EI.core.handler.EIDebugHandler;
import BigDaveNz.EI.skill.Skill;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
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

/**
 * @author BigDaveNz
 * 
 */
public class EventHandler {

	private static boolean playerLoggedIn = false;

	public static void onPlayerLogin(EntityPlayer player) {

		String playerName = player.getEntityName();
		player.addChatMessage("Welcome to Enchant Insanity!");
		EIDebugHandler.sendDebugToPlayer("Debug mode is currently active", player);
		Skill.init(player);

		playerLoggedIn = true;
	}

	public static void onPlayerLogout(EntityPlayer player) {

		String playerName = player.getEntityName();
		playerLoggedIn = false;
		EIDebugHandler.sendDebugInfoToConsole(playerName + "logged out and EI is unloaded");
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
}
