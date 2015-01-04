package org.tungstenmc.api.plugin;

import java.io.File;
import org.apache.commons.configuration.XMLConfiguration;
import com.google.common.base.Optional;
import org.tungstenmc.api.Server;

public interface BasePlugin { // TODO: implement command executer

    /**
     * Method gets called on plugin enabling
     */
    void onEnable();

    /**
     * Method gets called on plugin disable
     */
    void onDisable();

    /**
     * Method gets called on plugin reload
     */
    void onReload();

    /**
     * Returns the data folder of the plugin
     * 
     * @return the data folder
     */
    File getDataFolder();

    /**
     * Gets the config file.
     * 
     * @return The config file
     */
    File getConfigFile();

    /**
     * Returns a string version number for the plugin
     * 
     * @return the version
     */
    String getVersion();

    /**
     * Returns the string name of the plugin
     * 
     * @return the name
     */
    String getName();

    /**
     * Returns the server of the plugin
     * 
     * @return the server
     */
    Server getServer();

    /**
     * Gets the config if loaded or Optional.absent() if not
     * 
     * @return The config
     */
    Optional<XMLConfiguration> getConfig();

    /**
     * Saves the plugin config.
     */
    void saveConfig();

    /**
     * Saves the default config file to the plugin data folder.
     */
    void saveDefaultConfig();

    /**
     * Saves and loads the config from file.
     */
    void reloadConfig();

    /**
     * Loads the config from file.
     */
    void loadConfig();
}
