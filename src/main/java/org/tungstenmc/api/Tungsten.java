package org.tungstenmc.api;

import org.apache.logging.log4j.Logger;

public class Tungsten {

    private static Server server;

    public void setServer() {
        if (server != null) {
            return;
        }
        // Init here
    }

    public static Logger getLogger() {
        return server.getLogger();
    }

    public static boolean isServerRunning() {
        return server.isRunning();
    }
}
