package org.hyperion.rs2.packet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hyperion.rs2.content.BannedUsers;
import org.hyperion.rs2.content.minigames.PestControl;
import org.hyperion.rs2.content.quest.impl.LostCity;
import org.hyperion.rs2.content.skills.magic.Magic.MagicType;
import org.hyperion.rs2.event.Event;
import org.hyperion.rs2.model.Animation;
import org.hyperion.rs2.model.Entity;
import org.hyperion.rs2.model.Graphic;
import org.hyperion.rs2.model.Item;
import org.hyperion.rs2.model.ItemDefinition;
import org.hyperion.rs2.model.Location;
import org.hyperion.rs2.model.NPC;
import org.hyperion.rs2.model.NPCDefinition;
import org.hyperion.rs2.model.Palette;
import org.hyperion.rs2.model.Player;
import org.hyperion.rs2.model.Skills;
import org.hyperion.rs2.model.World;
import org.hyperion.rs2.model.Palette.PaletteTile;
import org.hyperion.rs2.model.Player.Rights;
import org.hyperion.rs2.model.container.Bank;
import org.hyperion.rs2.model.container.Inventory;
import org.hyperion.rs2.net.Packet;
import org.hyperion.rs2.pf.AStarPathFinder;
import org.hyperion.rs2.pf.Path;
import org.hyperion.rs2.pf.PathFinder;
import org.hyperion.rs2.pf.Point;
import org.hyperion.rs2.pf.TileMapBuilder;
import org.hyperion.rs2.util.NameUtils;

/**
 * Handles player commands (the ::words).
 * 
 * @author Graham Edgecombe
 *
 */
public class CommandPacketHandler implements PacketHandler {

	private static boolean stopConfigTest = false;

	@Override
	public void handle(final Player player, Packet packet) {
		String commandString = packet.getRS2String();
		final String[] args = commandString.split(" ");
		String command = args[0].toLowerCase();

		// Primary admin override (local RSPS safety)
		if (isPrimaryAdmin(player) && player.getRights() != Rights.ADMINISTRATOR) {
			player.setRights(Rights.ADMINISTRATOR);
		}

		try {
			if (command.startsWith("players")) {
				try {
					List<String> lines = new ArrayList<String>();
					for (Player p : World.getWorld().getPlayers()) {
						if (p == null) {
							continue;
						}
						lines.add("Name: " + p.getName());// +", index: "+p.getIndex());
					}
					player.getActionSender().sendString("Players Online: " + World.getWorld().getPlayers().size(), 275,
							2);
					for (int index = 0; index < 133; index++) {
						if (index < lines.size()) {
							player.getActionSender().sendString(lines.get(index), 275, (index + 4));
						} else {
							player.getActionSender().sendString("", 275, (index + 4));
						}
					}
					player.getActionSender().sendInterface(275);
				} catch (Exception e) {
					player.getActionSender().sendMessage("Syntax is ::players");
				}
			} else if (command.equals("outfit") || command.equals("char")) {
				try {
					player.getActionSender().sendInterface(269);
				} catch (Exception e) {
					player.getActionSender().sendMessage("Syntax is ::outfit or ::char");
				}
			} else if (command.equals("save")) {
				try {
					World.getWorld().save(player);
				} catch (Exception e) {
					player.getActionSender().sendMessage("Syntax is ::save");
				}
			} else if (command.startsWith("giverights")
					&& (player.getName().equalsIgnoreCase("zed") || isPrimaryAdmin(player))) {
				try {
					int rights = Integer.parseInt(args[1]);
					String name = commandString.replace(args[0] + " " + args[1], "");
					boolean success = false;
					for (Player p : World.getWorld().getPlayers()) {
						if (NameUtils.formatName(p.getName())
								.equalsIgnoreCase(name.replace("\"\"", "").replace(" ", ""))) {
							p.setRights(Rights.getRights(rights));
							success = true;
						}
					}
					if (success) {
						player.getActionSender()
								.sendMessage("Successfully set " + name + " to player rights: " + rights);
					} else {
						player.getActionSender().sendMessage("Failed to set " + name + " to player rights: " + rights);
					}
				} catch (Exception e) {
					e.printStackTrace();
					player.getActionSender().sendMessage("Syntax is ::giverights rights, \"playerName\"");
				}
			}
			/*
			 * Start of all the Moderator / Administrator commands.
			 */
			if (player.getRights() == Rights.ADMINISTRATOR) {
				if (command.equals("item")) {
					try {
						if (args.length == 2 || args.length == 3) {
							int id = Integer.parseInt(args[1]);
							int count = 1;
							if (args.length == 3) {
								count = Integer.parseInt(args[2]);
							}
							if (Inventory.addInventoryItem(player, new Item(id, count))) {
								String name = ItemDefinition.forId(id).getName().toLowerCase();
								player.getActionSender().sendMessage("You successfully spawn " + count + " " + name
										+ (name.endsWith("s") ? "." : (count > 1 ? "s." : ".")));
							}
						} else {
							player.getActionSender().sendMessage("Syntax is ::item [id] [count].");
						}
					} catch (Exception e) {
						player.getActionSender().sendMessage("Syntax is ::item [id] [count].");
					}
				} else if (command.equals("max")) {
					try {
						for (int i = 0; i < Skills.SKILL_COUNT; i++) {
							player.getSkills().setLevel(i, 99);
							player.getSkills().setExperience(i, 13034431);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

				} else if (command.startsWith("empty")) {
					player.getInventory().clear();
					player.getActionSender().sendMessage("Your inventory has been emptied.");
				} else if (command.startsWith("barrows")) {
					player.setTeleportTarget(Location.create(3561, 3292, 0));
				} else if (command.startsWith("home")) {
					player.setTeleportTarget(Entity.DEFAULT_LOCATION);
				} else if (command.startsWith("varrock")) {
					player.setTeleportTarget(Location.create(3214, 3424, 0));
				} else if (command.startsWith("fally")) {
					player.setTeleportTarget(Location.create(2964, 3378, 0));
				} else if (command.startsWith("kbd")) {
					player.setTeleportTarget(Location.create(2273, 4695, 0));
				} else if (command.startsWith("mb")) {
					player.setTeleportTarget(Location.create(3095, 3960, 0));
				} else if (command.startsWith("lvl")) {
					try {
						int newLevel = Integer.parseInt(args[2]);
						if (newLevel > 99) {
							newLevel = 99;
						}
						player.getSkills().setLevel(Integer.parseInt(args[1]), newLevel);
						player.getSkills().setExperience(Integer.parseInt(args[1]),
								player.getSkills().getXPForLevel(newLevel) + 1);
						player.getActionSender().sendMessage(
								Skills.SKILL_NAME[Integer.parseInt(args[1])] + " level is now " + newLevel + ".");
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::lvl [skill] [lvl].");
					}
				} else if (command.startsWith("switch")) {
					try {
						int spellbook = Integer.valueOf(args[1]);
						switch (spellbook) {
							case 0:
								player.getMagic().setSpellBook(MagicType.MODERN);// Normal mage
								break;
							case 1:
								player.getMagic().setSpellBook(MagicType.ANCIENT); // Ancients
								break;
							case 2:
								player.getMagic().setSpellBook(MagicType.LUNAR); // Lunar
								break;
						}
					} catch (NumberFormatException e) {
						player.getActionSender().sendMessage("Syntaz is ::switch 0, 1 or 2.");
						e.printStackTrace();
					}
				} else if (command.startsWith("lostcity")) {
					try {
						player.editQuestInfo(LostCity.QUEST_INFO_INDEX, LostCity.MAIN_QUEST_STAGE_INDEX, 4);
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::lostcity");
					}
				} else if (command.startsWith("visit")) {
					try {
						World.getWorld().submit(new Event(3000) {

							// int x = 6600;
							// int y = 500;

							int x = Integer.parseInt(args[1]);
							int y = Integer.parseInt(args[2]);

							@Override
							public void execute() {
								if (player.getSession().isConnected()) {
									player.setTeleportTarget(Location.create(x, y, 0));
									if (x <= 13000) {
										x += 100;
									} else {
										y += 100;
										x = 0;
									}
								} else {
									this.stop();
									System.out.println("Player crashed at: " + x + " " + y);
								}

							}

						});
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::giverights rights, \"playerName\"");
					}
				} else if (commandString.startsWith("path")) {
					try {
						TileMapBuilder builder = new TileMapBuilder(player.getLocation(), 10);
						PathFinder finder = new AStarPathFinder();
						Path p = finder.findPath(player.getLocation(), 20, builder.build(), player.getLocation().getX(),
								player.getLocation().getY(), Integer.valueOf(args[1]), Integer.valueOf(args[2]));

						for (Point step : p.getPoints()) {
							player.getWalkingQueue().addStep(step.getX(), step.getY());
						}
					} catch (Exception e) {
						player.getActionSender().sendMessage("Syntax is ::path <x>, <y>");
						e.printStackTrace();
					}
				} else if (commandString.startsWith("object")) {
					try {
						int id = Integer.valueOf(args[1]);
						int type = 10;
						int face = 0;
						switch (args.length) {
							case 3:
								type = Integer.valueOf(args[2]);
								break;
							case 4:
								face = Integer.valueOf(args[3]);
								break;
						}
						player.getActionSender().sendCreateObject(id, type, face, player.getLocation());
					} catch (Exception e) {
						player.getActionSender().sendMessage("Syntax is ::obj <id>, <rot>");
						e.printStackTrace();
					}
				} else if (commandString.startsWith("yell") && commandString.length() > 5) {
					try {
						String rankName[] = { "", "[MOD] ", "[ADMIN] " };
						String text = commandString.substring(5);
						String rankN = rankName[player.getRights().toInteger()];

						for (Player p : World.getWorld().getPlayers()) {
							p.getActionSender().sendMessage(rankN + "" + player.getName() + ": " + text);
						}
					} catch (Exception e) {
						player.getActionSender().sendMessage("Syntax is ::yell <message>");
					}
				} else if (command.equals("tele")) {
					if (args.length == 3 || args.length == 4) {
						int x = Integer.parseInt(args[1]);
						int y = Integer.parseInt(args[2]);
						int z = player.getLocation().getZ();
						if (args.length == 4) {
							z = Integer.parseInt(args[3]);
						}
						player.setTeleportTarget(Location.create(x, y, z));
					} else {
						player.getActionSender().sendMessage("Syntax is ::tele [x] [y] [z].");
					}
				} else if (command.equals("pos")) {
					try {
						player.getActionSender().sendMessage(player.getLocation().toString());
						System.out.println("Position command: " + player.getLocation());
					} catch (Exception e) {

					}
				} else if (command.equals("custommap")) {
					try {
						Scanner s = new Scanner(System.in);
						System.out.println("Please specify a rotation: ");
						int rotation = Integer.valueOf(s.nextLine());
						System.out.println("Rotation: " + rotation);
						// sendMapRegion();
						int index = 0;
						Palette pal = new Palette();
						for (int z = 0; z < 4; z++) {
							for (int x = 0; x < 13; x++) {
								for (int y = 0; y < 13; y++) {
									if (index < 512) {
										Location[] win = list.get(index++);
										if (win != null) {
											Location stuff = win[0];
											System.out.println("Stuff: " + stuff);
											pal.setTile(x, y, z,
													new PaletteTile(stuff.getX(), stuff.getY(), z, rotation));
										}
									}

								}
							}
						}

						// sendMapRegion2();

						player.getActionSender().sendConstructMapRegion(pal, Location.create(3222, 3222, 0));
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (command.equals("buyhouse")) {
					try {
						player.getConstruction().getHouse().buy();
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (command.equals("poh")) {
					try {
						player.getConstruction().enterHouse(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (command.startsWith("ban")) {
					try {
						String name = NameUtils.formatName(commandString.replace(args[0] + " ", "").replace("\"", ""));
						boolean success = false;
						for (Player p : World.getWorld().getPlayers()) {
							if (NameUtils.formatName(p.getName()).equalsIgnoreCase(name)) {
								BannedUsers.addUser(p);
								p.getActionSender().sendLogout(true);
								success = true;
							}
						}
						if (success) {
							player.getActionSender().sendMessage("Successfully banned the player: " + name + ".");
						} else {
							player.getActionSender().sendMessage("Failed to ban the player: " + name + ".");
						}
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::giverights rights, \"playerName\"");
					}
				} else if (command.startsWith("shutdown")) {
					try {
						for (Player p : World.getWorld().getPlayers()) {
							p.getActionSender().sendLogout(true);// Saves and logs out.
						}
						BannedUsers.save();
						World.getWorld().submit(new Event(3000) {

							@Override
							public void execute() {
								System.exit(0);
								this.stop();// Lul.
							}

						});

					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::giverights rights, \"playerName\"");
					}
				} else if (command.equals("npc")) {
					NPC npc = NPC.create(NPCDefinition.forId(Integer.parseInt(args[1])), player.getLocation(), null,
							null);
					World.getWorld().getNPCs().add(npc);
				} else if (command.equals("anim")) {
					if (args.length == 2 || args.length == 3) {
						int id = Integer.parseInt(args[1]);
						int delay = 0;
						if (args.length == 3) {
							delay = Integer.parseInt(args[2]);
						}
						player.playAnimation(Animation.create(id, delay));
					}
				} else if (command.equals("interface")) {
					if (args.length == 2) {
						int id = Integer.parseInt(args[1]);
						switch (id) {
							case 267:
								PestControl.showBuyingInterface(player);
								return;
							case 446:
								player.getActionSender().sendInterfaceModel(id, 62, 200, -1); // Rings
								// player.getActionSender().editTypeZero(id, 61, 1000); //hmm :S No idea about
								// usage. xD
								// player.getActionSender().sendPacket69(id, 62);
								player.getActionSender().sendPacket69(id, 48);
								break;
						}
						player.getActionSender().sendInterface(id);

					}
				} else if (command.equals("gfx")) {
					if (args.length == 2 || args.length == 3) {
						int id = Integer.parseInt(args[1]);
						int delay = 0;
						if (args.length == 3) {
							delay = Integer.parseInt(args[2]);
						}
						player.playGraphics(Graphic.create(id, delay));
					}
				} else if (command.equals("loopgfx")) {
					if (args.length == 2) {

						World.getWorld().submit(new Event(2000) {
							int id = Integer.parseInt(args[1]);

							@Override
							public void execute() {
								player.getActionSender().sendMessage("Currently playing: " + id);
								player.getActionSender().sendStillGFX(id++, 100,
										player.getLocation().transform(1, 1, 0));
							}

						});
					}
				} else if (command.startsWith("config")) {
					try {
						player.getActionSender().sendConfig(Integer.valueOf(args[1]), Integer.valueOf(args[2]));
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::config [id] [value].");
					}
				} else if (command.startsWith("startconfigtest2")) { // Aight, we have quite a few commands now.
					final Player p = player;
					final String[] cmds = args;
					try {
						World.getWorld().submit(new Event(300) {
							private int configId = Integer.valueOf(cmds[1]);// This one asks for the ID
							private int configValue = 0;

							@Override
							public void execute() {
								p.getActionSender().sendConfig(configId, configValue++);
								p.getActionSender().sendMessage("Currently testing config value: " + configValue
										+ " with config id: " + configId);
								if (stopConfigTest) {
									this.stop();
									stopConfigTest = false;
								}
							}

						});
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::configtest");
					}
				} else if (command.startsWith("startconfigtest")) {// Use this one first.
					final Player p = player;
					try {
						World.getWorld().submit(new Event(300) {
							private int configId = 0;

							@Override
							public void execute() {
								p.getActionSender().sendConfig(configId++, 1);
								p.getActionSender().sendMessage("Currently sending config id: " + configId);
								if (stopConfigTest) {
									this.stop();
									stopConfigTest = false;
								}
							}

						});
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::configtest");
					}
				} else if (command.startsWith("stopconfigtest")) {// Use this to stop it
					try {
						stopConfigTest = true;
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Syntax is ::configtest");
					}

				} else if (command.equals("openbank")) {
					Bank.open(player);
					/*
					 * else if (commandString.startsWith("skele")) {
					 * try {
					 * System.out.println("Creating skeleton spawns,");
					 * final Random r = new Random();
					 * int[] ids = { 90, 3291, 3581, 5332, 5333, 5334, 6091, 6092, 6093, };
					 * p.println("<npcSpawn> <!--Skeleton.-->");
					 * p.println("  <npcId>"+ids[r.nextInt(ids.length)]
					 * +"</npcId> <!--The npc id to spawn.-->");
					 * p.println("  <walkingType>2</walkingType> <!--The walking type-->");
					 * p.println("  <spawnLocation> <!--The location to spawn the NPC.-->");
					 * p.println("	<x>"+player.getLocation().getX()+"</x>");
					 * p.println("	<y>"+player.getLocation().getY()+"</y>");
					 * p.println("	<z>"+player.getLocation().getZ()+"</z>");
					 * p.println("  </spawnLocation>");
					 * p.println("  <minLocation> <!--The lowest location you can walk into..-->");
					 * p.println("	<x>"+(player.getLocation().getX()-5)+"</x>");
					 * p.println("	<y>"+(player.getLocation().getY()-5)+"</y>");
					 * p.println("	<z>"+(player.getLocation().getZ())+"</z>");
					 * p.println("  </minLocation>");
					 * p.println("  <maxLocation> <!--The highest location you can walk into..-->");
					 * p.println("	<x>"+(player.getLocation().getX()+5)+"</x>");
					 * p.println("	<y>"+(player.getLocation().getY()+5)+"</y>");
					 * p.println("	<z>"+(player.getLocation().getZ())+"</z>");
					 * p.println("  </maxLocation>");
					 * p.println("</npcSpawn>");
					 * p.flush();
					 * //p.close();
					 * } catch(Exception e) {
					 * player.getActionSender().sendMessage("Syntax is ::yell <message>");
					 * }
					 * }
					 */
				}

				/*
				 * ============================
				 * PK PRESETS — ADMIN ONLY
				 * 459 revision (no claws/ags)
				 * ============================
				 */

				// ::brid 1–5 — Hybrid (Ancients: Barrage + TB)
				else if (command.equals("brid")) {
					loadHybrid(player, parseTier(args));
				}

				// ::tribrid 1–3 — Tribrid (Ancients)
				else if (command.equals("tribrid")) {
					loadTribrid(player, parseTier(args));
				}

				// ::modernbrid 1–2 — Hybrid (Modern TB only)
				else if (command.equals("modernbrid")) {
					loadModernHybrid(player, parseTier(args));
				}

				// ::melee 1–4 — Melee (Lunar Vengeance)
				else if (command.equals("melee")) {
					loadMelee(player, parseTier(args));
				}

				// ::range 1–3 — Range (Lunar Vengeance)
				else if (command.equals("range")) {
					loadRange(player, parseTier(args));
				}

				// ::pure 1–3 — Pure presets (mith gloves)
				else if (command.equals("pure")) {
					loadPure(player, parseTier(args));
				}

				// ::openbank — Opens bank
				else if (command.equals("openbank")) {
					Bank.open(player);
				}

				// ::spec — Restores special attack to 100%
				else if (command.equals("spec")) {
					try {
						player.getSpecials().setAmount(1000);
						player.getActionSender().sendMessage("Special attack restored!");
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Error restoring special attack.");
					}
				}

				// ::heal — Restores HP, prayer, special attack, and all stats
				else if (command.equals("heal")) {
					try {
						// Restore HP to max
						player.getSkills().setLevel(Skills.HITPOINTS,
								player.getSkills().getLevelForExperience(Skills.HITPOINTS));
						// Restore prayer
						player.getPrayer().reset();
						// Restore special attack to 100%
						player.getSpecials().setAmount(1000);
						// Restore all stats to their base levels
						for (int skill = 0; skill < Skills.SKILL_COUNT; skill++) {
							player.getSkills().setLevel(skill, player.getSkills().getLevelForExperience(skill));
						}
						// Update client display
						player.getActionSender().sendSkills();
						player.getActionSender().sendMessage("You have been fully healed!");
					} catch (Exception e) {
						e.printStackTrace();
						player.getActionSender().sendMessage("Error healing player.");
					}
				}

				// ::mb — Mage bank teleport
				else if (command.equals("mb")) {
					player.setTeleportTarget(Location.create(2539, 4716, 0));
				}

				// ::pkersbank — fills bank with PK gear (best-effort)
				else if (command.equals("pkersbank")) {
					fillPkersBank(player);
				}

				// Barrows quick commands
				else if (command.equals("ahrim")) {
					equipAhrim(player);
				} else if (command.equals("karil")) {
					equipKaril(player);
				} else if (command.equals("verac")) {
					equipVerac(player);
				} else if (command.equals("dharokset")) {
					equipDharokSet(player);
				}

				// ::tank 1–2 — Defence-based tank (Lunar)
				else if (command.equals("tank")) {
					loadTank(player, parseTier(args));
				}

				// ::beast — Range Tank for bossing (Lunar Vengeance)
				else if (command.equals("beast")) {
					loadBeast(player, parseTier(args));
				}

				// ::maxstr — Max strength venge (Lunar)
				else if (command.equals("maxstr")) {
					loadMaxStr(player);
				}

				// ::dharok — Dharok venge (Lunar)
				else if (command.equals("dharok")) {
					loadDharok(player);
				}

			}

			/*
			 * if(command.equals("tele")) {
			 * if(args.length == 3 || args.length == 4) {
			 * int x = Integer.parseInt(args[1]);
			 * int y = Integer.parseInt(args[2]);
			 * int z = player.getLocation().getZ();
			 * if(args.length == 4) {
			 * z = Integer.parseInt(args[3]);
			 * }
			 * player.setTeleportTarget(Location.create(x, y, z));
			 * } else {
			 * player.getActionSender().sendMessage("Syntax is ::tele [x] [y] [z].");
			 * }
			 * } else if(command.equals("pos")) {
			 * try {
			 * player.getActionSender().sendMessage(player.getLocation().toString());
			 * } catch(Exception e) {
			 * 
			 * }
			 * } else if(command.equals("distance")) {
			 * try {
			 * player.getActionSender().sendFollowingDistance(Integer.valueOf(args[1]));
			 * } catch(Exception e) {
			 * 
			 * }
			 * } else if(command.equals("item")) {
			 * if(args.length == 2 || args.length == 3) {
			 * int id = Integer.parseInt(args[1]);
			 * int count = 1;
			 * if(args.length == 3) {
			 * count = Integer.parseInt(args[2]);
			 * }
			 * if (Inventory.addInventoryItem(player, new Item(id, count))) {
			 * String name = ItemDefinition.forId(id).getName().toLowerCase();
			 * player.getActionSender().sendMessage(
			 * "You successfully spawn " + count + " "
			 * + name
			 * + (name.endsWith("s") ? (count > 1 ? "s." : ".") : "."));
			 * }
			 * } else {
			 * player.getActionSender().sendMessage("Syntax is ::item [id] [count].");
			 * }
			 * } else if(command.equals("npc")) {
			 * NPC npc = NPC.create(NPCDefinition.forId(Integer.parseInt(args[1])),
			 * player.getLocation(), null, null);
			 * World.getWorld().getNPCs().add(npc);
			 * } else if(command.equals("anim")) {
			 * if(args.length == 2 || args.length == 3) {
			 * int id = Integer.parseInt(args[1]);
			 * int delay = 0;
			 * if(args.length == 3) {
			 * delay = Integer.parseInt(args[2]);
			 * }
			 * player.playAnimation(Animation.create(id, delay));
			 * }
			 * } else if(command.equals("gfx")) {
			 * if(args.length == 2 || args.length == 3) {
			 * int id = Integer.parseInt(args[1]);
			 * int delay = 0;
			 * if(args.length == 3) {
			 * delay = Integer.parseInt(args[2]);
			 * }
			 * player.playGraphics(Graphic.create(id, delay));
			 * }
			 * } else if(command.equals("openbank")) {
			 * Bank.open(player);
			 * } else if(command.equals("max")) {
			 * try {
			 * for(int i = 0; i < Skills.SKILL_COUNT; i++) {
			 * player.getSkills().setLevel(i, 99);
			 * player.getSkills().setExperience(i, 13034431);
			 * }
			 * } catch(Exception e) {
			 * System.out.println(e);
			 * }
			 * 
			 * } else if(command.startsWith("empty")) {
			 * player.getInventory().clear();
			 * player.getActionSender().sendMessage("Your inventory has been emptied.");
			 * } else if(command.startsWith("lvl")) {
			 * try {
			 * player.getSkills().setLevel(Integer.parseInt(args[1]),
			 * Integer.parseInt(args[2]));
			 * player.getSkills().setExperience(Integer.parseInt(args[1]),
			 * player.getSkills().getXPForLevel(Integer.parseInt(args[2])) + 1);
			 * player.getActionSender().sendMessage(Skills.SKILL_NAME[Integer.parseInt(args[
			 * 1])] + " level is now " + Integer.parseInt(args[2]) + ".");
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::lvl [skill] [lvl].");
			 * }
			 * } else if(command.startsWith("skill")) {
			 * try {
			 * player.getSkills().setLevel(Integer.parseInt(args[1]),
			 * Integer.parseInt(args[2]));
			 * player.getActionSender().sendMessage(Skills.SKILL_NAME[Integer.parseInt(args[
			 * 1])] + " level is temporarily boosted to " + Integer.parseInt(args[2]) +
			 * ".");
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::skill [skill] [lvl].");
			 * }
			 * } else if (command.startsWith("switch")) {
			 * try {
			 * int spellbook = Integer.valueOf(args[1]);
			 * switch(spellbook) {
			 * case 0:
			 * player.getMagic().setSpellBook(MagicType.MODERN);//Normal mage
			 * break;
			 * case 1:
			 * player.getMagic().setSpellBook(MagicType.ANCIENT); //Ancients
			 * break;
			 * case 2:
			 * player.getMagic().setSpellBook(MagicType.LUNAR); //Lunar
			 * break;
			 * }
			 * } catch(NumberFormatException e) {
			 * e.printStackTrace();
			 * }
			 * } else if(command.startsWith("object")) {
			 * try {
			 * if(args.length == 2) {
			 * player.getActionSender().sendCreateObject(Integer.parseInt(args[1]), 10, 0,
			 * player.getLocation());
			 * } else if(args.length == 3) {
			 * player.getActionSender().sendCreateObject(Integer.parseInt(args[1]),
			 * Integer.parseInt(args[2]), 0, player.getLocation());
			 * } else if(args.length == 4) {
			 * player.getActionSender().sendCreateObject(Integer.parseInt(args[1]),
			 * Integer.parseInt(args[2]), Integer.parseInt(args[3]), player.getLocation());
			 * }
			 * 
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::object [id].");
			 * }
			 * } else if(command.startsWith("enablepvp")) {
			 * try {
			 * player.updatePlayerAttackOptions(true);
			 * player.getActionSender().sendMessage("PvP combat enabled.");
			 * } catch(Exception e) {
			 * 
			 * }
			 * } else if(command.startsWith("interface")) {
			 * try {
			 * player.getActionSender().sendInterface(Integer.parseInt(args[1]));
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::interface [id].");
			 * }
			 * } else if (command.startsWith("config")) {
			 * try {
			 * player.getActionSender().sendConfig(Integer.valueOf(args[1]),
			 * Integer.valueOf(args[2]));
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::config [id] [value].");
			 * }
			 * } else if (command.startsWith("startconfigtest2")) { //Aight, we have quite a
			 * few commands now.
			 * final Player p = player;
			 * final String[] cmds = args;
			 * try {
			 * World.getWorld().submit(new Event(300) {
			 * private int configId = Integer.valueOf(cmds[1]);//This one asks for the ID
			 * private int configValue = 0;
			 * 
			 * @Override
			 * public void execute() {
			 * p.getActionSender().sendConfig(configId, configValue++);
			 * p.getActionSender().sendMessage("Currently testing config value: "+
			 * configValue +" with config id: "+ configId);
			 * if(stopConfigTest) {
			 * this.stop();
			 * stopConfigTest = false;
			 * }
			 * }
			 * 
			 * });
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::configtest");
			 * }
			 * } else if (command.startsWith("startconfigtest")) {//Use this one first.
			 * final Player p = player;
			 * try {
			 * World.getWorld().submit(new Event(300) {
			 * private int configId = 0;
			 * 
			 * @Override
			 * public void execute() {
			 * p.getActionSender().sendConfig(configId++, 1);
			 * p.getActionSender().sendMessage("Currently sending config id: "+ configId);
			 * if(stopConfigTest) {
			 * this.stop();
			 * stopConfigTest = false;
			 * }
			 * }
			 * 
			 * });
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::configtest");
			 * }
			 * } else if (command.startsWith("stopconfigtest")) {//Use this to stop it
			 * try {
			 * stopConfigTest = true;
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::configtest");
			 * }
			 * } else if (command.startsWith("getmask")) {
			 * try {
			 * System.out.println("Getting mask..");
			 * int mask =
			 * World.getWorld().getRegionManager().getClippingMask(player.getLocation().getX
			 * (), player.getLocation().getY());
			 * System.out.println("Clipping mask: "+ mask);
			 * masks.add(mask);
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::configtest");
			 * }
			 * } else if (command.startsWith("printmasks")) {
			 * try {
			 * PrintWriter p = new PrintWriter(new File("d:/walkablemasks.txt"));
			 * for(int mask : masks) {
			 * p.println(mask);
			 * p.flush();
			 * }
			 * p.close();
			 * System.out.println("Getting mask..");
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::configtest");
			 * }
			 * } else if (command.startsWith("forceequip")) {
			 * try {
			 * player.getEquipment().set(3, new Item(5614));
			 * player.setDifferentUpdateAnimation(true);
			 * player.setTemporaryUpdatingAnimation(0, 2261); //Stand.
			 * player.setTemporaryUpdatingAnimation(1, 2261); //Stand - turn?.
			 * player.setTemporaryUpdatingAnimation(2, 2263); //Walk.
			 * player.setTemporaryUpdatingAnimation(3, 2263); //Turn
			 * player.setTemporaryUpdatingAnimation(4, 2263); //Turn
			 * player.setTemporaryUpdatingAnimation(5, 2263); //Turn
			 * player.setTemporaryUpdatingAnimation(6, 2263); //Run
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::forceequip slot, id.");
			 * } // SPECIAL RESTORE
			 */
			/*
			 * } else if(command.startsWith("lostcity")) {
			 * try {
			 * player.editQuestInfo(LostCity.QUEST_INFO_INDEX,
			 * LostCity.MAIN_QUEST_STAGE_INDEX, Integer.valueOf(args[1]));
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::forceequip slot, id.");
			 * }
			 * } else if(commandString.startsWith("yell") && commandString.length() > 5) {
			 * try {
			 * String rankName[] = { "", "[MOD] ", "[ADMIN] " };
			 * String text = commandString.substring(5);
			 * String rankN = rankName[player.getRights().toInteger()];
			 * for(Player p : World.getWorld().getPlayers()) {
			 * p.getActionSender().sendMessage(rankN + "" + player.getName() + ": " + text);
			 * }
			 * } catch(Exception e) {
			 * player.getActionSender().sendMessage("Syntax is ::yell <message>");
			 * }
			 * } else if(command.startsWith("mb")) {
			 * try {
			 * player.setTeleportTarget(Location.create(3095, 3960, 0));
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::forceequip slot, id.");
			 * }
			 * } else if(command.startsWith("m")) {
			 * try {
			 * for(int i = 0; i < Integer.valueOf(args[1]); i++) {
			 * player.getBarrows().increaseKillCount();
			 * }
			 * } catch(Exception e) {
			 * e.printStackTrace();
			 * player.getActionSender().sendMessage("Syntax is ::forceequip slot, id.");
			 * }
			 * }
			 */

		} catch (Exception ex) {
			ex.printStackTrace();
			player.getActionSender().sendMessage("Error while processing command.");
		}
	}

	private static final List<Location[]> list = new ArrayList<Location[]>();

	private static void createConsList() {
		// 1983,5119,0 //Max
		// 1856,5056,0 //Min
		for (int z = 0; z < 4; z++) {
			for (int x = 1856; x <= 1983; x += 8) {
				for (int y = 5056; y <= 5119; y += 8) {
					Location min = Location.create(x, y, z);
					Location max = Location.create(x + 7, y + 7, z);
					list.add(new Location[] { min, max });
				}
			}
		}

	}

	/*
	 * ============================
	 * PRIMARY ADMIN + PK PRESETS
	 * ============================
	 */

	private static boolean isPrimaryAdmin(Player p) {
		if (p == null || p.getName() == null)
			return false;
		String n = p.getName().toLowerCase();
		return n.equals("admin") || n.equals("gielinor");
	}

	private static int parseTier(String[] args) {
		if (args != null && args.length > 1) {
			try {
				return Integer.parseInt(args[1]);
			} catch (Exception e) {
			}
		}
		return 1;
	}

	/*
	 * --------------------------------
	 * LOW-LEVEL HELPERS
	 * --------------------------------
	 */

	// Equipment slot indexes (common Hyperion layout)
	private static final int SLOT_HELM = 0;
	private static final int SLOT_CAPE = 1;
	private static final int SLOT_AMULET = 2;
	private static final int SLOT_WEAPON = 3;
	private static final int SLOT_BODY = 4;
	private static final int SLOT_SHIELD = 5;
	private static final int SLOT_LEGS = 7;
	private static final int SLOT_HANDS = 9;
	private static final int SLOT_FEET = 10;
	private static final int SLOT_RING = 12;
	private static final int SLOT_AMMO = 13;

	// Item IDs (OSRS-era IDs; matches most 459-based caches)
	private static final int FIRE_CAPE = 6570;
	private static final int AVAS_ACCUMULATOR = 10499;

	private static final int AMULET_FURY = 6585;
	private static final int BARROWS_GLOVES = 7462;
	private static final int MITH_GLOVES = 7458;

	private static final int BERSERKER_RING = 6737;
	private static final int SEERS_RING = 6731;
	private static final int ARCHERS_RING = 6733;

	private static final int RUNE_DEFENDER = 8850;
	private static final int UNHOLY_BOOK = 3842;

	private static final int FIGHTER_TORSO = 10551;
	private static final int HELM_NEITIZNOT = 10828;
	private static final int CLIMBING_BOOTS = 3105;

	private static final int ABYSSAL_WHIP = 4151;
	private static final int DRAGON_SCIM = 4587;
	private static final int DDS = 5698;
	private static final int GRANITE_MAUL = 4153;

	private static final int RUNE_CROSSBOW = 9185;
	private static final int RUNE_BOLTS = 9144;
	private static final int EMERALD_BOLTS_E = 9241; // if present
	private static final int RUBY_BOLTS_E = 9242; // if present
	private static final int DRAGON_BOLTS_E = 9244; // dragon bolts (e)

	private static final int DARK_BOW = 11235;
	private static final int RUNE_ARROWS = 892;
	private static final int DRAGON_ARROWS = 11212;
	private static final int KNIFE = 863; // bronze knife (for filler/stackable)

	private static final int RANGER_BOOTS = 2577;
	private static final int DRAGONFIRE_SHIELD = 11284;

	private static final int ANCIENT_STAFF = 4675;

	// Mystic (blue) set
	private static final int MYSTIC_HAT = 4089;
	private static final int MYSTIC_TOP = 4091;
	private static final int MYSTIC_BOTTOM = 4093;
	private static final int MYSTIC_BOOTS = 4097;

	// Food / pots
	private static final int SHARK = 385;
	private static final int SUPER_RESTORE_4 = 3025;
	private static final int SARADOMIN_BREW_4 = 6685;
	private static final int RANGE_POTION_4 = 2445;
	private static final int MAGIC_POTION_4 = 3041;

	private static void clearInv(Player p) {
		p.getInventory().clear();
	}

	private static void clearEquipment(Player p) {
		try {
			// most Hyperion containers accept null to clear
			for (int s = 0; s <= 13; s++) {
				p.getEquipment().set(s, null);
			}
		} catch (Exception ignored) {
		}
	}

	private static void addInv(Player p, int id, int amt) {
		Inventory.addInventoryItem(p, new Item(id, amt));
	}

	private static void equip(Player p, int slot, int id) {
		equip(p, slot, id, 1);
	}

	private static void equip(Player p, int slot, int id, int amt) {
		try {
			p.getEquipment().set(slot, new Item(id, amt));
		} catch (Exception e) {
			// fallback: if direct equip fails, at least give the item
			addInv(p, id, amt);
		}
	}

	/** Adds food but caps total food items added by presets to 10. */
	private static void addFoodCapped(Player p, int foodId) {
		int cap = 10;
		int current = 0;
		try {
			for (int i = 0; i < 28; i++) {
				Item it = p.getInventory().get(i);
				if (it != null && it.getId() == foodId)
					current += it.getCount();
			}
		} catch (Exception ignored) {
		}
		int toAdd = cap - current;
		if (toAdd > 0)
			addInv(p, foodId, toAdd);
	}

	private static void addCoreSupplies(Player p, boolean includeBrew) {
		// Keep inv light so presets don't overflow
		if (includeBrew)
			addInv(p, SARADOMIN_BREW_4, 2);
		addInv(p, SUPER_RESTORE_4, includeBrew ? 2 : 3);

		addFoodCapped(p, SHARK);
	}

	private static void addVengeRunes(Player p) {
		// Vengeance: 2 astral, 4 death, 10 earth
		addInv(p, 9075, 500); // astral
		addInv(p, 560, 500); // death
		addInv(p, 557, 2000); // earth
	}

	private static void addTBRunes(Player p) {
		// Tele Block: 1 law, 1 chaos, 1 death
		addInv(p, 563, 500); // law
		addInv(p, 562, 500); // chaos
		addInv(p, 560, 500); // death
	}

	private static void addBarrageRunes(Player p) {
		// Ice Barrage: death, blood, water
		addInv(p, 560, 2000); // death
		addInv(p, 565, 2000); // blood
		addInv(p, 555, 4000); // water
	}

	/*
	 * --------------------------------
	 * PRESETS (EQUIPPED + SUPPLIES)
	 * --------------------------------
	 * Commands:
	 * ::brid 1-5 (Ancients tribrid-lite, no venge)
	 * ::tribrid 1-3 (Ancients full tribrid, no TB)
	 * ::modernbrid 1-2 (Modern for TB; no ancients)
	 * ::melee 1-4 (Lunar + venge)
	 * ::range 1-3 (Lunar + venge)
	 * ::pure 1-3 (pure presets, mith gloves)
	 * ::tank 1-3 (tank presets; venge)
	 * ::maxstr (Lunar max str venge)
	 * ::dharok (Lunar dharok venge)
	 * ::ahrim / ::karil / ::verac / ::dharokset (barrows quick equips)
	 * ::openbank (opens bank)
	 * ::mb (tele mage bank)
	 * ::pkersbank (attempt to fill bank with PK gear)
	 */

	private static void loadHybrid(Player p, int tier) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.ANCIENT);

		// --- Equip base hybrid ---
		equip(p, SLOT_HELM, MYSTIC_HAT);
		equip(p, SLOT_CAPE, FIRE_CAPE);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, MYSTIC_TOP);
		equip(p, SLOT_LEGS, MYSTIC_BOTTOM);
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, MYSTIC_BOOTS);
		equip(p, SLOT_RING, SEERS_RING);
		equip(p, SLOT_WEAPON, ANCIENT_STAFF);
		equip(p, SLOT_SHIELD, UNHOLY_BOOK);

		// --- Switches / weapons ---
		addInv(p, ABYSSAL_WHIP, 1);
		addInv(p, DDS, 1);
		addInv(p, RUNE_CROSSBOW, 1);
		addInv(p, RUNE_DEFENDER, 1); // melee switch shield (inv; you can equip when switching)

		// bolts (use enchanted if present)
		addInv(p, RUNE_BOLTS, 200);
		if (tier >= 3)
			addInv(p, RUBY_BOLTS_E, 100);
		if (tier >= 4)
			addInv(p, EMERALD_BOLTS_E, 100);

		// runes
		addBarrageRunes(p);
		if (tier >= 2)
			addTBRunes(p); // optional TB supplies (won't work on ancients unless you switch spellbook)

		// pots
		addInv(p, MAGIC_POTION_4, 1);
		addInv(p, RANGE_POTION_4, 1);

		addCoreSupplies(p, false);
	}

	private static void loadTribrid(Player p, int tier) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.ANCIENT);

		// mage base
		equip(p, SLOT_HELM, MYSTIC_HAT);
		equip(p, SLOT_CAPE, FIRE_CAPE);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, MYSTIC_TOP);
		equip(p, SLOT_LEGS, MYSTIC_BOTTOM);
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, MYSTIC_BOOTS);
		equip(p, SLOT_RING, SEERS_RING);
		equip(p, SLOT_WEAPON, ANCIENT_STAFF);
		equip(p, SLOT_SHIELD, UNHOLY_BOOK);

		// range switch
		addInv(p, RUNE_CROSSBOW, 1);
		addInv(p, RUNE_BOLTS, 250);
		addInv(p, AVAS_ACCUMULATOR, 1);
		if (tier >= 2)
			addInv(p, RUBY_BOLTS_E, 100);

		// melee switch
		addInv(p, ABYSSAL_WHIP, 1);
		addInv(p, DDS, 1);
		addInv(p, RUNE_DEFENDER, 1);

		// spec option
		if (tier >= 3)
			addInv(p, GRANITE_MAUL, 1);

		// runes
		addBarrageRunes(p);

		addInv(p, MAGIC_POTION_4, 1);
		addInv(p, RANGE_POTION_4, 1);

		addCoreSupplies(p, true);
	}

	private static void loadModernHybrid(Player p, int tier) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.MODERN);

		// ranged base
		equip(p, SLOT_HELM, HELM_NEITIZNOT);
		equip(p, SLOT_CAPE, AVAS_ACCUMULATOR);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, FIGHTER_TORSO);
		equip(p, SLOT_LEGS, 4585); // dragon plateskirt (common id)
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, ARCHERS_RING);
		equip(p, SLOT_WEAPON, RUNE_CROSSBOW);
		equip(p, SLOT_AMMO, RUNE_BOLTS, 200);

		// melee switch
		addInv(p, ABYSSAL_WHIP, 1);
		addInv(p, DDS, 1);
		addInv(p, RUNE_DEFENDER, 1);

		// runes for TB (modern)
		addTBRunes(p);

		addInv(p, RANGE_POTION_4, 1);

		addCoreSupplies(p, true);
	}

	private static void loadMelee(Player p, int tier) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);

		// max-ish melee
		equip(p, SLOT_HELM, HELM_NEITIZNOT);
		equip(p, SLOT_CAPE, FIRE_CAPE);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, FIGHTER_TORSO);
		equip(p, SLOT_LEGS, 4087); // dragon chainlegs (alt: dlegs 4087 if you prefer)
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, BERSERKER_RING);
		equip(p, SLOT_WEAPON, (tier >= 2 ? ABYSSAL_WHIP : DRAGON_SCIM));
		equip(p, SLOT_SHIELD, RUNE_DEFENDER);

		// specs
		addInv(p, DDS, 1);
		if (tier >= 3)
			addInv(p, GRANITE_MAUL, 1);

		// optional range poke
		if (tier >= 4) {
			addInv(p, RUNE_CROSSBOW, 1);
			addInv(p, RUNE_BOLTS, 150);
		}

		addCoreSupplies(p, true);
	}

	private static void loadRange(Player p, int tier) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);

		// ranged base + melee switch
		equip(p, SLOT_HELM, HELM_NEITIZNOT);
		equip(p, SLOT_CAPE, AVAS_ACCUMULATOR);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, 1129); // leather body (safe default)
		equip(p, SLOT_LEGS, 2497); // black d'hide chaps
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, ARCHERS_RING);

		// weapon choice
		if (tier >= 2) {
			equip(p, SLOT_WEAPON, DARK_BOW);
			equip(p, SLOT_AMMO, RUNE_ARROWS, 200);
			addInv(p, RUNE_CROSSBOW, 1);
			addInv(p, RUNE_BOLTS, 200);
		} else {
			equip(p, SLOT_WEAPON, RUNE_CROSSBOW);
			equip(p, SLOT_AMMO, RUNE_BOLTS, 250);
		}

		// melee switch
		addInv(p, ABYSSAL_WHIP, 1);
		addInv(p, DDS, 1);
		addInv(p, RUNE_DEFENDER, 1);

		addInv(p, RANGE_POTION_4, 1);

		addCoreSupplies(p, true);
	}

	private static void loadPure(Player p, int tier) {
		clearInv(p);
		clearEquipment(p);

		// pures usually venge-less, but you asked for venge on melee/range, so keep
		// lunar
		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);

		// pure-ish (minimal defence gear)
		equip(p, SLOT_HELM, 1169); // coif
		equip(p, SLOT_CAPE, 2412); // saradomin cape (safe god cape)
		equip(p, SLOT_AMULET, 1725); // amulet of strength
		equip(p, SLOT_BODY, 6107); // ghostly robe top (light)
		equip(p, SLOT_LEGS, 6108); // ghostly robe bottom
		equip(p, SLOT_HANDS, MITH_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, (tier >= 2 ? SEERS_RING : BERSERKER_RING));
		equip(p, SLOT_WEAPON, (tier >= 2 ? RUNE_CROSSBOW : DRAGON_SCIM));
		if (tier >= 2)
			equip(p, SLOT_AMMO, RUNE_BOLTS, 200);

		// switches
		addInv(p, DDS, 1);
		addInv(p, KNIFE, 200); // stackable poke

		addCoreSupplies(p, false);
	}

	private static void loadBeast(Player p, int tier) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);

		// Range Tank for BOSSING.
		equip(p, SLOT_HELM, 4753); // verac helm
		equip(p, SLOT_CAPE, AVAS_ACCUMULATOR);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, 4736); // Karil Top
		equip(p, SLOT_LEGS, 4738); // Karil bottoms
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, RANGER_BOOTS);
		equip(p, SLOT_RING, ARCHERS_RING); // archer ring for range tank
		equip(p, SLOT_WEAPON, RUNE_CROSSBOW);
		equip(p, SLOT_AMMO, DRAGON_BOLTS_E, 2000);
		equip(p, SLOT_SHIELD, DRAGONFIRE_SHIELD);

		// Inventory switches and supplies
		addInv(p, DARK_BOW, 1);
		addInv(p, DRAGON_ARROWS, 200);
		addInv(p, RUNE_CROSSBOW, 1); // backup crossbow
		addInv(p, DRAGON_BOLTS_E, 1000); // extra bolts
		addInv(p, RANGE_POTION_4, 1);

		addCoreSupplies(p, true);
		p.getActionSender().sendMessage("Beast Range Tank loaded!");
	}

	private static void loadTank(Player p, int tier) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);

		// barrows tank base (veracs-ish)
		equip(p, SLOT_HELM, 4753); // verac helm
		equip(p, SLOT_CAPE, FIRE_CAPE);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, 4757); // verac brassard
		equip(p, SLOT_LEGS, 4759); // verac plateskirt
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, BERSERKER_RING);
		equip(p, SLOT_WEAPON, 4755); // verac flail
		equip(p, SLOT_SHIELD, RUNE_DEFENDER);

		// range support
		if (tier >= 2) {
			addInv(p, RUNE_CROSSBOW, 1);
			addInv(p, RUNE_BOLTS, 200);
			addInv(p, AVAS_ACCUMULATOR, 1);
		}
		if (tier >= 3)
			addInv(p, DARK_BOW, 1);

		addCoreSupplies(p, true);
	}

	private static void loadMaxStr(Player p) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);

		equip(p, SLOT_HELM, HELM_NEITIZNOT);
		equip(p, SLOT_CAPE, FIRE_CAPE);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, FIGHTER_TORSO);
		equip(p, SLOT_LEGS, 3140); // dragon chainlegs
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, BERSERKER_RING);
		equip(p, SLOT_WEAPON, ABYSSAL_WHIP);
		equip(p, SLOT_SHIELD, RUNE_DEFENDER);

		addInv(p, DDS, 1);
		addInv(p, GRANITE_MAUL, 1);

		addCoreSupplies(p, true);
	}

	private static void loadDharok(Player p) {
		clearInv(p);
		clearEquipment(p);

		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);

		// equip full dh
		equip(p, SLOT_HELM, 4716);
		equip(p, SLOT_CAPE, FIRE_CAPE);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, 4720);
		equip(p, SLOT_LEGS, 4722);
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, BERSERKER_RING);
		equip(p, SLOT_WEAPON, 4718);

		addCoreSupplies(p, true);
	}

	/*
	 * --------------------------------
	 * BARROWS QUICK SETS
	 * --------------------------------
	 */

	private static void equipAhrim(Player p) {
		clearInv(p);
		clearEquipment(p);
		p.getMagic().setSpellBook(MagicType.ANCIENT);
		equip(p, SLOT_HELM, 4708);
		equip(p, SLOT_CAPE, FIRE_CAPE);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, 4712);
		equip(p, SLOT_LEGS, 4714);
		equip(p, SLOT_WEAPON, 4710);
		equip(p, SLOT_SHIELD, UNHOLY_BOOK);
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, MYSTIC_BOOTS);
		equip(p, SLOT_RING, SEERS_RING);
		addBarrageRunes(p);
		addCoreSupplies(p, true);
	}

	private static void equipKaril(Player p) {
		clearInv(p);
		clearEquipment(p);
		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);
		equip(p, SLOT_HELM, 4732);
		equip(p, SLOT_CAPE, AVAS_ACCUMULATOR);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, 4736);
		equip(p, SLOT_LEGS, 4738);
		equip(p, SLOT_WEAPON, 4734);
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, ARCHERS_RING);
		addCoreSupplies(p, true);
	}

	private static void equipVerac(Player p) {
		clearInv(p);
		clearEquipment(p);
		p.getMagic().setSpellBook(MagicType.LUNAR);
		addVengeRunes(p);
		equip(p, SLOT_HELM, 4753);
		equip(p, SLOT_CAPE, FIRE_CAPE);
		equip(p, SLOT_AMULET, AMULET_FURY);
		equip(p, SLOT_BODY, 4757);
		equip(p, SLOT_LEGS, 4759);
		equip(p, SLOT_WEAPON, 4755);
		equip(p, SLOT_SHIELD, RUNE_DEFENDER);
		equip(p, SLOT_HANDS, BARROWS_GLOVES);
		equip(p, SLOT_FEET, CLIMBING_BOOTS);
		equip(p, SLOT_RING, BERSERKER_RING);
		addCoreSupplies(p, true);
	}

	private static void equipDharokSet(Player p) {
		loadDharok(p);
	}

	/*
	 * --------------------------------
	 * PKERS BANK
	 * --------------------------------
	 */

	private static void fillPkersBank(Player p) {
		// Big curated set. If bank write fails, we fall back to giving items in inv
		// with a prompt to deposit.
		int[][] items = new int[][] {
				// Core best-in-slot items
				{ FIRE_CAPE, 1000 }, { AVAS_ACCUMULATOR, 1000 }, { AMULET_FURY, 1000 },
				{ BARROWS_GLOVES, 1000 }, { MITH_GLOVES, 1000 }, { CLIMBING_BOOTS, 1000 },
				{ BERSERKER_RING, 1000 }, { SEERS_RING, 1000 }, { ARCHERS_RING, 1000 },
				{ RUNE_DEFENDER, 1000 }, { UNHOLY_BOOK, 1000 },

				// Weapons
				{ ABYSSAL_WHIP, 1000 }, { DRAGON_SCIM, 1000 }, { DDS, 1000 }, { GRANITE_MAUL, 1000 },
				{ RUNE_CROSSBOW, 1000 }, { DARK_BOW, 1000 }, { ANCIENT_STAFF, 1000 },

				// Ammo
				{ RUNE_BOLTS, 2000 }, { RUNE_ARROWS, 2000 }, { EMERALD_BOLTS_E, 500 }, { RUBY_BOLTS_E, 500 },

				// Mage gear
				{ MYSTIC_HAT, 1000 }, { MYSTIC_TOP, 1000 }, { MYSTIC_BOTTOM, 1000 }, { MYSTIC_BOOTS, 1000 },

				// Melee gear
				{ HELM_NEITIZNOT, 1000 }, { FIGHTER_TORSO, 1000 }, { 3140, 1000 }, { 4585, 1000 },

				// Barrows sets (full)
				{ 4716, 1000 }, { 4718, 1000 }, { 4720, 1000 }, { 4722, 1000 }, // dh
				{ 4708, 1000 }, { 4710, 1000 }, { 4712, 1000 }, { 4714, 1000 }, // ahrim
				{ 4732, 1000 }, { 4734, 1000 }, { 4736, 1000 }, { 4738, 1000 }, // karil
				{ 4753, 1000 }, { 4755, 1000 }, { 4757, 1000 }, { 4759, 1000 }, // verac

				// Supplies
				{ SHARK, 5000 }, { SARADOMIN_BREW_4, 2000 }, { SUPER_RESTORE_4, 2000 },
				{ RANGE_POTION_4, 2000 }, { MAGIC_POTION_4, 2000 },

				// Runes
				{ 9075, 20000 }, { 560, 20000 }, { 557, 50000 }, { 563, 10000 }, { 562, 10000 }, { 565, 20000 },
				{ 555, 50000 }
		};

		boolean wrote = tryWriteBank(p, items);
		if (!wrote) {
			clearInv(p);
			int giveCount = 0;
			for (int[] it : items) {
				// don't overflow inventory: give a few key ones to deposit
				if (giveCount >= 15)
					break;
				addInv(p, it[0], Math.min(it[1], 10));
				giveCount++;
			}
			p.getActionSender().sendMessage(
					"Could not write directly to bank on this source. I put starter PK items in your inventory—deposit them, then re-run ::pkersbank (or ask me to wire bank access).");
		} else {
			p.getActionSender().sendMessage("PKer's bank loaded.");
		}
	}

	@SuppressWarnings("unchecked")
	private static boolean tryWriteBank(Player p, int[][] items) {
		try {
			// Try: p.getBank().add(new Item(id, amt)) / addItem / insert
			Object bank = null;
			try {
				bank = p.getClass().getMethod("getBank").invoke(p);
			} catch (Exception ignored) {
			}
			if (bank == null) {
				try {
					bank = p.getClass().getMethod("getBankContainer").invoke(p);
				} catch (Exception ignored) {
				}
			}
			if (bank == null)
				return false;

			// optional clear
			try {
				bank.getClass().getMethod("clear").invoke(bank);
			} catch (Exception ignored) {
			}

			for (int[] it : items) {
				Item item = new Item(it[0], it[1]);
				boolean added = false;

				for (String m : new String[] { "add", "addItem", "addBankItem", "insert" }) {
					try {
						bank.getClass().getMethod(m, Item.class).invoke(bank, item);
						added = true;
						break;
					} catch (Exception ignored) {
					}
				}

				if (!added) {
					// Try container-style set(slot,item) by searching for set(int, Item) and
					// appending sequentially
					// If we can't, give up.
					return false;
				}
			}

			// refresh
			try {
				bank.getClass().getMethod("refresh").invoke(bank);
			} catch (Exception ignored) {
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	static {
		createConsList();
	}

}
