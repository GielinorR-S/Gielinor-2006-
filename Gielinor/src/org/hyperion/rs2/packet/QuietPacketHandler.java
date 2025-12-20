package org.hyperion.rs2.packet;

import org.hyperion.rs2.content.GlobalObjectManager;
import org.hyperion.rs2.model.Player;
import org.hyperion.rs2.net.Packet;

/**
 * A packet handler which takes no action i.e. it ignores the packet.
 * @author Graham Edgecombe
 *
 */
public class QuietPacketHandler implements PacketHandler {

	@Override
	public void handle(Player player, Packet packet) {
		// Used for "region loaded" and other keep-alive packets in this server.
		// Ensure global objects (like quest reward altars) are refreshed when a player loads a region.
		if(player != null) {
			GlobalObjectManager.getInstance().refresh(player);
		}
	}

}
