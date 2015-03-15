package me.BrandonSteed.ShadowEra.Commands;

import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command_lounge extends BukkitCommand
{
  @Override
  public boolean run(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player player = (Player) sender;
    
    if (! (sender.hasPermission("shadoweracore.command.lounge")))
    {
      player.sendMessage(ChatColor.DARK_PURPLE + "[ShadowEraCore] " + ChatColor.RED + "You don't have enough permissions.");
      return true;
    }
    
    player.performCommand("warp Lounge");
    
    return true;
  }
}
