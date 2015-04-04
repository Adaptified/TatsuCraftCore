package me.BrandonSteed.ShadowEra.Commands;

import java.util.Arrays;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Command_sys extends BukkitCommand
{
  @Override
  public boolean run(final CommandSender sender, Command cmd, String label, String[] args)
  {
    if (! (sender.hasPermission("shadoweracore.command.sys")))
    {
      sender.sendMessage(ChatColor.DARK_PURPLE + "[ShadowEraCore] " + ChatColor.RED + "You don't have enough permissions.");
      return true;
    }
    else if (args.length == 0)
    {
      sender.sendMessage(ChatColor.WHITE + "System Administrator utils (currently still in development)");
      sender.sendMessage(ChatColor.WHITE + "/sys [purple]");
      return true;
    }
    else if (args[0].equalsIgnoreCase("purple"))
    {
      Bukkit.broadcastMessage(ChatColor.AQUA + sender.getName() + " - Gracing the world of purple!");
      sender.sendMessage(ChatColor.DARK_PURPLE + "[ShadowEraCore] " + ChatColor.GREEN + "Sucessfully used system administrator utils.");
      for (final Player player : server.getOnlinePlayers())
      {
        // creation of the purple wool hat
        ItemStack purpleHat = new ItemStack(Material.WOOL, 1, (short) 10);
        ItemMeta itemmeta = purpleHat.getItemMeta();
        itemmeta.setDisplayName(ChatColor.DARK_PURPLE + "The Purple Hat");
        itemmeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "enjoy your new hat!"));
        purpleHat.setItemMeta(itemmeta);
        
        // creation of the purple wool in hand
        ItemStack purpleItem = new ItemStack(Material.WOOL, 1, (short) 10);
        ItemMeta item = purpleItem.getItemMeta();
        item.setDisplayName(ChatColor.DARK_PURPLE + "The Purple Aura");
        item.setLore(Arrays.asList("§5§owelcome to the system admins team of purple!"));
        purpleItem.setItemMeta(item);
        
        // strike lightning on all players
        player.getWorld().strikeLightning(player.getLocation());
        
        // set all players hat as the purple wool
        player.getInventory().setHelmet(purpleHat);
        
        // puts purple wool in all players inventory
        player.getInventory().addItem(purpleItem);
      }
      
      return true;
    }
    
    return true;
  }
}
