package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Command_rage extends BukkitCommand {

    @Override
    public boolean run(final CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.rage"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          
          if (args[0].equalsIgnoreCase("-f")
          {
              if (! (player.hasPermission("shadoweracore.command.rage.fiery")))
              {
                  sender.sendMessage(ChatColor.DARK_PURPLE + "[ShadowEraCore]" + ChatColor.RED + " You don't have enough permissions.");  
              }
              
              Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has exploded with FIERY rage!!!");
              
              // create explosion
              player.getWorld().createExplosion(player.getLocation(), 4F);
              
              // strike lightning
              player.getWorld().strikeLightning(player.getLocation());
              
              // kill
              player.setHealth(0.0);
              
              // scheduler
              new BukkitRunnable()
              {
                 @Override
                 public void run()
                 {
                     Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " is so furious he RAGEQUITS!");
                     
                     // kick player
                     player.kickPlayer(ChatColor.RED + "You were so furious that you literally exploded so fiery!");
                 }
              }.runTaskLater(plugin, 2L * 20L); // runs the code 2 ticks later after command was executed

              return true;
          }
          
          Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has exploded with rage!!!");
          Bukkit.broadcastMessage(ChatColor.RED + player.getName() + " has RAGEQUIT!");
          player.setHealth(0.0);
          player.kickPlayer(ChatColor.RED + "You exploded with fiery rage!");
        
        return true;

    }
}
