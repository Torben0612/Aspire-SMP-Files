package tk.theaspiresmp.files;

import com.google.gson.Gson;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic\
        getConfig().options().copyDefaults();
        saveDefaultConfig();


        JSONData data = new JSONData("TornadoK", true, new Date());
        try {
            getDataFolder().mkdir();
            File jsonfile = new File(getDataFolder(), "data.json");
            if (!jsonfile.exists()) {
                jsonfile.createNewFile();
            }

            Gson gson = new Gson();
            Writer writer = new FileWriter(jsonfile, false);
            gson.toJson(data, writer);
            writer.flush();
            writer.close();

            System.out.println("Saved JSON File");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
