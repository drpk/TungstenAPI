package org.tungstenmc.api.event.server;

import org.tungstenmc.api.Server;
import org.tungstenmc.api.event.Event;

/**
 * Holds a {@link Server} based event.
 */
public abstract class ServerEventBase implements Event {

    private Server server;

    public ServerEventBase(Server server) {
        this.server = server;
    }

    /**
     * Gets the {@link Server} this event is happaning with.
     * 
     * @return The server
     */
    public Server getServer() {
        return server;
    }
}
