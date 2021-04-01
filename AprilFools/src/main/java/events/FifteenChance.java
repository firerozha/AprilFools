package events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Random;

public class FifteenChance implements Listener {

    @EventHandler
    public void commonwords(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if(!p.hasPermission("aprilfools.scrambledchat")) {

        } else {
            Random random = new Random();
            int chance = (100) + 1;
            String msg = e.getMessage();
            if(chance < 15 && msg.contains("wood") || msg.contains("you") || msg.contains("me") || msg.contains("am") || msg.contains("ok") || msg.contains("okay") || msg.contains("kk") || msg.contains("dude") || msg.contains("no") || msg.contains("yes") || msg.contains("lmao") || msg.contains("xd") || msg.contains("lol") || msg.contains("omg") || msg.contains("so")) {
                msg.replace("wood" + "me" + "you" + "am" + "ok" + "okay" + "kk" + "dude" + "no" + "yes" + "lmao" + "xd" + "lol" + "omg" + "so", "poo");

            }
        }

    }
}
