package events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Random;

public class RanChance implements Listener {

    @EventHandler
    public void Rand(AsyncPlayerChatEvent e) {
        Player p = (Player) e.getPlayer();
        if(!p.hasPermission("aprilfools.scrambledchat")) {

        } else {
            Random random = new Random();
            int chance = random.nextInt(100) + 1;


            if(chance < 10) {
                e.setMessage("hey everyone. I failed to type my message so now I'm actually re-writing it ! expect a message later.");
            }
        }

    }
}
