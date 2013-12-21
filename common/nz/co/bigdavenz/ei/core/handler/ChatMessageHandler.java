package nz.co.bigdavenz.ei.core.handler;

import cpw.mods.fml.common.network.PacketDispatcher;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.packet.Packet3Chat;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.EnumChatFormatting;

public class ChatMessageHandler {

    private static final ChatMessageComponent EIChatComponent = createEIChatComponent("EI");

    public static void icommandsenderReply(ICommandSender player, String message) {
        player.sendChatToPlayer(createChatComponent(message));
    }

    private static ChatMessageComponent createEIChatComponent(String string) {
        ChatMessageComponent EIComponent = new ChatMessageComponent();
        EIComponent.addText("[EI] ");
        EIComponent.setColor(EnumChatFormatting.GOLD);
        EIComponent.setItalic(true);
        return EIComponent;
    }

    public static ChatMessageComponent createChatComponent(String message) {
        ChatMessageComponent component = new ChatMessageComponent();
        component.addText(message);
        return EIChatComponent.appendComponent(component);
    }

    public static void sendEIChatToPlayer(EntityPlayer player, String message) {
        player.sendChatToPlayer(createChatComponent(message));
    }

    public static void broadcastEIMessageToPlayers(String message){
        MinecraftServer.getServer().getConfigurationManager().sendChatMsg(createChatComponent(message));
    }
}
