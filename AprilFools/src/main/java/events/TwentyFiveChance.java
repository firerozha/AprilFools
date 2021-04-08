package events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Random;

public class TwentyFiveChance implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player p = e.getPlayer();
        if(!p.hasPermission("aprilfools.scrambledchat")) {

        } else {
            Random random = new Random();
            int chance = random.nextInt(100) + 1;
            String msg = e.getMessage();
            if(chance < 25) {
                e.setMessage(e.getMessage().replaceAll("me", "poo"));
                e.setMessage(e.getMessage().replaceAll("you", "poo"));
                e.setMessage(e.getMessage().replaceAll("am", "poo"));
                e.setMessage(e.getMessage().replaceAll("lol", "poo"));
                e.setMessage(e.getMessage().replaceAll("xd", "poo"));
                e.setMessage(e.getMessage().replaceAll("lmao", "poo"));
                e.setMessage(e.getMessage().replaceAll("gg", "poo"));
                e.setMessage(e.getMessage().replaceAll("hi", "poo"));
                e.setMessage(e.getMessage().replaceAll("hello", "poo"));
                e.setMessage(e.getMessage().replaceAll("shalom", "poo"));
                e.setMessage(e.getMessage().replaceAll("hey", "poo"));
                e.setMessage(e.getMessage().replaceAll("bro", "poo"));
                e.setMessage(e.getMessage().replaceAll("dude", "poo"));


            }
        }

    }
}
