package nz.co.bigdavenz.ei.skill;

import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.living.LivingEvent;
import nz.co.bigdavenz.ei.event.EIEventType;

public class SkillEvent {

	private EIEventType eventType;
	private EISkill eventSkill;
	private Event event = null;

	public SkillEvent(Event event, EIEventType type){
		this.eventType = type;
		this.event = event;
	}
}
