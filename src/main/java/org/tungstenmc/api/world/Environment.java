package org.tungstenmc.api.world;

import javax.annotation.Nullable;

import com.google.common.base.Optional;

/**
 * Represents the environment of a {@link World}.
 */
public enum Environment {
    /**
     * The default {@link Environment} of a {@link World}.
     */
    OVERWORLD(0, "OVERWORLD"),
    /**
     * The {@link Environment} used by nether type {@link World}s.
     */
    NETHER(-1, "NETHER"),
    /**
     * The {@link Environment} of the end.
     */
    THE_END(1, "THE_END");

    /**
     * Gets the {@link Environment} with the specified dimension id.
     * 
     * @param dimensionId
     *            The dimension id
     * @return The {@link Environment} with the id or Optional.absent() if not
     *         found
     */
    @Nullable
    public static Optional<Environment> byDimensionId(int dimensionId) {
        for (Environment env : values()) {
            if (env.getDimensionsId() == dimensionId) {
                return Optional.of(env);
            }
        }
        return Optional.absent();
    }

    /**
     * Gets the {@link Environment} with the specified name.
     * 
     * @param name
     *            The name
     * @return The {@link Environment} with the name or Optional.absent() if not
     *         found
     */
    @Nullable
    public static Optional<Environment> byName(String name) {
        for (Environment env : values()) {
            if (env.getName().equalsIgnoreCase(name)) {
                return Optional.of(env);
            }
        }
        return Optional.absent();
    }

    private int dimensionsId;
    private String name;

    private Environment(int dimensionsId, String name) {
        this.dimensionsId = dimensionsId;
        this.name = name;
    }

    /**
     * Gets the vanilla dimension id of the {@link Environment}.
     * 
     * @return The vanilla dimension id
     */
    public int getDimensionsId() {
        return dimensionsId;
    }

    /**
     * Gets the name of the {@link Environment}.
     * 
     * @return The name
     */
    public String getName() {
        return name;
    }
}
