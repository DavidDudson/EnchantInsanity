/**
 * 
 */
package BigDaveNz.EI.event;

import BigDaveNz.EI.core.handler.EIDebugHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

/**
 * @author BigDaveNz
 *
 */
public class EILivingHurt {

    /**
     * 
     */
    public static void process(LivingHurtEvent event) {
        int amount = (int)event.ammount * 10;
        DamageSource damageSource = event.source;
        EntityLivingBase entity = event.entityLiving;
        Class<? extends EntityLivingBase> entityClass = entity.getClass();
        String className = entityClass.getName();
        EIDebugHandler.sendDebugInfoToConsole("Entity was hurt: " + className);
        
        switch (className){
            
            case "EntityPlayerMP":
                playerHurt(entityClass,damageSource,amount);
        }
        
    }
    
    private static void playerHurt(Class<? extends EntityLivingBase> entityClass, DamageSource source, int amount) {
        entityClass = (Class<? extends EntityLivingBase>)entityClass;
        String username = entityClass.username;
        EIDebugHandler.sendDebugInfoToConsole(username + " was hurt by: " +  source + " with " + amount + "Damage");
    }
    

}
