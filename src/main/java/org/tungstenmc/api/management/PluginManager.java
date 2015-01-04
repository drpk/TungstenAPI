package org.tungstenmc.api.management;

import java.io.File;
import java.util.List;

import org.tungstenmc.api.plugin.BasePlugin;

/**
 * A class that manages plugins.
 */
public interface PluginManager {

    /**
     * Gets the currently active service manager.
     * 
     * @return The service manager
     */
    ServiceManager getServiceManager();

    /**
     * Gets a plugin based on it's name.
     * 
     * @param name
     *            The name of the plugin
     * @return The plugin
     */
    BasePlugin getPlugin(String name);

    /**
     * Returns a list of all loaded plugins.
     * 
     * @return The list
     */
    List<BasePlugin> getLoadedPlugins();

    /**
     * Checks is a plugin enabled.
     * 
     * @param pluginName
     *            The name of the plugin
     * @return The state
     */
    boolean isPluginEnabled(String pluginName);

    /**
     * Checks is a plugin enabled.
     * 
     * @param plugin
     *            The plugin
     * @return The state
     */
    boolean isPluginEnabled(BasePlugin plugin);

    /**
     * Reloads all loaded plugins.
     */
    void reloadPlugins();

    /**
     * Disables all loaded plugins.
     */
    void disablePlugins();

    /**
     * Enables all loaded plugins.
     */
    void enablePlugins();

    /**
     * Loads a plugin from file.
     * 
     * @param pluginToLoad
     *            The plugin to load
     */
    void loadPlugin(File pluginToLoad);

    /**
     * Loads all plugins in the specified directory
     * 
     * @param directory
     *            The directory
     */
    void loadPlugins(File directory);

    /**
     * Enables the specified plugin.
     * 
     * @param pluginName
     *            The name of the plugin to enable
     */
    void enablePlugin(String pluginName);

    /**
     * Enables the specified plugin.
     * 
     * @param plugin
     *            The plugin to enable
     */
    void enablePlugin(BasePlugin plugin);

    /**
     * Reloads the specified plugin.
     * 
     * @param pluginName
     *            The name of the plugin to reload
     */
    void reloadPlugin(String pluginName);

    /**
     * Reloads the specified plugin.
     * 
     * @param plugin
     *            The plugin to reload
     */
    void reloadPlugin(BasePlugin plugin);

    /**
     * Disables the specified plugin.
     * 
     * @param pluginName
     *            The name of the plugin to disable
     */
    void disablePlugin(String pluginName);

    /**
     * Disables the specified plugin.
     * 
     * @param plugin
     *            The plugin to disable
     */
    void disablePlugin(BasePlugin plugin);
}
