package me.BrandonSteed.ShadowEra.Listeners;
 
import me.BrandonSteed.ShadowEra.ShadowEra;
import me.BrandonSteed.ShadowEra.SE_Messages;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
 
public class PlayerListener implements Listener
{
 
        public ShadowEra plugin;
       
        public PlayerListener(ShadowEra instance){
                plugin = instance;
        }
     
 /*
 @EventHandler
    public void onPlayerChat(PlayerChatEvent event) {
        if(event.getMessage().contains("fuck") || event.getMessage().equalsIgnoreCase("bitch") || event.getMessage().contains("nigg"))
        event.getPlayer().sendMessage(SE_Messages.SWEAR);
        event.setCancelled(true);
       
        if(event.getMessage().contains("cunt") || event.getMessage().contains("porn") || event.getMessage().contains("horny") || event.getMessage().contains("dick") || event.getMessage().contains("penis") || event.getMessage().contains("cock"))
        event.getPlayer().sendMessage(SE_Messages.CHILDREN_FRIENDLY_PLEASE);
        event.setCancelled(true);
    }
  */
}
