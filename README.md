GIELINOR - RSPS STACK ANALYSIS & COMMAND REFERENCE

Generated: Analysis of RSPS Stack and Complete Command List from CommandPacketHandler.java

Terminal Commands, to build the client and run it
[CLEINT]
cd "Gielinor Client"
java -cp bin client  

and also for the server..

[SERVER]
cd "Gielinor"
ant clean
ant build
ant run

RSPS STACK ANALYSIS


BASE FRAMEWORK:
--------------
- Server: Hyperion RSPS Framework (Protocol 459)
- Client: Modified RuneScape Client (Gielinor Client)
- Language: Java
- Networking: Apache MINA 2.0.0-M6
- Build System: Apache Ant
- Scripting: Jython (JavaScript support)

SERVER ARCHITECTURE:
--------------------
- Protocol Version: 459
- Port: 43594
- Experience Rate: 7x
- Skills: 23 (including Construction)
- Maximum Experience: 200,000,000

IMPLEMENTED FEATURES:
---------------------

Skills (23 Total):
- Combat: Attack, Strength, Defence, Hitpoints, Ranged, Prayer, Magic
- Gathering: Mining, Fishing, Woodcutting, Farming, Hunter
- Production: Cooking, Smithing, Crafting, Fletching, Herblore, Runecrafting
- Support: Agility, Thieving, Slayer, Construction

Combat System:
- Melee, Ranged, Magic combat
- Special attacks
- Prayer system
- Vengeance (Lunar)
- Combat styles (Accurate, Aggressive, Defensive, Controlled)
- Wilderness PvP with level restrictions
- Duel Arena
- Multi-combat areas

Magic System:
- Modern Spellbook (Teleblock, Entangle, God spells)
- Ancient Magicks (Ice Barrage, Blood, Shadow, Smoke)
- Lunar Spellbook (Vengeance, Vengeance Other)

Minigames:
- Barrows
- Pest Control
- Fight Caves (TzTok-Jad)
- Warriors' Guild

Quests:
- Lost City
- Desert Treasure
- Monkey Madness
- Lunar Diplomacy
- Legends Quest
- Between a Rock
- Black Knights' Fortress
- Tutorial Island

Additional Content:
- Construction (player-owned houses)
- Farming (patches, compost bins)
- Slayer (task system)
- Shops
- Banking
- NPC drops
- Random events
- Skillcapes
- Emotes
- Jewellery teleports
- Magic carpet travel
- Ship travel
- Obelisks
- Teleport tablets
- Doors and ladders
- Levers
- Dwarf Cannon
- Poison system
- Projectile system
- Following system

CLIENT FEATURES:
---------------
- Custom client (Gielinor Client)
- Map viewer
- Action button handlers
- Interface system
- Cache system

TECHNICAL STACK:
---------------
Libraries:
- Apache MINA Core 2.0.0-M6
- XStream 1.4.14
- Jython
- Commons Compress 1.0
- SLF4J

Data Storage: XML-based (dialogs, NPCs, items, shops, spawns)
Scripting: JavaScript support via Jython
Pathfinding: A* pathfinding
Event System: Custom event/task system

STRENGTHS:
---------
1. Comprehensive feature set: 23 skills, multiple minigames, quests
2. PK-focused: Extensive loadout commands, PvP mechanics
3. Solid architecture: Hyperion base with clean structure
4. Content-rich: Major minigames and quests implemented
5. Magic system: All three spellbooks implemented

AREAS FOR IMPROVEMENT:
---------------------
1. Code quality: Some commented-out code in CommandPacketHandler
2. Documentation: Limited inline documentation
3. Error handling: Some try-catch blocks could be more specific
4. Modernization: Older libraries (MINA 2.0.0-M6, XStream 1.4.14)
5. Testing: No visible unit tests

OVERALL ASSESSMENT:
-------------------
Solid RSPS built on Hyperion with comprehensive feature set. Strong PK focus 
with extensive loadout commands and PvP mechanics. Content includes major 
minigames and quests. Suitable for a private server with room for 
modernization and cleanup.

The stack is functional and feature-rich, with opportunities to modernize 
dependencies and improve code organization.

================================================================================
COMPLETE COMMAND LIST FROM CommandPacketHandler.java
================================================================================

GENERAL PLAYER COMMANDS (Available to all players):
----------------------------------------------------

::players
- Displays list of all online players
- Syntax: ::players

::outfit / ::char
- Opens character customization interface (269)
- Syntax: ::outfit OR ::char

::save
- Saves your character data
- Syntax: ::save

PK PRESET COMMANDS (Available to all players):
----------------------------------------------

::brid [tier]
- Loads hybrid preset (Ancients: Barrage + TB)
- Tiers: 1-5
- Syntax: ::brid [1-5]
- Example: ::brid 1, ::brid 2, ::brid 3, etc.

::tribrid [tier]
- Loads tribrid preset (Ancients)
- Tiers: 1-3
- Syntax: ::tribrid [1-3]
- Example: ::tribrid 1, ::tribrid 2, ::tribrid 3

::modernbrid [tier]
- Loads hybrid preset (Modern TB only)
- Tiers: 1-2
- Syntax: ::modernbrid [1-2]
- Example: ::modernbrid 1, ::modernbrid 2

::melee [tier]
- Loads melee preset (Lunar Vengeance)
- Tiers: 1-4
- Syntax: ::melee [1-4]
- Example: ::melee 1, ::melee 2, ::melee 3, ::melee 4

::range [tier]
- Loads range preset (Lunar Vengeance)
- Tiers: 1-3
- Syntax: ::range [1-3]
- Example: ::range 1, ::range 2, ::range 3

::pure [tier]
- Loads pure preset (mith gloves)
- Tiers: 1-3
- Syntax: ::pure [1-3]
- Example: ::pure 1, ::pure 2, ::pure 3

::tank [tier]
- Loads tank preset (Lunar)
- Tiers: 1-2
- Syntax: ::tank [1-2]
- Example: ::tank 1, ::tank 2

::maxstr
- Loads max strength venge preset (Lunar)
- Syntax: ::maxstr

::dharok
- Loads Dharok venge preset (Lunar)
- Syntax: ::dharok

BARROWS QUICK EQUIP COMMANDS (Available to all players):
--------------------------------------------------------

::ahrim
- Equips full Ahrim's set with Ancients spellbook
- Syntax: ::ahrim

::karil
- Equips full Karil's set with Lunar spellbook
- Syntax: ::karil

::verac
- Equips full Verac's set with Lunar spellbook
- Syntax: ::verac

::dharokset
- Equips full Dharok's set with Lunar spellbook
- Syntax: ::dharokset

UTILITY COMMANDS (Available to all players):
---------------------------------------------

::openbank
- Opens bank interface
- Syntax: ::openbank

::mb
- Teleports to Mage Bank
- Syntax: ::mb

::pkersbank
- Attempts to fill bank with PK gear (best-effort)
- Syntax: ::pkersbank

ADMINISTRATOR COMMANDS (Requires ADMINISTRATOR rights):
-------------------------------------------------------

ITEM & INVENTORY:
-----------------

::item [id] [count]
- Spawns an item
- Syntax: ::item [id] [count]
- Example: ::item 4151 1 (spawns whip)
- Example: ::item 385 10 (spawns 10 sharks)

::empty
- Empties your inventory
- Syntax: ::empty

SKILLS & LEVELS:
----------------

::max
- Sets all skills to level 99 with max experience
- Syntax: ::max

::lvl [skill] [level]
- Sets a specific skill to a level
- Syntax: ::lvl [skill] [level]
- Example: ::lvl 0 99 (sets Attack to 99)
- Skill IDs: 0=Attack, 1=Defence, 2=Strength, 3=Hitpoints, 4=Ranged, 
  5=Prayer, 6=Magic, 7=Cooking, 8=Woodcutting, 9=Fletching, 10=Fishing,
  11=Firemaking, 12=Crafting, 13=Smithing, 14=Mining, 15=Herblore,
  16=Agility, 17=Thieving, 18=Slayer, 19=Farming, 20=Runecrafting,
  21=Hunter, 22=Construction

TELEPORTATION:
--------------

::tele [x] [y] [z]
- Teleports to coordinates
- Syntax: ::tele [x] [y] [z]
- Example: ::tele 3214 3424 0
- Note: [z] is optional, defaults to current floor

::home
- Teleports to default spawn location
- Syntax: ::home

::barrows
- Teleports to Barrows
- Syntax: ::barrows

::varrock
- Teleports to Varrock
- Syntax: ::varrock

::fally
- Teleports to Falador
- Syntax: ::fally

::kbd
- Teleports to King Black Dragon
- Syntax: ::kbd

::mb
- Teleports to Mage Bank
- Syntax: ::mb

MAGIC & SPELLBOOKS:
-------------------

::switch [spellbook]
- Switches spellbook
- Syntax: ::switch [0-2]
- 0 = Modern spellbook
- 1 = Ancient spellbook
- 2 = Lunar spellbook
- Example: ::switch 1 (switches to Ancients)

QUEST & PROGRESS:
-----------------

::lostcity
- Sets Lost City quest stage to 4 (completed)
- Syntax: ::lostcity

WORLD & NPC MANAGEMENT:
-----------------------

::npc [id]
- Spawns an NPC at your location
- Syntax: ::npc [id]
- Example: ::npc 1 (spawns Man)

::ban [playerName]
- Bans a player (must be online)
- Syntax: ::ban [playerName]
- Example: ::ban "Player Name"

::giverights [rights] [playerName]
- Gives rights to a player (requires "zed" or primary admin)
- Syntax: ::giverights [rights] [playerName]
- Example: ::giverights 2 "Player Name"
- Rights: 0=Player, 1=Moderator, 2=Administrator

::shutdown
- Shuts down the server (saves all players first)
- Syntax: ::shutdown

DEVELOPER & TESTING:
--------------------

::pos
- Shows your current position
- Syntax: ::pos

::visit [x] [y]
- Auto-visits coordinates (for testing)
- Syntax: ::visit [x] [y]
- Example: ::visit 3200 3200

::path [x] [y]
- Tests pathfinding to coordinates
- Syntax: ::path [x] [y]
- Example: ::path 3214 3424

::object [id] [type] [face]
- Creates a temporary object at your location
- Syntax: ::object [id] [type] [face]
- Example: ::object 1 10 0
- Note: [type] and [face] are optional

::anim [id] [delay]
- Plays an animation
- Syntax: ::anim [id] [delay]
- Example: ::anim 828 0
- Note: [delay] is optional

::gfx [id] [delay]
- Plays a graphic
- Syntax: ::gfx [id] [delay]
- Example: ::gfx 199 0
- Note: [delay] is optional

::loopgfx [id]
- Loops a graphic effect
- Syntax: ::loopgfx [id]
- Example: ::loopgfx 199

::interface [id]
- Opens an interface
- Syntax: ::interface [id]
- Example: ::interface 275
- Special: ::interface 267 (opens Pest Control buying interface)

::config [id] [value]
- Sets a config value
- Syntax: ::config [id] [value]
- Example: ::config 965 1

::startconfigtest
- Starts config ID testing (cycles through config IDs)
- Syntax: ::startconfigtest
- Use ::stopconfigtest to stop

::startconfigtest2 [id]
- Starts config value testing for a specific config ID
- Syntax: ::startconfigtest2 [id]
- Example: ::startconfigtest2 965
- Use ::stopconfigtest to stop

::stopconfigtest
- Stops config testing
- Syntax: ::stopconfigtest

::yell [message]
- Broadcasts a message to all players
- Syntax: ::yell [message]
- Example: ::yell Hello everyone!
- Note: Adds [ADMIN] prefix automatically

CONSTRUCTION:
-------------

::buyhouse
- Buys a player-owned house
- Syntax: ::buyhouse

::poh
- Enters your player-owned house
- Syntax: ::poh

::custommap
- Custom map testing tool (requires console input)
- Syntax: ::custommap

PRIMARY ADMIN COMMANDS:
-----------------------
(Requires username to be "admin" or "gielinor")

Primary admins automatically get ADMINISTRATOR rights when logging in.

::giverights [rights] [playerName]
- Can be used by primary admins or "zed"
- Syntax: ::giverights [rights] [playerName]

================================================================================
COMMAND USAGE NOTES
================================================================================

1. PK PRESETS:
   - All PK preset commands clear your inventory and equipment first
   - They automatically set the appropriate spellbook
   - They include runes, food, potions, and gear switches
   - Higher tiers include better gear and more supplies

2. ADMIN COMMANDS:
   - Most admin commands require ADMINISTRATOR rights
   - Some commands (like ::giverights) have additional restrictions
   - Use ::pos to check your location before teleporting
   - ::shutdown saves all players before shutting down

3. TESTING COMMANDS:
   - Config testing commands are for developers
   - ::visit is useful for stress testing areas
   - ::path helps test pathfinding
   - ::object creates temporary objects (client-side only)

4. SPELLBOOKS:
   - Modern: Standard spells, teleports, combat spells
   - Ancient: Ice Barrage, Blood spells, etc.
   - Lunar: Vengeance, Vengeance Other, utility spells

5. BARROWS SETS:
   - Each Barrows set command equips the full set
   - Sets appropriate spellbook automatically
   - Includes supplies (food, potions, runes)

================================================================================
END OF COMMAND REFERENCE
================================================================================

