package nz.co.bigdavenz.ei.ability;

import net.minecraft.entity.player.EntityPlayer;
import nz.co.bigdavenz.ei.core.handler.ChatMessageHandler;
import nz.co.bigdavenz.ei.core.registry.ImageRegistry;
import nz.co.bigdavenz.ei.core.util.ImageResource;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.skill.EISkill;

import java.util.Map;

/**
 * Created by David J. Dudson on 20/12/13.
 */
public class Ability {

    boolean active = false;
    boolean wasOverriden = false;
    boolean activated = Reference.activateAllAbilities;
    String abilityName;
    ImageResource abilityIcon = ImageRegistry.iconOffence;
    Map<EISkill, Integer> requirements;


    public Ability(String name, Map<EISkill, Integer> prerequisites, ImageResource icon) {
        this.abilityIcon = icon;
        this.abilityName = name;
        this.active = false;
        this.requirements = prerequisites;



    }

    public void toggleOverride(EntityPlayer player) {
        ChatMessageHandler.sendEIChatToPlayer(player, "");
    }

    public boolean prerequisiteCheck() {
        boolean okay = true;
        for (Map.Entry<EISkill, Integer> entry : this.requirements.entrySet()) {
            if(!(entry.getKey().getCurrentLevel() == entry.getValue())){
               okay = false;
            }
        }
        return okay;
    }

    public static void toggleActive(EntityPlayer player){

    }
}
