package nz.co.bigdavenz.ei.event;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.player.*;
import nz.co.bigdavenz.ei.client.hud.EIHUDHandler;
import nz.co.bigdavenz.ei.client.keybind.KeyHandler;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.core.util.UsefulFunctions;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.player.EIPlayerProperties;

/**
 * @author BigDaveNz
 */
public class EIEvent {

    @SubscribeEvent
    public static void onRenderTick(TickEvent.RenderTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            Minecraft mc = FMLClientHandler.instance().getClient();
            EntityPlayer player = mc.thePlayer;
            if (mc.currentScreen == null && EIHUDHandler.vanillaGUIOpen) {
                EIHUDHandler.vanillaGUIOpen = false;
                EIHUDHandler.overrideVanillaHUD = true;
            }

            if (mc.currentScreen == null && EIHUDHandler.overrideVanillaHUD && player != null) {
                EIHUDHandler.setupHUDRender();
            } else if (mc.currentScreen != null && EIHUDHandler.overrideVanillaHUD && player != null) {
                EIHUDHandler.overrideVanillaHUD = false;
                EIHUDHandler.vanillaGUIOpen = true;
            }
        }
    }

    @SubscribeEvent
    public static void onKeyboardInput(InputEvent.KeyInputEvent event){
        KeyHandler.processKeyPress(event);
    }

    @SubscribeEvent
    public static void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {
        PlayerLoginEvent.playerLogin(event.player);
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage(event.player.getDisplayName() + " logged In!", DebugType.EVENT));
    }

    @SubscribeEvent
    public static void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) {
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage(event.player.getDisplayName() + "logged out and EI info is unloaded", DebugType.EVENT));
    }

    @SubscribeEvent
    public void onEntityConstruct(EntityConstructing event) {
        if (UsefulFunctions.isPlayer(event.entity)) {
            EntityPlayerMP player = (EntityPlayerMP) event.entity;
            player.registerExtendedProperties(Reference.MOD_NAME, new EIPlayerProperties());
        }
    }

    @SubscribeEvent
    public void EntityUpdate(LivingEvent event) {
    }

    @SubscribeEvent
    public void LivingJumpEvent(LivingEvent event) {
        // if (event.entityLiving instanceof EntityPlayerMP) {
        // SkillEventHandler.processLivingJumpEvent((net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent) event);
        // }
    }

    @SubscribeEvent
    public void onPlayerJoinWorld(EntityJoinWorldEvent event) {
    }

    @SubscribeEvent
    public void onLivingAttack(LivingAttackEvent event) {

    }

    @SubscribeEvent
    public void onLivingDeath(LivingDeathEvent event) {
        if (UsefulFunctions.isPlayer(event.entity)) {
            EntityPlayer player = (EntityPlayer) event.entity;
            //TODO Make it call
        }
    }

    @SubscribeEvent
    public void onLivingHurt(LivingHurtEvent event) {
        if (UsefulFunctions.isPlayer(event.entity)) {
            EIDebugHandler.sendDebugInfoToConsole(EIDebugHandler.createDebugMessage(UsefulFunctions.getPlayerFromEntity(event.entity) + " Was Hurt", DebugType.EVENT));
        }
    }

    @SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
    }

    @SubscribeEvent
    public void onArrowLoose(ArrowLooseEvent event) {
    }

    @SubscribeEvent
    public void onAttackEntity(AttackEntityEvent event) {
    }

    @SubscribeEvent
    public void onBoneMeal(BonemealEvent event) {
    }

    @SubscribeEvent
    public void onFillBucket(FillBucketEvent event) {
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent event) {
    }

    @SubscribeEvent
    public void onPlayerSleep(PlayerSleepInBedEvent event) {
    }

    @SubscribeEvent
    public void onUseHoe(UseHoeEvent event) {
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void onRenderGameOverlay(RenderGameOverlayEvent event) {

        if (EIHUDHandler.overrideVanillaHUD) {
            event.setCanceled(true);
            EIHUDHandler.setupHUDRender();
        }
    }
}