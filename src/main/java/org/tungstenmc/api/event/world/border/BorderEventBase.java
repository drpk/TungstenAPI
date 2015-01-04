package org.tungstenmc.api.event.world.border;

import org.tungstenmc.api.event.Event;
import org.tungstenmc.api.world.border.WorldBorder;

/**
 * Represents a {@link WorldBorder} based event.
 */
public abstract class BorderEventBase implements Event {

    private WorldBorder border;

    public BorderEventBase(WorldBorder border) {
        this.border = border;
    }

    /**
     * Gets the {@link WorldBorder} affected by this event.
     * 
     * @return The {@link WorldBorder}
     */
    public WorldBorder getBorder() {
        return border;
    }
}
