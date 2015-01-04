package org.tungstenmc.api;

import org.apache.logging.log4j.Logger;

import org.tungstenmc.api.management.EventManager;
import org.tungstenmc.api.management.PluginManager;
import org.tungstenmc.api.management.WorldManager;

/**
 * Represents a running Minecraft server instance.
 */
public interface Server {

    /**
     * Gets the {@link Logger} of the {@link Server}.
     * 
     * @return The {@link Logger}
     */
    Logger getLogger();

    /**
     * Checks is the server running.
     * 
     * @return The state
     */
    boolean isRunning();

    /**
     * Gets the name of the {@link Server}.
     * 
     * @return The name
     */
    String getName();

    /**
     * Gets the version of the {@link Server}.
     * 
     * @return The version
     */
    String getVersion();

    /**
     * Gets the API version of the {@link Server}.
     * 
     * @return The API version.
     */
    String getApiVersion();

    /**
     * Gets the ip address of the {@link Server}.
     * 
     * @return The ip address
     */
    String getAddress();

    /**
     * Gets the port of the {@link Server}.
     * 
     * @return the port
     */
    int getPort();

    /**
     * Gets the message of the day of the {@link Server}.
     * 
     * @return The message of the day
     */
    String getMotd();

    /**
     * Sets the message of the day of the {@link Server}.
     * 
     * @param motd
     *            The new message of the day
     */
    void setMotd(String motd);

    /**
     * Gets the max player number the {@link Server} can have online.
     * 
     * @return The max player number
     */
    int getMaxPlayerNumber();

    /**
     * Sets the max player number of the {@link Server}.
     * 
     * @param count
     *            The new max player number
     */
    void setMaxPlayerNumber(int count);

    /**
     * Gets the current online player number of the {@link Server}.
     * 
     * @return The current online player number
     */
    int getOnlinePlayerNumber();

    /**
     * Gets the current {@link WorldManager}.
     * 
     * @return The current {@link WorldManager}
     */
    WorldManager getWorldManager();

    /**
     * Gets the current {@link PluginManager}.
     * 
     * @return The current {@link PluginManager}
     */
    PluginManager getPluginManager();

    /**
     * Gets the current {@link EventManager}.
     * 
     * @return The current {@link EventManager}
     */
    EventManager getEventManager();
}
