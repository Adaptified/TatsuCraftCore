package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import org.apache.commons.lang3.StringUtils;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_forcecommand extends BukkitCommand {

    
    @Override
    public boolean run(final CommandSender sender, Command cmd, String label, String[] args)
    {
          Player p = (Player) sender;
        if (! (p.hasPermission("shadoweracore.command.forcecommand"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
      int length = args.length;
      
      if (length == 0)
      {
        sender.sendMessage(SE_Messages.USAGE + "/forcecommand <player> <command> [args.]");
        return true;
      }
      
      if (length == 1)
      {
        boolean playerFound = false;
        
        for (Player player : Bukkit.getServer().getOnlinePlayers())
        {
          if (args[0].equals(sender.getName()))
          {
            sender.sendMessage(ChatColor.RED + "Dumbass.");
            return true;
          }
          
          if (player.getName().equalsIgnoreCase(args[0]))
          {
            player.performCommand((StringUtils.join(args, " ")));
            playerFound = true;
            break;
          }
        }
        
        if (playerFound == false)
        {
          sender.sendMessage(ChatColor.DARK_RED + "Error: " + ChatColor.RED + args[0] + " was not found!");
          return true;
        }
        
        return true;
      }
      
      return true;
    }
}
