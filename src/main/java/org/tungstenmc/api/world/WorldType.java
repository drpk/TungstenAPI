package org.tungstenmc.api.world;

import javax.annotation.Nullable;

import com.google.common.base.Optional;

/**
 * Represents the type of {@link World}.
 */
public enum WorldType {
    /**
     * Represents a normal minecraft {@link World}.
     */
    NORMAL(0, "default"),
    /**
     * Represents a flat {@link World}.
     */
    FLAT(1, "flat"),
    /**
     * Represents a {@link World} from an older version of minecraft.
     */
    OLD(8, "default_1_1"),
    /**
     * Represents the new debug {@link World} introduced in 1.8.
     */
    DEBUG(5, "debug_all_block_states"),
    /**
     * Represents a {@link World} with large biomes.
     */
    LARGE_BIOMES(2, "largeBiomes"),
    /**
     * Represents a customized {@link World}.
     */
    CUSTOMIZED(4, "customized"),
    /**
     * Represents an amplified {@link World}.
     */
    AMPLIFIED(3, "amplified");

    /**
     * Gets the {@link WorldType} with the specified id.
     * 
     * @param id
     *            The id
     * @return The {@link WorldType} with the id or Optional.absent() if not
     *         found
     */
    @Nullable
    public static Optional<WorldType> byId(int id) {
        for (WorldType type : values()) {
            if (type.getId() == id) {
                return Optional.of(type);
            }
        }
        return Optional.absent();
    }

    /**
     * Gets the {@link WorldType} with the specified name.
     * 
     * @param name
     *            The name
     * @return The {@link WorldType} with the name or Optional.absent() if not
     *         found
     */
    @Nullable
    public static Optional<WorldType> byName(String name) {
        for (WorldType type : values()) {
            if (type.getName().equalsIgnoreCase(name)) {
                return Optional.of(type);
            }
        }
        return Optional.absent();
    }

    private int id;
    private String name;

    private WorldType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets the vanilla id of the {@link WorldType}.
     * 
     * @return The vanilla id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the vanilla name of the {@link WorldType}.
     * 
     * @return The vanilla name
     */
    public String getName() {
        return name;
    }
}
