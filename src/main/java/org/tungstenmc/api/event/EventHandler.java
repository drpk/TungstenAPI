package org.tungstenmc.api.event;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * A method annotated with this handles an {@link Event}.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EventHandler {

    /**
     * Returns the priority of the current {@link EventHandler} method.
     * 
     * @return The priority
     */
    HandlerPriority priority() default HandlerPriority.NORMAL;

    /**
     * Returns if the {@link EventHandler} needs to be called even if the event
     * is cancelled.
     * 
     * @return The boolean flag
     */
    boolean ignoreCancelled() default false;
}
