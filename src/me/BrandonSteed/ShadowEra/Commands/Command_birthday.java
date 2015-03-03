package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Command_birthday extends BukkitCommand {

    public boolean run(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.rage"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          Bukkit.broadcastMessage(ChatColor.RED + "Its Generals birthday!!!");
          
        {
           final int firstEmpty = player.getInventory().firstEmpty();
            if (firstEmpty >= 0)
            {
                player.getInventory().setItem(player.getInventory().getHeldItemSlot(), new ItemStack(Material.CAKE, 1));
            } 
        }
        
        final ItemStack heldItem = new ItemStack(Material.CAKE);
        final ItemMeta heldItemMeta = heldItem.getItemMeta();
        heldItemMeta.setDisplayName((new StringBuilder()).append(ChatColor.WHITE).append("Generals ").append(ChatColor.DARK_GRAY).append("Birthday!").toString());
        heldItem.setItemMeta(heldItemMeta);
        
        return true;
    }

}
