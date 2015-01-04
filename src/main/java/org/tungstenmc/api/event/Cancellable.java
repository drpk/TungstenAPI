package org.tungstenmc.api.event;

/**
 * An {@link Event} that can be cancelled.
 */
public interface Cancellable {

    /**
     * Returns if the {@link Event} was cancelled.
     * 
     * @return The flag
     */
    boolean wasCancelled();

    /**
     * Sets the cancellation state of the {@link Event}.
     * 
     * @param flag
     *            The state
     */
    void setCancelled(boolean flag);
}
