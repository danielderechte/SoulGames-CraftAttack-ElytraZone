package eu.soulgames.craftattack.elytra;

import eu.soulgames.craftattack.listener.Events;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Elytra extends JavaPlugin {

    static Elytra instance;
    private Config config;

    public void onEnable(){
        config = new Config();

        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

    public void onDisable(){

    }

    public static Elytra getInstance(){
        return instance;
    }

    public Elytra(){
        instance = this;
    }

}
