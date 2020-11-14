package eu.soulgames.craftattack.elytra;

import java.io.File;

public class Config {

    public Config(){
        load();
    }

    private void load(){
        if (!Elytra.getInstance().getDataFolder().exists()){
            Elytra.getInstance().getDataFolder().mkdir();
        }

        if (!(new File(Elytra.getInstance().getDataFolder(), "config.yml").exists())){
            Elytra.getInstance().saveDefaultConfig();
        }
    }

    public String getWorld() {
        return Elytra.getInstance().getConfig().getString("WorldName");
    }

    public String getRegionName(){
        return Elytra.getInstance().getConfig().getString("RegionName");
    }

}
