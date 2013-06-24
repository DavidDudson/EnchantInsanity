package BigDaveNz.EI.command;

import ibxm.Player;
import BigDaveNz.EI.lib.Commands;
import BigDaveNz.EI.skill.Skill;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.*;

public class CommandEI extends CommandBase{
    
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

            if (commandName.equalsIgnoreCase(Commands.COMMAND_PAR2_XP)) {
                processXPCommand(commandSender,args);
            }
            else if (commandName.equalsIgnoreCase(Commands.COMMAND_PAR2_LEVEL)) {
                processLevelCommand(commandSender,args);
            }
            else if (commandName.equalsIgnoreCase(Commands.COMMAND_PAR2_LEADERBOARD)) {
                processLeaderboardCommand(commandSender,args);
            }
            else
                throw new WrongUsageException(Commands.COMMAND_EI_USAGE, new Object[0]);
        }
        else
            throw new WrongUsageException(Commands.COMMAND_EI_USAGE, new Object[0]);
        
    }
    public void processXPCommand(ICommandSender commandSender, String[] args){

            if (args.length > 0) {
                String subCommand = args[0];

                switch(args[0]){
                    
                    case "unbreaking":
                        EntityPlayer.addChatMessage("Current" + args[0] + Skill.Unbreaking.getCurrentXp());
                        
    public void processLevelCommand(ICommandSender commandSender, String[] args){

             if (args.length > 0) {
                String subCommand = args[0];

                switch(args[0]){
                                    
                    case "unbreaking":
                         player.addChatMessage("Current" + args[0] + Skill.Unbreaking.getCurrentLevel());   
                            
                }  
    public void processLeaderboardCommand(ICommandSender commandSender, String[] args){

               if (args.length > 0) {
                  String subCommand = args[0];

                  switch(args[0]){
                                           
                     case "unbreaking":
                          player.addChatMessage("Current" + args[0] + Skill.Unbreaking.getCurrentLeaderboard());   
                  }
               }
               else{
                 throw new WrongUsageException(Commands.COMMAND_LEADERBOARD_USAGE, new Object[0]);
        }   

}
