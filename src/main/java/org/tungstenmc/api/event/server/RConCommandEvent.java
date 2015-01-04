package org.tungstenmc.api.event.server;

import org.tungstenmc.api.Server;

public class RConCommandEvent extends ServerEventBase {

    public RConCommandEvent(Server server) {
        super(server);
    }
}
