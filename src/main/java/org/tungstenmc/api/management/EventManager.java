package org.tungstenmc.api.management;

import java.util.List;

import org.tungstenmc.api.event.Event;
import org.tungstenmc.api.event.Listener;
import org.tungstenmc.api.plugin.BasePlugin;

/**
 * A class that manages the event system.
 */
public interface EventManager {

    /**
     * Registers a listener to the event manager.
     * 
     * @param listener
     *            The listener to register
     * @param plugin
     *            The plugin owner of the Listener
     */
    void registerListener(Listener listener, BasePlugin plugin);

    /**
     * Executes an {@link Event} on registered {@link Listener}s.
     * 
     * @param event
     *            The {@link Event} to execute
     */
    void executeEvent(Event event);

    /**
     * Returns a list of listeners belonging to a plugin.
     * 
     * @param plugin
     *            The plugin
     * @return The list
     */
    List<Listener> getListeners(BasePlugin plugin);

    /**
     * Unregisters all listeners belonging to a plugin.
     * 
     * @param plugin
     *            The plugin
     */
    void unregisterAll(BasePlugin plugin);

    /**
     * Unregisters the specified {@link Listener}.
     * 
     * @param listener
     *            The {@link Listener}
     */
    void unregister(Listener listener);
}
