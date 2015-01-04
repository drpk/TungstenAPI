package org.tungstenmc.api.management;

import java.util.Optional;

import org.tungstenmc.api.world.Environment;
import org.tungstenmc.api.world.World;
import org.tungstenmc.api.world.WorldType;

/**
 * A class that does {@link World} based tasks.
 */
public interface WorldManager {

    /**
     * Gets the spawn {@link World}.
     * 
     * @return The spawn {@link World}
     */
    World getSpawnWorld();

    /**
     * Sets the spawn {@link World}.
     * 
     * @param world
     *            The new spawn {@link World}
     */
    void setSpawnWorld(World world);

    /**
     * Gets the {@link World} with the specified name.
     * 
     * @param name
     *            The name
     * @return The {@link World} with the name or Optional.absent() if not found
     */
    Optional<World> getWorld(String name);

    /**
     * Gets the default {@link World} for the specified {@link Environment}.
     * 
     * @param environment
     *            The environment
     * @return The default world for the specified {@link Environment}
     */
    World getDefaultWorldForEnvironment(Environment environment);

    /**
     * Sets the default {@link World} for the specified {@link Environment}.
     * 
     * @param world
     *            The new default {@link World}
     * @param environment
     *            The {@link Environment}
     */
    void setDefaultWorldForEnvironment(World world, Environment environment);

    /**
     * Creates a new {@link World} with the specified parameters or if exits
     * loads it.
     * 
     * @param name
     *            The name of the new {@link World}
     * @param environment
     *            The {@link Environment} of the new {@link World}
     * @param type
     *            The type of the new {@link World}
     * @param generator
     *            The generator of the new {@link World}
     */
    void createWorld(String name, Environment environment, WorldType type,
            Object generator);

    /**
     * Loads a {@link World} with the specified name.
     * 
     * @param name
     *            The name of the {@link World} to load
     */
    void loadWorld(String name);

    /**
     * Unloads the specified {@link World}.
     * 
     * @param world
     *            The {@link World} to unload
     */
    void unloadWorld(World world);
}
