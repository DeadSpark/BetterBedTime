package me.deadspark.plugin.betterbedtime;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public final class BetterBedTime extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        // Plugin startup logic
        getLogger().info("BetterBedTime Plugin By DeadSpark");
        getLogger().info("BetterBedTime Plugin version SNAPSHOT-1.0 has been Enabled");
        getServer().getPluginManager().registerEvents(this, this);
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {

        // Plugin shutdown logic
        getLogger().info("BetterBedTime Plugin version SNAPSHOT-1.0 has been Enabled");

    }

    @EventHandler
    public void OnBedEnter(PlayerBedEnterEvent event) {

        Player player = event.getPlayer();

        if (player.hasPermission("betterbedtime.enterbedmsg")) {

            player.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(getConfig().getString("bedentermessage"))));

        }

    }

    @EventHandler
    public void OnBedExit(PlayerBedLeaveEvent event) {

        Player player = event.getPlayer();

        if (player.hasPermission("betterbedtime.heal")) {

            player.setHealth(20.00);

        }

        if(player.hasPermission("betterbedtime.feed")) {

            player.setFoodLevel(20);

        }

        if (player.hasPermission("betterbedtime.effectspeed")) {

            player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 400, 2));

        }

        if(player.hasPermission("betterbedtime.effectregen")) {

            player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 400, 2));

        }

        if (player.hasPermission("betterbedtime.bedleavemsg")) {

            player.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(getConfig().getString("bedleavemessage"))));

        }

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equals("bbt")){

            Player player = (Player) sender;
            player.sendMessage(ChatColor.BLACK + "--------------------------------------------------");
            player.sendMessage(ChatColor.GREEN + "BetterBedTime Plugin By DeadSpark");
            player.sendMessage(ChatColor.GREEN + "Check out our GitHub Page");
            player.sendMessage(ChatColor.GREEN + "https://deadspark.github.io/MysticalCrafts");
            player.sendMessage(ChatColor.BLACK + "--------------------------------------------------");

        }

        return false;
    }
    
}
