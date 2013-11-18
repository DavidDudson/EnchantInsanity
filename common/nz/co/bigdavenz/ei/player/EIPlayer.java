package nz.co.bigdavenz.ei.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import nz.co.bigdavenz.ei.core.handler.ChatMessageHandler;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.Reference;
import nz.co.bigdavenz.ei.skill.EISkill;
import nz.co.bigdavenz.ei.skill.Skill;

public class EIPlayer implements IExtendedEntityProperties {

	private IExtendedEntityProperties EIData;
	public static ArrayList<String> players = new ArrayList();
	private static Map skillsMap = new HashMap();

	public static int getPlayerAmount() {
		return players.size();
	}

	public static IExtendedEntityProperties createPlayerData(EntityPlayer player) {
		IExtendedEntityProperties EIProperties = null;
		if (player.getExtendedProperties("EI") == null) {
			Map skillMapByName = EISkill.cloneSkillsMap();
			NBTTagCompound eiNBT = new NBTTagCompound();
			eiNBT.setTag("eiSkillData", eiNBT);
			eiNBT.setTag("eiEnchantmentData", eiNBT);
			eiNBT.setTag("eiAbilityData", eiNBT);
		}
		EIProperties = player.getExtendedProperties("EI");
		return EIProperties;
	}

	public static void createEIPlayer(EntityPlayerMP player) {
		// createPlayerData(player);
		if (player.getEntityName() != null) {
			String playerName = player.getEntityName();
			if (!EIPlayer.players.contains(playerName)) {
				String message = "Welcome to Enchant Insanity!\n Version is: "
						+ Reference.MOD_VERSION;
				// player.sendChatToPlayer(ChatMessageHandler.createChatComponent(message));
				players.add(playerName);

				EIDebugHandler.sendDebugInfoToConsole(new DebugMessage(
						playerName + " has been setup for Enchant Insanity",
						DebugType.EVENT));
				player.addChatMessage(message);
			}
			else{
				EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Null Player found",DebugType.EVENT));
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.minecraftforge.common.IExtendedEntityProperties#saveNBTData(net.minecraft
	 * .nbt.NBTTagCompound)
	 */
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.minecraftforge.common.IExtendedEntityProperties#loadNBTData(net.minecraft
	 * .nbt.NBTTagCompound)
	 */
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.minecraftforge.common.IExtendedEntityProperties#init(net.minecraft
	 * .entity.Entity, net.minecraft.world.World)
	 */
	@Override
	public void init(Entity entity, World world) {
		// TODO Auto-generated method stub

	}
}
