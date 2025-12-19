package org.hyperion.rs2.model;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hyperion.rs2.event.impl.PestControlEvent;
import org.hyperion.util.XStreamUtil;

/**
 * Represents a type of NPC.
 * 
 * @author Graham
 * 
 */
public class NPCDefinition {

	private static NPCDefinition[] definitions = null;

	@SuppressWarnings("unchecked")
	public static void init() throws IOException {
		List<NPCDefinition> defs = (List<NPCDefinition>) XStreamUtil.getXStream().fromXML(new FileInputStream("data/npcDefinitions.xml"));
		definitions = new NPCDefinition[defs.size()];

		for (NPCDefinition def : defs) {
			definitions[def.getId()] = def;
		}
		/*
		 * We start this event here, because its referring NPCs.
		 */
		World.getWorld().submit(new PestControlEvent());
	}
	
	public static class NPCINFO {
		private final String name;
		private final int level;
		private final int hits;
		private final boolean aggressive;
		private final boolean retreats;
		private final boolean poisonous;
		
		public NPCINFO(String name, int level, int hits, boolean aggressive, boolean retreats, boolean poisonous) {
			this.name = name;
			this.level = level;
			this.hits = hits;
			this.aggressive = aggressive;
			this.retreats = retreats;
			this.poisonous = poisonous;
		}
		
		public String getName() {
			return name;
		}

		public int getLevel() {
			return level;
		}

		public int getHits() {
			return hits;
		}

		public boolean isAggressive() {
			return aggressive;
		}

		public boolean isRetreats() {
			return retreats;
		}

		public boolean isPoisonous() {
			return poisonous;
		}
		
		
	}

	public static NPCDefinition forId(int id) {
		NPCDefinition d = definitions[id];
		if (d == null) {
			d = produceDefinition(id);
		}
		return d;
	}

	private int id;
	private String name, examine;
	private int respawn = 0, combat = 0, hitpoints = 1, maxHit = 0, size = 1,
			attackSpeed = 4000, attackAnim = 422, defenceAnim = 404,
			deathAnim = 2304, attackBonus = 20, defenceMelee = 20,
			defenceRange = 20, defenceMage = 20;

	private boolean attackable = false;
	private boolean aggressive = false;
	private boolean retreats = false;
	private boolean poisonous = false;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getExamine() {
		return examine;
	}

	public int getRespawn() {
		return respawn;
	}

	public int getCombat() {
		return combat;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public int getMaxHit() {
		return maxHit;
	}

	public int getSize() {
		return size;
	}
	
	public boolean isAggressive() {
		return aggressive;
	}

	public boolean retreats() {
		return retreats;
	}

	public boolean isPoisonous() {
		return poisonous;
	}

	public static NPCDefinition produceDefinition(int id) {
		NPCDefinition def = new NPCDefinition();
		def.id = id;
		def.name = "NPC #" + def.id;
		def.examine = "It's an NPC.";
		return def;
	}

	public int getAttackSpeed() {
		return attackSpeed;
	}

	public int getAttackAnimation() {
		return attackAnim;
	}

	public int getDefenceAnimation() {
		return defenceAnim;
	}

	public int getDeathAnimation() {
		return deathAnim;
	}

	public boolean isAttackable() {
		return attackable;
	}

	public int getAttackBonus() {
		return attackBonus;
	}

	public int getDefenceRange() {
		return defenceRange;
	}

	public int getDefenceMelee() {
		return defenceMelee;
	}

	public int getDefenceMage() {
		return defenceMage;
	}

}
