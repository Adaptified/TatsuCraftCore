package me.BrandonSteed.ShadowEra.Commands;

import me.BrandonSteed.ShadowEra.SE_Messages;
import net.pravian.bukkitlib.command.BukkitCommand;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Command_kpvp extends BukkitCommand {

    @Override
    public boolean run(CommandSender sender, Command cmd, String label, String[] args) {
          Player player = (Player) sender;
          if (! (player.hasPermission("shadoweracore.command.kpvp"))) {
          sender.sendMessage(SE_Messages.NO_PREMS);
          return true;
          }
          if (args.length == 0) {
          player.resetMaxHealth();
          player.setGameMode(GameMode.SURVIVAL);
          player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 2000000, 1));
          player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 2000000, 10));
          player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 2000000, 10));
          player.setFoodLevel(100);
          player.setWalkSpeed(2);
          player.getInventory().setItem(player.getInventory().getHeldItemSlot(), new ItemStack(Material.DIAMOND_SWORD, 1));
          player.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS, 1));
          player.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS, 1));
          player.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE, 1));
          player.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET, 1));
          player.setFlying(false);
          }
        return true;
    }      
}
//Written by zD12 | https://github.com/zd12
