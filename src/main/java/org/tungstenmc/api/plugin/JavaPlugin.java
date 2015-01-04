package org.tungstenmc.api.plugin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.tungstenmc.api.Server;
import org.tungstenmc.api.Tungsten;

import com.google.common.base.Optional;

import org.apache.commons.io.FileUtils;

public abstract class JavaPlugin implements BasePlugin {

    private String name = null;
    private String version = null;
    private Server server = null;
    private File dataFolder = null;
    private XMLConfiguration config = null;

    public JavaPlugin() {
    }

    @Override
    public abstract void onEnable();

    @Override
    public abstract void onDisable();

    @Override
    public abstract void onReload();

    @Override
    public File getDataFolder() {
        return dataFolder;
    }

    @Override
    public File getConfigFile() {
        return new File(dataFolder + File.separator + "config.xml");
    }

    @Override
    public String getVersion() {
        return version;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Server getServer() {
        return server;
    }

    @Override
    public Optional<XMLConfiguration> getConfig() {
        if (config != null) {
            return Optional.of(config);
        }
        return Optional.absent();
    }

    @Override
    public void saveConfig() {
        if (config != null) {
            try {
                config.save(dataFolder + File.separator + "config.xml");
            } catch (ConfigurationException e) {
                Tungsten.getLogger().error("Error saving plugin config.");
            }
        }
    }

    @Override
    public void saveDefaultConfig() {
        String defaultConfig = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><config></config>";
        try {
            FileUtils.writeStringToFile(new File(getDataFolder()
                    + File.separator + "config.xml"), defaultConfig);
        } catch (IOException e) {
            Tungsten.getLogger().error("Error saving default config.");
        }
    }

    @Override
    public void reloadConfig() {
        if (config == null) {
            saveDefaultConfig();
            loadConfig();
        } else {
            saveConfig();
            loadConfig();
        }
    }

    @Override
    public void loadConfig() {
        try {
            config = new XMLConfiguration(dataFolder + File.separator
                    + "config.xml");
        } catch (ConfigurationException e) {
            Tungsten.getLogger().error("Error loading config.");
        }
    }
}
