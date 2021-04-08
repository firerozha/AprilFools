package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;
import other.AprilFools;

import java.util.ArrayList;

public class CommandBoost implements CommandExecutor, Listener {
    private AprilFools plugin;

    public CommandBoost(AprilFools pl) { plugin = pl; }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player && sender.hasPermission("aprilfools.boost")) {
            Player p = (Player) sender;
            Inventory jump = Bukkit.createInventory(p, 9, "BOOST GUI");

            ItemStack i1 = new ItemStack(Material.GREEN_WOOL);
            ItemMeta im1 = i1.getItemMeta();
            ArrayList<String> im1lore = new ArrayList<>();

            im1lore.add(ChatColor.GRAY + "Press to throw all players");
            im1lore.add(ChatColor.translateAlternateColorCodes('&', "&7to the air."));

            im1.setLore(im1lore);
            im1.setDisplayName(ChatColor.RED + "" + ChatColor.UNDERLINE + "The Greatest Button");

            i1.setItemMeta(im1);
            jump.setItem(4, i1);

            p.openInventory(jump);


        } else {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("noperm")));
        }
        return true;

    }


    @EventHandler
    private void clickInv(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();


        if (e.getView().getTitle().equals("BOOST GUI") && e.getSlot() == 4) {
            e.setCancelled(true);
            for (Player all : Bukkit.getOnlinePlayers()) {
                Vector v = all.getLocation().toVector();
                v.setY(1);
                all.setVelocity(v);
            }
        }
    }
}


