package nz.co.bigdavenz.ei.skill;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.living.LivingEvent;
import nz.co.bigdavenz.ei.event.EIEventType;

public class SkillLivingEvent extends SkillEvent{
	EntityPlayerMP player;
	LivingEvent livingEvent;
	
	public SkillLivingEvent(Event event, EIEventType type) {
		super(event, type);
		this.livingEvent = (LivingEvent)event;
		this.player = (EntityPlayerMP)livingEvent.entityLiving;
	}

	public String getPlayerName(){
		return player.getEntityName();
	}
	
	public LivingEvent getLivingEvent(){
		return livingEvent;
	}
}
