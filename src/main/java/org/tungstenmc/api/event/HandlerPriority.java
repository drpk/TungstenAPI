package org.tungstenmc.api.event;

/**
 * An enum to specify priorities that an {@link EventHandler} can hold.
 */
public enum HandlerPriority {
    LOWEST, LOW, BELOW_NORMAL, NORMAL, BELOW_HIGH, HIGH, HIGHEST;
}
