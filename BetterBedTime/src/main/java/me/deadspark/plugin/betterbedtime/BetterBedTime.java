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

        getLogger().info("BetterBedTime Plugin By DeadSpark");
        getLogger().info("BetterBedTime Plugin version 1.6 has been Enabled");
        getServer().getPluginManager().registerEvents(this, this);
        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {

        getLogger().info("BetterBedTime Plugin version 1.6 has been Disabled");

    }

    @EventHandler
    public void OnBedEnter(PlayerBedEnterEvent event) {

        Player player = event.getPlayer();

        if (Objects.equals(getConfig().getString("OnePlayerSleep"), true)) {

            event.getPlayer().getWorld().setTime(0L);

        }

        if (player.hasPermission("betterbedtime.enterbedmsg")) {

            String bedentermsg = Objects.requireNonNull(getConfig().getString("bedentermessage")).replace("{nick}", player.getDisplayName());
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', bedentermsg));

        }

    }

    @EventHandler
    public void OnBedExit(PlayerBedLeaveEvent event) {

        Player player = event.getPlayer();
        if (player.hasPermission("betterbedtime.bedleavemsg")) {

            String bedleavemsg = Objects.requireNonNull(getConfig().getString("bedleavemessage")).replace("{nick}", player.getDisplayName());
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', bedleavemsg));


        }

        if (player.hasPermission("betterbedtime.heal")) {

            player.setHealth(20.00);

        }

        if (player.hasPermission("betterbedtime.feed")) {

            player.setFoodLevel(20);

        }

        if (Objects.equals(getConfig().getString("absorption"), "true")) {

            if (player.hasPermission("betterbedtime.effectabsorption")) {

                int absorptionlvl = getConfig().getInt("absorptionamp");
                int absorptiondelay = getConfig().getInt("absorptiontime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, absorptiondelay, absorptionlvl));

            }

        }

        if (Objects.equals(getConfig().getString("badluck"), "true")) {

            if (player.hasPermission("betterbedtime.effectbadluck")) {

                int badlucklvl = getConfig().getInt("badluckamp");
                int badluckdelay = getConfig().getInt("badlucktime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.UNLUCK, badluckdelay, badlucklvl));

            }

        }

        if (Objects.equals(getConfig().getString("badomen"), "true")) {

            if (player.hasPermission("betterbedtime.effectbadomen")) {

                int badomenlvl = getConfig().getInt("badomenamp");
                int badomendelay = getConfig().getInt("badomentime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.BAD_OMEN, badomendelay, badomenlvl));

            }

        }

        if (Objects.equals(getConfig().getString("blindness"), "true")) {

            if (player.hasPermission("betterbedtime.effectblindness")) {

                int blindnesslvl = getConfig().getInt("blindnessamp");
                int blindnessdelay = getConfig().getInt("blindnesstime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, blindnessdelay, blindnesslvl));

            }

        }

        if (Objects.equals(getConfig().getString("conduitpower"), "true")) {

            if (player.hasPermission("betterbedtime.effectconduitpower")) {

                int conduitpowerlvl = getConfig().getInt("conduitpoweramp");
                int conduitpowerdelay = getConfig().getInt("conduitpowertime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONDUIT_POWER, conduitpowerdelay, conduitpowerlvl));

            }

        }

        if (Objects.equals(getConfig().getString("dolphinsgrace"), "true")) {

            if (player.hasPermission("betterbedtime.effectdolphinsgrace")) {

                int dolphinsgracelvl = getConfig().getInt("dolphinsgraceamp");
                int dolphinsgracedelay = getConfig().getInt("dolphinsgracetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, dolphinsgracedelay, dolphinsgracelvl));

            }

        }

        if (Objects.equals(getConfig().getString("fireresistance"), "true")) {

            if (player.hasPermission("betterbedtime.effectfireresistance")) {

                int fireresistancelvl = getConfig().getInt("fireresistanceamp");
                int fireresistancedelay = getConfig().getInt("fireresistancetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, fireresistancedelay, fireresistancelvl));

            }

        }

        if (Objects.equals(getConfig().getString("glowing"), "true")) {

            if (player.hasPermission("betterbedtime.effectglowing")) {

                int glowinglvl = getConfig().getInt("glowingamp");
                int glowingdelay = getConfig().getInt("glowingtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, glowingdelay, glowinglvl));

            }

        }

        if (Objects.equals(getConfig().getString("haste"), "true")) {

            if (player.hasPermission("betterbedtime.effecthaste")) {

                int hastelvl = getConfig().getInt("hasteamp");
                int hastedelay = getConfig().getInt("hastetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, hastedelay, hastelvl));

            }

        }

        if (Objects.equals(getConfig().getString("healthboost"), "true")) {

            if (player.hasPermission("betterbedtime.effecthealthboost")) {

                int healthboostlvl = getConfig().getInt("healthboostamp");
                int healthboostdelay = getConfig().getInt("healthboosttime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, healthboostdelay, healthboostlvl));

            }

        }

        if (Objects.equals(getConfig().getString("heroofthevillage"), "true")) {

            if (player.hasPermission("betterbedtime.effectvillagehero")) {

                int villageherolvl = getConfig().getInt("heroodthevillageamp");
                int villageherodelay = getConfig().getInt("heroofthevillagetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, villageherodelay, villageherolvl));


            }

        }

        if (Objects.equals(getConfig().getString("hunger"), "true")) {

            if (player.hasPermission("betterbedtime.effecthunger")) {

                int hungerlvl = getConfig().getInt("hungeramp");
                int hungerdelay = getConfig().getInt("hungertime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, hungerdelay, hungerlvl));

            }

        }

        if (Objects.equals(getConfig().getString("instantdamage"), "true")) {

            if (player.hasPermission("betterbedtime.effectinstantdamage")) {

                int instantdamagelvl = getConfig().getInt("instantdamageamp");
                int instantdamagedelay = getConfig().getInt("instantdamagetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HARM, instantdamagedelay, instantdamagelvl));

            }

        }

        if (Objects.equals(getConfig().getString("instanthealth"), "true")) {

            if (player.hasPermission("betterbedtime.effectinstanthealth")) {

                int instanthealthlvl = getConfig().getInt("instanthealthamp");
                int instanthealthdelay = getConfig().getInt("instanthealthtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, instanthealthdelay, instanthealthlvl));

            }

        }

        if (Objects.equals(getConfig().getString("invisibility"), "true")) {

            if (player.hasPermission("betterbedtime.effectinvisibility")) {

                int invisibilitylvl = getConfig().getInt("invisibilityamp");
                int invisibilitydelay = getConfig().getInt("invisibilitytime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, invisibilitydelay, invisibilitylvl));

            }

        }

        if (Objects.equals(getConfig().getString("jumpboost"), "true")) {

            if (player.hasPermission("betterbedtime.effectjumpboost")) {

                int jumpboostlvl = getConfig().getInt("jumpboostamp");
                int jumpboostdelay = getConfig().getInt("jumpboosttime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, jumpboostdelay, jumpboostlvl));

            }

        }

        if (Objects.equals(getConfig().getString("levitation"), "true")) {

            if (player.hasPermission("betterbedtime.effectlevitation")) {

                int levitationlvl = getConfig().getInt("levitationamp");
                int levitationdelay = getConfig().getInt("levitationtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, levitationdelay, levitationlvl));

            }

        }

        if (Objects.equals(getConfig().getString("luck"), "true")) {

            if (player.hasPermission("betterbedtime.effectluck")) {

                int lucklvl = getConfig().getInt("luckamp");
                int luckdelay = getConfig().getInt("lucktime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, luckdelay, lucklvl));

            }

        }

        if (Objects.equals(getConfig().getString("miningfatigue"), "true")) {

            if (player.hasPermission("betterbedtime.effectminingfatigue")) {

                int miningfatiguelvl = getConfig().getInt("miningfatigueamp");
                int miningfatiguedelay = getConfig().getInt("miningfatiguetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, miningfatiguedelay, miningfatiguelvl));

            }

        }

        if (Objects.equals(getConfig().getString("nausea"), "true")) {

            if (player.hasPermission("betterbedtime.effectnausea")) {

                int nausealvl = getConfig().getInt("nauseaamp");
                int nauseadelay = getConfig().getInt("nauseatime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, nauseadelay, nausealvl));

            }

        }

        if (Objects.equals(getConfig().getString("nightvision"), "true")) {

            if (player.hasPermission("betterbedtime.effectnightvision")) {

                int nightvisionlvl = getConfig().getInt("nightvisionamp");
                int nightvisiondelay = getConfig().getInt("nightvisiontime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, nightvisiondelay, nightvisionlvl));

            }

        }

        if (Objects.equals(getConfig().getString("poison"), "true")) {

            if (player.hasPermission("betterbedtime.effectpoison")) {

                int poisonlvl = getConfig().getInt("poisonamp");
                int poisondelay = getConfig().getInt("poisontime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.POISON, poisondelay, poisonlvl));

            }

        }

        if (Objects.equals(getConfig().getString("regeneration"), "true")) {

            if (player.hasPermission("betterbedtime.effectregeneration")) {

                int regenerationlvl = getConfig().getInt("regenerationamp");
                int regenerationdelay = getConfig().getInt("regenerationtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, regenerationdelay, regenerationlvl));

            }

        }

        if (Objects.equals(getConfig().getString("resistance"), "true")) {

            if (player.hasPermission("betterbedtime.effectresistance")) {

                int resistancelvl = getConfig().getInt("resistanceamp");
                int resistancedelay = getConfig().getInt("resistancetime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, resistancedelay, resistancelvl));

            }

        }

        if (Objects.equals(getConfig().getString("saturation"), "true")) {

            if (player.hasPermission("betterbedtime.effectsaturation")) {

                int saturationlvl = getConfig().getInt("saturationamp");
                int saturationdelay = getConfig().getInt("saturationtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, saturationdelay, saturationlvl));

            }

        }

        if (Objects.equals(getConfig().getString("slowfalling"), "true")) {

            if (player.hasPermission("betterbedtime.eventslowfalling")) {

                int slowfallinglvl = getConfig().getInt("slowfallingamp");
                int slowfallingdelay = getConfig().getInt("slowfallingtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_FALLING, slowfallingdelay, slowfallinglvl));

            }

        }

        if (Objects.equals(getConfig().getString("slowness"), "true")) {

            if (player.hasPermission("betterbedtime.effectslowness")) {

                int slownesslvl = getConfig().getInt("slownessamp");
                int slownessdelay = getConfig().getInt("slownesstime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, slownessdelay, slownesslvl));

            }

        }

        if (Objects.equals(getConfig().getString("speed"), "true")) {

            if (player.hasPermission("betterbedtime.effectspeed")) {

                int speedlvl = getConfig().getInt("speedamp");
                int speeddelay = getConfig().getInt("speedtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, speeddelay, speedlvl));

            }

        }

        if (Objects.equals(getConfig().getString("waterbreathing"), "true")) {

            if (player.hasPermission("betterbedtime.effectwaterbreathing")) {

                int waterbreathinglvl = getConfig().getInt("waterbreathingamp");
                int waterbreathingdelay = getConfig().getInt("waterbreathingtime");
                player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, waterbreathingdelay, waterbreathinglvl));

            }

        }

        if (Objects.equals(getConfig().getString("weakness"), "true")) {

            if (player.hasPermission("betterbedtime.effectweakness")) {

                int weaknesslvl = getConfig().getInt("weaknessamp");
                int weaknessdelay = getConfig().getInt("weakness");
                player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, weaknessdelay, weaknesslvl));

            }

        }

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            if (command.getName().equalsIgnoreCase("bbt")) {

                Player player = (Player) sender;
                if (args.length > 0) {

                    if (player.hasPermission("betterbedtime.reloadplugin")) {

                        if (args[0].equalsIgnoreCase("reload")) {

                            reloadConfig();
                            player.sendMessage("All config files have been reloaded");

                        }

                    }

                }else {

                    player.sendMessage(ChatColor.BLACK + "--------------------------------------------------");
                    player.sendMessage(ChatColor.GREEN + "BetterBedTime Plugin By DeadSpark");
                    player.sendMessage(ChatColor.BLUE + "Check out our GitHub Page");
                    player.sendMessage(ChatColor.GREEN + "https://deadspark.github.io/MysticalCrafts");
                    player.sendMessage(ChatColor.BLUE + "Video Preview");
                    player.sendMessage(ChatColor.GREEN + "https://youtu.be/Wl8mWQsng3M");
                    player.sendMessage(ChatColor.BLACK + "--------------------------------------------------");

                }

            }

        }else {

            if (command.getName().equalsIgnoreCase("bbt")) {

                if (args.length > 0) {

                    if (args[0].equalsIgnoreCase("reload")) {

                        reloadConfig();
                        getLogger().info("All config files have been reloaded");

                    }

                }else {

                    getLogger().info("---------------------------------------------");
                    getLogger().info("BetterBedTime Plugin By DeadSpark");
                    getLogger().info("Check out our GitHub Page");
                    getLogger().info("https://deadspark.github.io/MysticalCrafts");
                    getLogger().info("Video Preview");
                    getLogger().info("https://youtu.be/Wl8mWQsng3M");
                    getLogger().info("---------------------------------------------");

                }

            }

        }

        return false;

    }

}
