package org.tungstenmc.api.location;

/**
 * Represents a 2D location eg. Chunk
 */
public class Location2D {

    private double x;
    private double y;

    /**
     * @param x
     *            The x coordinate
     * @param y
     *            The y coordinate
     */
    public Location2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the X coordinate of the location.
     * 
     * @return The X coordinate
     */
    public double getX() {
        return x;
    }

    /**
     * Gets the Y coordinate of the location.
     * 
     * @return The Y coordinate
     */
    public double getY() {
        return y;
    }
}
