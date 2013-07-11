package BigDaveNz.EI.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import BigDaveNz.EI.lib.Commands;
import BigDaveNz.EI.lib.Reference;
import BigDaveNz.EI.lib.Skills;
import BigDaveNz.EI.skill.EISkill;
import BigDaveNz.EI.skill.Skill;
import BigDaveNz.EI.core.handler.ChatMessageHandler;
import BigDaveNz.EI.core.util.EILogger;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;

public class CommandEI extends CommandBase {

	@Override
	public String getCommandName() {

		return Commands.COMMAND_PAR1_EI;
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender commandSender) {

		return true;
	}

	@Override
	public void processCommand(ICommandSender commandSender, String[] args) {
		if (args.length > 0) {
			String commandName = args[0];
			System.arraycopy(args, 1, args, 0, args.length - 1);

			if (commandName.equalsIgnoreCase("xp")) {
				try {
					processXPCommand(commandSender, args);
				} catch (SecurityException
						| IllegalArgumentException e) {
					EILogger.severe("Command Failed");
				}
			} else if (commandName.equalsIgnoreCase("level")) {
				processLevelCommand(commandSender, args);
			} else if (commandName.equalsIgnoreCase("leaderboard")) {
				processLeaderboardCommand(commandSender, args);
			} else if (commandName.equalsIgnoreCase("debugtoggle")) {
				Reference.debugMode = !Reference.debugMode;
				ChatMessageHandler.icommandsenderReply(
						commandSender,
						"Debug mode toggled to: "
								+ Boolean.toString(Reference.debugMode));
			} else if (commandName.equalsIgnoreCase("debugcheck")) {
				ChatMessageHandler.icommandsenderReply(
						commandSender,
						"Debug mode currently: "
								+ Boolean.toString(Reference.debugMode));
			} else
				throw new WrongUsageException(Commands.COMMAND_EI_USAGE,
						new Object[0]);
		} else
			throw new WrongUsageException(Commands.COMMAND_EI_USAGE,
					new Object[0]);

	}

	public void processXPCommand(ICommandSender commandSender, String[] args){
	if (args.length > 0) {
		String skillName = args[0];
		getMethodInSkill(skillName, "getXp", commandSender);
	} else
		throw new WrongUsageException(Commands.COMMAND_XP_USAGE,
				new Object[0]);
}
	public void processLevelCommand(ICommandSender commandSender, String[] args) {
		if (args.length > 0) {
			String skillName = args[0];
			getMethodInSkill(skillName, "getLevel", commandSender);
		} else
			throw new WrongUsageException(Commands.COMMAND_XP_USAGE,
					new Object[0]);
	}

	public void processLeaderboardCommand(ICommandSender commandSender, String[] args){
			//TODO finish leaderboard
		}

	@Override
	public String getCommandUsage(ICommandSender icommandsender) {
		return null;
	}

	public void getMethodInSkill(String skillName, String methodName,
			ICommandSender commandSender) {
		if (skillName.length() > 0) {
			EISkill skill = EISkill.getSkillFromName(skillName);
			Method method = null;
			try {
				method = skill.getClass().getMethod(methodName, EISkill.class);
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			int xp = -1;
			try {
				xp = (int) method.invoke(skill);
			} catch (IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				e.printStackTrace();
			}
			String message;
			if (xp == -1) {
				message = "Something Went Wrong";
			} else {
				message = "Current: " + skillName + " Level: " + xp;
			}
			ChatMessageHandler.icommandsenderReply(commandSender, message);
		}
	}
}
