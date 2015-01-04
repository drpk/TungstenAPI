package org.tungstenmc.api.event.server;

import java.util.List;

import org.tungstenmc.api.Server;
import org.tungstenmc.api.entity.Player;

/**
 * An event that gets called when someone pings the server.
 */
public class ServerPingRequestEvent extends ServerEventBase {

    private int playerCount;
    private int maxPlayerCount;
    private String motd;
    private List<Player> playersToDisplay;

    public ServerPingRequestEvent(Server server, int playerCount,
            int maxPlayerCount, String motd, List<Player> playersToDisplay) {
        super(server);
        this.playerCount = playerCount;
        this.maxPlayerCount = maxPlayerCount;
        this.motd = motd;
        this.playersToDisplay = playersToDisplay;
    }

    /**
     * Gets the displayed number of players on the server.
     * 
     * @return The number
     */
    public int getPlayerCount() {
        return playerCount;
    }

    /**
     * Gets the displayed max player count.
     * 
     * @return The count
     */
    public int getMaxPlayerCount() {
        return maxPlayerCount;
    }

    /**
     * Gets the displayed motd.
     * 
     * @return The motd
     */
    public String getMotd() {
        return motd;
    }

    /**
     * Gets a list of displayed players. (This can be modified)
     * 
     * @return The list
     */
    public List<Player> getPlayersToDisplay() {
        return playersToDisplay;
    }
}
