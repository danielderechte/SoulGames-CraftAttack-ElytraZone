package eu.soulgames.craftattack.listener;

import eu.soulgames.craftattack.elytra.Config;
import eu.soulgames.craftattack.elytra.Elytra;
import net.raidstone.wgevents.events.RegionEnteredEvent;
import net.raidstone.wgevents.events.RegionLeftEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class Events implements Listener {

    private Elytra instance;

    @EventHandler
    public void onRegionEntered(RegionEnteredEvent event){

        Player player = event.getPlayer();


        String regionName = event.getRegionName();

        if (regionName.equalsIgnoreCase(Elytra.getInstance().getConfig().getString("RegionName"))){
            assert player != null;
            player.sendMessage("§8•● §6§lSoulGames §8» §7Du hast die Spawn-Zone betreten.");

            if (player.getInventory().getChestplate() == null){
                player.getInventory().setChestplate(new ItemStack(Material.ELYTRA));
            }

        }


    }

    @EventHandler
    public void onRegionLeft(RegionLeftEvent event){

        Player player = event.getPlayer();


        String regionName = event.getRegionName();

        if (regionName.equalsIgnoreCase(Elytra.getInstance().getConfig().getString("RegionName"))){
            assert player != null;
            player.sendMessage("§8•● §6§lSoulGames §8» §7Du hast die Spawn-Zone verlassen.");

            player.getInventory().getChestplate().getType();
            player.getInventory().setChestplate(null);

        }
    }


}
