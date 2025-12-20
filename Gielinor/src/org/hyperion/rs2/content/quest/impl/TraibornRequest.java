package org.hyperion.rs2.content.quest.impl;

import java.util.HashMap;
import java.util.Map;

import org.hyperion.rs2.content.Dialogue;
import org.hyperion.rs2.content.DialogueLoader;
import org.hyperion.rs2.content.DialogueLoader.Type;
import org.hyperion.rs2.content.quest.Quest;
import org.hyperion.rs2.content.quest.QuestHandler;
import org.hyperion.rs2.content.skills.magic.Magic.MagicType;
import org.hyperion.rs2.event.Event;
import org.hyperion.rs2.model.Animation;
import org.hyperion.rs2.model.GameObject;
import org.hyperion.rs2.model.GameObjectDefinition;
import org.hyperion.rs2.model.Graphic;
import org.hyperion.rs2.model.Item;
import org.hyperion.rs2.model.Location;
import org.hyperion.rs2.model.NPC;
import org.hyperion.rs2.model.NPCDefinition;
import org.hyperion.rs2.model.Player;
import org.hyperion.rs2.model.World;
import org.hyperion.rs2.model.container.Inventory;
import org.hyperion.rs2.content.GlobalObjectManager;

public class TraibornRequest implements Quest {
	
	public static final int MAIN_QUEST_STAGE_INDEX = 0;
	private static final int MAXIMUM_STAGE = 3;
	private static final int QUEST_ID = 29; // Using Cook's Assistant quest ID
	private static final int TRAIBORN_NPC_ID = 881;
	private static final int FEATHER_ITEM_ID = 314;
	private static final int FEATHERS_NEEDED = 20;
	private static final int REWARD_GP = 10000000; // 10 million GP
	private static final int MAX_ACCOUNTS_PER_IP = 2;
	
	// Altar locations (reward) - Lumbridge / Smelter House area (per server design)
	// Note: swapped per requirement (the model that looks "ancient" should be the Ancient spellbook altar).
	private static final Location ANCIENT_ALTAR_LOC = Location.create(3222, 3251, 0);
	private static final Location LUNAR_ALTAR_LOC = Location.create(3221, 3248, 0);
	private static final Location PRAYER_ALTAR_LOC = Location.create(3227, 3251, 0);
	
	// Altar object IDs (visuals)
	private static final int PRAYER_ALTAR_ID = 409; // standard prayer altar
	private static final int LUNAR_ALTAR_ID = 410; // (visual) altar used for Lunar toggling
	private static final int ANCIENT_ALTAR_ID = 6552; // Ancient altar (1x3)
	
	// Track IP addresses that have received GP reward
	private static final Map<String, Integer> ipRewardCount = new HashMap<String, Integer>();
	
	private static final String[][] QUEST_LINES = {
		{"To start this quest, speak to Traiborn", "in the Lumbridge Smelter House.", "", "Quest Requirements:", "None", "", "Quest Description:", "Traiborn needs 20 feathers. Collect them", "from chickens in Lumbridge and bring", "them back to Traiborn."},
		{"<str>To start this quest, speak to Traiborn", "<str>in the Lumbridge Smelter House.", "", "You should kill some chickens in Lumbridge", "to collect 20 feathers.", "Then bring the feathers back to Traiborn."},
		{"<str>To start this quest, speak to Traiborn", "<str>in the Lumbridge Smelter House.", "<str>You should kill some chickens in Lumbridge", "<str>to collect 20 feathers.", "I have collected the feathers, now I need to", "bring them to Traiborn."},
		{"<str>To start this quest, speak to Traiborn", "<str>in the Lumbridge Smelter House.", "<str>You should kill some chickens in Lumbridge", "<str>to collect 20 feathers.", "<str>I have collected the feathers, now I need to", "<str>bring them to Traiborn.", "<col=00EE00>         QUEST COMPLETE!", "<col=00008B>	I gained access to magic switching altars", "<col=00008B>and 10,000,000 GP."},
	};
	
	@Override
	public void dialogueEnded(Player player) {
		// Called when dialogue closes with -2
		// This is a good place to show quest interface if quest was just started
		int stage = player.getTraibornQuestStage();
		if(stage == 1) {
			// Quest was just started, show interface
			World.getWorld().submit(new Event(500) {
				@Override
				public void execute() {
					QuestHandler.sendQuestInterface(player, QUEST_ID);
					this.stop();
				}
			});
		}
	}

	@Override
	public int getConfigId() {
		return 29; // Using Cook's Assistant config ID
	}

	@Override
	public int getConfigValue() {
		return 2; // Completed value
	}

	@Override
	public void getDialogueForQuestStage(DialogueLoader dl, Player player, NPC npc) {
		if(npc.getDefinition().getId() == TRAIBORN_NPC_ID) {
			int stage = player.getTraibornQuestStage();
			
			// Allow completion via talking if the player already has the feathers.
			if(stage < MAXIMUM_STAGE && player.getInventory().getCount(FEATHER_ITEM_ID) >= FEATHERS_NEEDED) {
				completeQuest(player);
				return;
			}
			Dialogue dialogue = QuestHandler.getDialougeForQuestStage(dl, QUEST_ID, stage);
			if(dialogue != null) {
				DialogueLoader.handleQuestDialogue(player, dl, dialogue);
			} else {
				// Fallback to default dialogue
				DialogueLoader.getNextDialogue(player, dl, 0);
			}
		}
	}

	@Override
	public String[] getQuestLines(Player player) {
		int stage = player.getTraibornQuestStage();
		if(stage >= QUEST_LINES.length) {
			stage = QUEST_LINES.length - 1;
		}
		return QUEST_LINES[stage];
	}

	@Override
	public String getQuestName() {
		return "Traiborn's Request";
	}

	@Override
	public void handleDialogueActions(Player player, DialogueLoader dialogueLoader, int nextDialogueId) {
		Dialogue dialogue = null;
		int stage = player.getTraibornQuestStage();
		
		switch(nextDialogueId) {
		case 2: // Player said "Yes please" (no logic here; handled on QUEST step)
			return; // Return early to prevent further processing
		case 3: // Quest acceptance dialogue (QUEST type) - start the quest here
			if(stage == 0) {
				// Start the quest on the QUEST dialogue step so it always fires
				player.setTraibornQuestStage(1);
				player.getActionSender().sendConfig(getConfigId(), 1); // Light yellow
				stage = 1;
			}
			// Find dialogue 3 by ID and show it
			for(Dialogue d : dialogueLoader.getDialouges()) {
				if(d.getId() == 3) {
					dialogue = d;
					break;
				}
			}
			if(dialogue != null) {
				// Show the dialogue
				DialogueLoader.dialogue(player, new NPC(NPCDefinition.forId(dialogueLoader.getNpcId())), dialogue.getEmotion(), dialogue.getLines());
				player.setNextDialogueIds(new int[]{-2}); // Use -2 to trigger dialogueEnded
				player.setCurrentDialogueLoader(dialogueLoader);
			}
			// Pop the quest-details interface shortly after accepting (player expectation).
			World.getWorld().submit(new Event(600) {
				@Override
				public void execute() {
					QuestHandler.sendQuestInterface(player, QUEST_ID);
					this.stop();
				}
			});
			return; // Return early to prevent further processing
		case 10: // Player said "No i dont have time for this today"
			// Find dialogue 11 by ID
			for(Dialogue d : dialogueLoader.getDialouges()) {
				if(d.getId() == 11) {
					dialogue = d;
					break;
				}
			}
			if(dialogue != null) {
				// Show the "Very well" dialogue and then close properly
				DialogueLoader.dialogue(player, new NPC(NPCDefinition.forId(dialogueLoader.getNpcId())), dialogue.getEmotion(), dialogue.getLines());
				player.setNextDialogueIds(new int[]{-1});
				player.setCurrentDialogueLoader(dialogueLoader);
			} else {
				// If dialogue not found, just close
				player.getActionSender().sendCloseInterface();
			}
			return; // Return early to prevent further processing
		}
	}

	@Override
	public boolean isFinished(Player player) {
		return player.getTraibornQuestStage() == MAXIMUM_STAGE;
	}

	@Override
	public boolean isStarted(Player player) {
		return player.getTraibornQuestStage() != 0;
	}
	
	/**
	 * Handles using feathers on Traiborn
	 */
	public static boolean handleFeathersOnTraiborn(Player player, NPC npc) {
		if(npc.getDefinition().getId() != TRAIBORN_NPC_ID) {
			return false;
		}
		
		int stage = player.getTraibornQuestStage();
		
		if(stage == 0) {
			// Allow hand-in even if they didn't formally start the quest.
			player.setTraibornQuestStage(1);
			player.getActionSender().sendConfig(((TraibornRequest) QuestHandler.getQuest(QUEST_ID)).getConfigId(), 1);
			stage = 1;
		}
		
		if(stage >= MAXIMUM_STAGE) {
			player.getActionSender().sendMessage("I have already completed this quest.");
			return true;
		}
		
		int featherCount = player.getInventory().getCount(FEATHER_ITEM_ID);
		
		if(featherCount < FEATHERS_NEEDED) {
			player.getActionSender().sendMessage("I need " + FEATHERS_NEEDED + " feathers, but I only have " + featherCount + ".");
			System.out.println("Traiborn feathers: not enough ("+featherCount+"/"+FEATHERS_NEEDED+") player="+player.getName()+" stage="+stage);
			return true;
		}
		
		completeQuest(player);
		return true;
	}
	
	private static void completeQuest(Player player) {
		// Remove feathers
		player.getInventory().remove(new Item(FEATHER_ITEM_ID, FEATHERS_NEEDED));
		
		player.setTraibornQuestStage(MAXIMUM_STAGE);
		TraibornRequest quest = (TraibornRequest) QuestHandler.getQuest(QUEST_ID);
		if(quest != null) {
			player.getActionSender().sendConfig(quest.getConfigId(), quest.getConfigValue()); // Green (completed)
		}

		// Award quest points.
		player.setQuestPoints(player.getQuestPoints() + 5);
		player.getActionSender().sendConfig(101, player.getQuestPoints());
		
		// Give GP reward (with IP limit)
		String ipAddress = player.getSession().getRemoteAddress().toString().split(":")[0];
		int accountsFromIP = ipRewardCount.getOrDefault(ipAddress, 0);
		
		if(accountsFromIP < MAX_ACCOUNTS_PER_IP) {
			player.getInventory().add(new Item(995, REWARD_GP)); // 995 is GP item ID
			ipRewardCount.put(ipAddress, accountsFromIP + 1);
			player.getActionSender().sendMessage("You receive 10,000,000 GP as a reward!");
		} else {
			player.getActionSender().sendMessage("You have reached the maximum reward limit for your IP address.");
		}
		
		// Play completion dialogue if present in dialouges.xml (id 13 for Traiborn)
		DialogueLoader dl = DialogueLoader.forId(TRAIBORN_NPC_ID);
		if(dl != null) {
			Dialogue d = dl.getDialogueById(13);
			if(d != null) {
				DialogueLoader.dialogue(player, new NPC(NPCDefinition.forId(TRAIBORN_NPC_ID)), d.getEmotion(), d.getLines());
				player.setNextDialogueIds(new int[]{-1});
				player.setCurrentDialogueLoader(dl);
			}
		}
		
		// Show completion interface
		player.getActionSender().sendInterface(277);
		player.getActionSender().sendString("You have completed Traiborn's Request!", 277, 2);
		player.getActionSender().sendString("Access to Magic Switching Altars", 277, 8);
		player.getActionSender().sendString("10,000,000 GP", 277, 9);
		for(int i = 10; i < 15; i++) {
			player.getActionSender().sendString("", 277, i);
		}
		player.getActionSender().sendString(""+player.getQuestPoints(), 277, 5);
		player.getActionSender().sendInterfaceModel(277, 17, 400, FEATHER_ITEM_ID);
		
		player.getActionSender().sendMessage("Congratulations! Quest complete!");
		player.getActionSender().sendMessage("You can now use the magic switching altars near Traiborn.");
	}
	
	/**
	 * Handles clicking on magic switching altars
	 */
	@Override
	public boolean handleObjectClicking(Player player, int objectId, Location loc, int option) {
		// Check if it's one of our altars by location
		boolean isAncientAltar = (loc.equals(ANCIENT_ALTAR_LOC) && objectId == ANCIENT_ALTAR_ID);
		boolean isLunarAltar = (loc.equals(LUNAR_ALTAR_LOC) && objectId == LUNAR_ALTAR_ID);
		boolean isPrayerAltar = (loc.equals(PRAYER_ALTAR_LOC) && objectId == PRAYER_ALTAR_ID);
		
		// Prayer altar works for everyone (no quest requirement)
		if(isPrayerAltar) {
			// Use the prayer altar system
			org.hyperion.rs2.content.skills.Prayer.altar(player, false);
			return true;
		}
		
		if(!isAncientAltar && !isLunarAltar) {
			return false;
		}
		
		// Check if quest is completed for magic switching altars
		if(!isFinished(player)) {
			player.getActionSender().sendMessage("You need to complete Traiborn's Request quest to use these altars.");
			player.getActionSender().sendMessage("Speak to Traiborn in the Lumbridge Smelter House to start the quest.");
			return true;
		}
		
		// Toggle spellbooks. Clicking the same altar again returns you to Modern (default).
		if(isAncientAltar) {
			if(player.getMagic().getSpellBook() == MagicType.ANCIENT) {
				player.getMagic().setSpellBook(MagicType.MODERN);
				player.getActionSender().sendMessage("You switch to the Modern spellbook.");
			} else {
				player.getMagic().setSpellBook(MagicType.ANCIENT);
				player.getActionSender().sendMessage("You switch to the Ancient spellbook.");
			}
		} else if(isLunarAltar) {
			if(player.getMagic().getSpellBook() == MagicType.LUNAR) {
				player.getMagic().setSpellBook(MagicType.MODERN);
				player.getActionSender().sendMessage("You switch to the Modern spellbook.");
			} else {
				player.getMagic().setSpellBook(MagicType.LUNAR);
				player.getActionSender().sendMessage("You switch to the Lunar spellbook.");
			}
		}
		
		player.playAnimation(Animation.create(645)); // Prayer-like animation
		player.playGraphics(Graphic.create(110)); // Some magic effect
		
		return true;
	}
	
	/**
	 * Checks if player can switch magic spellbooks
	 */
	public static boolean canSwitchMagic(Player player) {
		TraibornRequest quest = (TraibornRequest) QuestHandler.getQuest(QUEST_ID);
		if(quest == null) {
			return false;
		}
		return quest.isFinished(player);
	}
	
	/**
	 * Spawns the magic switching altars at server startup
	 */
	public static void spawnAltars() {
		try {
			System.out.println("Traiborn's Request: Spawning altars...");
			// Wait a bit longer to ensure regions are loaded
			Thread.sleep(5000);
			
			// Use GlobalObjectManager to ensure objects are visible to all players
			GlobalObjectManager gom = GlobalObjectManager.getInstance();
			
			spawnSingleAltar(gom, "Ancient", ANCIENT_ALTAR_ID, ANCIENT_ALTAR_LOC);
			spawnSingleAltar(gom, "Prayer", PRAYER_ALTAR_ID, PRAYER_ALTAR_LOC);
			spawnSingleAltar(gom, "Lunar", LUNAR_ALTAR_ID, LUNAR_ALTAR_LOC);
			
			System.out.println("Traiborn's Request: All 3 altars spawned successfully!");
		} catch (Exception e) {
			System.err.println("Error spawning Traiborn quest altars: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private static void spawnSingleAltar(GlobalObjectManager gom, String name, int id, Location loc) {
		try {
			GameObjectDefinition def = GameObjectDefinition.forId(id);
			if(def == null) {
				System.err.println("Traiborn's Request: Definition null for altar id " + id);
				return;
			}
			GameObject altar = new GameObject(def, loc, 10, 0);
			World.getWorld().getRegionManager().getRegionByLocation(loc).getGameObjects().add(altar);
			gom.createSpawn(null, altar);
			System.out.println("Traiborn's Request: Spawned "+name+" Altar id="+id+" at " + loc);
		} catch (Exception e) {
			System.err.println("Traiborn's Request: Failed to spawn "+name+" altar at "+loc+" -> "+e.getMessage());
			e.printStackTrace();
		}
	}

}

