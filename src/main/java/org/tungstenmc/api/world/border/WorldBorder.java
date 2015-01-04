package org.tungstenmc.api.world.border;

import org.tungstenmc.api.location.Location2D;
import org.tungstenmc.api.location.Location3D;

/**
 * Represents the border of a world.
 */
public interface WorldBorder {

    /**
     * Checks is a {@link Chunk} inside this border.
     * 
     * @param location
     *            The location of the {@link Chunk} to check
     * @return The result
     */
    boolean isChunkInside(Location2D location);

    /**
     * Checks is a {@link Block} inside this border.
     * 
     * @param location
     *            The location of the {@link Block} to check
     * @return The result
     */
    boolean isBlockInside(Location3D location);

    /**
     * Gets the center point of the border.
     * 
     * @return The center point
     */
    Location2D getCenter();

    /**
     * Sets the center point of the border.
     * 
     * @param center
     *            The new center point
     */
    void setCenter(Location2D center);

    /**
     * Gets the size of the border.
     * 
     * @return The size
     */
    int getSize();

    /**
     * Sets the size of the border
     * 
     * @param size
     *            The new size
     */
    void setSize(int size);

    /**
     * Sets the size of the border with transition.
     * 
     * @param size
     *            The new size
     * @param tranisition
     *            The transition lenght
     */
    void setSize(int size, int tranisition);

    /**
     * Gets the damage amount of the border.
     * 
     * @return The damage amount
     */
    int getDamageAmount();

    /**
     * Sets the damage amount of the border.
     * 
     * @param amount
     *            The amount
     */
    void setDamageAmount(int amount);

    /**
     * Gets the damage buffer of the border.
     * 
     * @return The buffer
     */
    int getDamageBuffer();

    /**
     * Sets the damage buffer of the border.
     * 
     * @param buffer
     *            The new buffer
     */
    void setDamageBuffer(int buffer);

    /**
     * Gets the warning time of the border.
     * 
     * @return The warning time
     */
    int getWarningTime();

    /**
     * Sets the warning time of the border.
     * 
     * @param time
     *            The new warning time
     */
    void setWarningTime(int time);

    /**
     * Gets the warning distance of the border.
     * 
     * @return The warning distance
     */
    int getWarningDistance();

    /**
     * Sets the warning distance of the border.
     * 
     * @param distance
     *            The new warning ditance
     */
    void setWarningDistance(int distance);

    /**
     * Gets the status of this border.
     * 
     * @return The status
     */
    BorderStatus getStatus();

    /**
     * The status of a {@link WorldBorder}.
     */
    public enum BorderStatus {
        /**
         * The border currently grows.
         */
        GROWING(0),
        /**
         * The border currently shrinks.
         */
        SHRINKING(1),
        /**
         * The border currently static.
         */
        STATIC(2);

        private int id;

        private BorderStatus(int id) {
            this.id = id;
        }

        /**
         * Gets the vanilla id of the status.
         * 
         * @return The vanilla id
         */
        public int getId() {
            return id;
        }
    }
}
