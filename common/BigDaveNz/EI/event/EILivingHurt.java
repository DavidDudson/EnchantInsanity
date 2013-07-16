/**
 * 
 */
package BigDaveNz.EI.event;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import BigDaveNz.EI.core.handler.EIDebugHandler;
import BigDaveNz.EI.lib.XPModifiers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

/**
 * @author BigDaveNz
 * 
 */
public class EILivingHurt {

    /**
     * General Living Hurt Processor
     */
    public static void process(LivingHurtEvent event) {
        if (event.entityLiving instanceof EntityPlayerMP) {
            int amount = (int) event.ammount * 10;
            DamageSource damageSource = event.source;
            EntityPlayer player = (EntityPlayer) event.entityLiving;
            String username = player.getEntityName();
            String damageType = damageSource.getDamageType();
            EIDebugHandler.sendDebugInfoToConsole("Player: " + username + " Was hurt by: " + damageType + ". Amount: " + amount);

            switch (damageType) {

                case "fall":
                    int xpGain = amount * XPModifiers.XP_PER_DAMAGE_FALL;

            }
        }
    }
}
