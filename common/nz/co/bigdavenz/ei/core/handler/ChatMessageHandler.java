package nz.co.bigdavenz.ei.core.handler;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;
import nz.co.bigdavenz.ei.lib.Reference;

public class ChatMessageHandler {
    
    public static void icommandsenderReply(ICommandSender player, String message){
    	player.sendChatToPlayer(createChatComponent(message));
    }
    
    public static ChatMessageComponent createChatComponent(String message){
    	ChatMessageComponent Component = new ChatMessageComponent();
    	Component.addText(message);
    	return Component;
    }

}
