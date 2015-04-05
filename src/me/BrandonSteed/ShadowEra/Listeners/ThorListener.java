/* package me.BrandonSteed.ShadowEra.Listeners;

import me.BrandonSteed.ShadowEra.ShadowEra;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class ThorListener implements Listener {
         
         public ShadowEra plugin;
       
        public ThorListener(ShadowEra instance){
                plugin = instance;
        }
     
          
  @EventHandler(priority = EventPriority.HIGH)
    public void onPlayerInteract(PlayerInteractEvent event)
    {
        final Player player = event.getPlayer();
        
        switch (event.getAction())
        {
            case RIGHT_CLICK_AIR:
            case RIGHT_CLICK_BLOCK:
            {
                switch (event.getMaterial())
                {
                    case GOLD_AXE:
                    {
                        if (player.hasPermission("shadoweracore.event.thor"))
                        {
                            for (int i = 0; i <= 100; i++)
                            {
                            player.getWorld().strikeLightning(player.getTargetBlock(null, 500).getLocation());
                            }
                            player.getWorld().createExplosion(player.getTargetBlock(null, 500).getLocation(), 4F);
                        }
                        else
                        {
                            event.setCancelled(true);
                        }
         
                        break;
                    }
                }
            }
            
            case LEFT_CLICK_AIR:
            case LEFT_CLICK_BLOCK:
            {
                switch (event.getMaterial())
                {
                    // none yet
                }  
       
            }
}
    }
}
*/ //This whole listener is screwed up pretty badly.
