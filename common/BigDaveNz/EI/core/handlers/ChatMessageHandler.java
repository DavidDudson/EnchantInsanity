package BigDaveNz.EI.core.handlers;
import BigDaveNz.EI.lib.Reference;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatMessageComponent;

public class ChatMessageHandler {

        
    public static ChatMessageComponent chatMessage(String message){
    	ChatMessageComponent chat = ChatMessageComponent.func_111066_d(message);
    	return chat;
    }
    
    public static void icommandsenderReply(ICommandSender player, String message){
        
    	player.sendChatToPlayer(chatMessage(message));

    }

}
