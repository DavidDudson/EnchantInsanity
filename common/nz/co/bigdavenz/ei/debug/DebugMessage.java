package nz.co.bigdavenz.ei.debug;

import net.minecraft.entity.player.EntityPlayer;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;

public class DebugMessage {

	public String message;
	public DebugType debugType;
	public EntityPlayer player;
	
	public DebugMessage(String message, DebugType type){
		this.debugType = type;
		this.message = messageAddition(message, debugType);
	}
	
	public DebugMessage(String message, DebugType type, EntityPlayer player){
		this.debugType = DebugType.PLAYER;
		this.player = player;
		this.message = messageAddition(message, debugType);
	}
	
	private String messageAddition(String message, DebugType type){
		return "[" + debugType.toString() + "] " + message;
	}
	
}
