package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Command_adminmode extends BukkitCommand {


    @Override
    public boolean run(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.adminmode"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          if (args.length == 0) {
          player.sendMessage(SE_Messages.USAGE + "/adminmode [on|off]");
          }
          
          else if (args[0].equalsIgnoreCase("on")) {
          player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
          player.chat("/fly");
          player.sendMessage(ChatColor.GREEN + "ShadowEra" + ChatColor.RED + " >>" + ChatColor.GREEN + " You have activated administration mode, please do /administrationmode off to disable :D");
          }   
          
          else if (args[0].equalsIgnoreCase("off")) {
          player.chat("/heal");
          player.chat("/fly");
          player.sendMessage(SE_Messages.TAG_MOD + ChatColor.GREEN + "You have disabled administration mode!");
          } 
        return true;
       
    }      
}
