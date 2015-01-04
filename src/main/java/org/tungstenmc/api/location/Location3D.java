package org.tungstenmc.api.location;

/**
 * Holds a 3D location eg. Block
 */
public class Location3D {

    private double x;
    private double y;
    private double z;

    /**
     * @param x
     *            The X coordinate
     * @param y
     *            The Y coordinate
     * @param z
     *            The Z coordinate
     */
    public Location3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    /**
     * Gets the Z coordinate of the location.
     * 
     * @return The Z coordinate
     */
    public double getZ() {
        return z;
    }
}
