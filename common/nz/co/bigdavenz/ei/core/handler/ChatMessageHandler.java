package nz.co.bigdavenz.ei.core.handler;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.*;
import nz.co.bigdavenz.ei.lib.Reference;

public class ChatMessageHandler {

    private static final IChatComponent EIChatComponent = createEIChatComponent(Reference.MOD_ID.toUpperCase());

    public static void icommandsenderReply(ICommandSender player, String message) {
        sendEIChatToPlayer((EntityPlayer)player, message);
    }

    private static IChatComponent createEIChatComponent(String string) {
        ChatComponentText EIComponent = new ChatComponentText(string);
          return EIComponent;
    }

    public static IChatComponent createChatComponent(String message) {
        ChatComponentText component = new ChatComponentText(message);
        return EIChatComponent.func_150257_a(component);
    }

    public static void sendEIChatToPlayer(EntityPlayer player, String message) {
        player.func_146105_b(createChatComponent(message));
    }

    public static void broadcastEIMessageToPlayers(String message){
        MinecraftServer.getServer().getConfigurationManager().func_148539_a(createChatComponent(message));
    }
}
