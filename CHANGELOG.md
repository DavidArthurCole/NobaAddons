# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/).

## 1.0.0-Beta.2 - 2025-04-27

**Back up your configs before updating!** This release includes major changes to how the mod's configuration
files are loaded and saved, and as such things could potentially break (but they hopefully shouldn't).

### Added

- Support for 1.21.5 - celeste, nobaboy
- Fishing catch timer HUD element - celeste
- Option to revert fishing treasure catch messages to the pre-Backwater Bayou format - celeste
- Option to mute Banshee - nobaboy
- Compact Sea Creature catch messages - nobaboy
- Announce Sea Creatures - nobaboy
  - This is only limited to Legendary and Mythic rarities
- Hotspot Waypoints - nobaboy
- Commands to calculate pet/skill level XP requirements and auction taxes - celeste
- /chat channel display - celeste

### Changed

- Enchantment tooltip parsing is now slightly more strict in where it matches - celeste
- `/swiki` & `/wikisearch` are now only registered when connected to Hypixel - celeste
- Rewrote configuration saving and loading internals - celeste
- Rewrote how the YACL config menu is built - celeste
- Improved Egglocator and Ancestral Spade guesses - nobaboy

### Fixed

- Overlapping sea creature notification titles - nobaboy
  - This is most visible if you have the minimum rarity set low enough
- Various config menu settings not correctly saving - celeste
- Enchantment tooltip parsing properly works on enchanted books again - celeste
- Certain config options re-using the same key - celeste
- Inconsistency with Mineshaft Entrance/Ladder waypoints - nobaboy
- Vacuum Pests Slot Info not displaying with pests over 999 - nobaboy

## 1.0.0-Beta.1 - 2025-03-18

### Added

- Compact Slayer quest completion messages - celeste
- Support for Backwater Bayou - celeste
- Options to hide absorption hearts & air bubbles - celeste

### Fixed

- Jerry Diana not being correctly detected - celeste
- Join instance commands attempting to join when you're not the party leader - nobaboy
- Profile type not being reset after switching profiles - nobaboy
- Slayer features (e.g. kill timer) occasionally not working - nobaboy
- Enchantment tooltips not functioning properly on certain items, like Jasper Drill X - nobaboy
- A rare error that can occur when sending mod chat messages from chat commands with certain compact chat mods - celeste

## 0.1.0-Alpha.13.1 - 2025-01-21

### Fixed

- Slayer spawn time not resetting - nobaboy

## 0.1.0-Alpha.13 - 2025-01-21

### Added

- Chat Notifications - celeste
- Copy Chat - celeste
- Item Pickup Log - celeste
- Worm Alert - nobaboy
- Slayer Features - nobaboy
  - This isn't fully complete as it's missing some Blaze and Vampire Slayer features
- Hoppity Egg Guess - nobaboy
- Require Mythic Rabbit for Chocolate Factory - celeste
- Rift free infusion & Split or Steal timer notifications - celeste
- `/noba day` to display the lobby day count (since Hypixel doesn't send the information for the line F3 shows this on) - celeste
- Chat commands to join Dungeons and Kuudra - celeste
- Option to keep items in the same position when swinging - celeste

### Changed

- Reworked commands to use [commander](https://codeberg.org/celestialfault/commander) - celeste
- Reworked the main mod config to not depend on YACL - nobaboy
- Reworked how the mod handles some data to store per-profile - celeste
- The config UI will now clearly mark options unavailable if the feature they're associated with isn't enabled - celeste
- Rewrote the HUD internals to make adding new elements easier - celeste
- Changed how HUD elements render to properly handle different window sizes - celeste
  - This will cause existing info boxes to be in the top left corner when updating

### Fixed

- `/noba refill pearls` using the wrong item ID - celeste
- `/noba refill item` is now case-insensitive to match `/gfs` - celeste
- A crash that can occur when catching a trophy fish if you haven't opened Odger's menu - celeste
- An occasional crash that occurs while processing an event - celeste
- Updated sea creature message matching to properly support the Mithril Grubber - celeste
- The mod will now detect you being on Hypixel if you use the bare `hypixel.net` IP - nobaboy

### Removed

- Reduce Sensitivity with Daedalus Axe option - celeste

## 0.1.0-Alpha.12 - 2024-12-29

### Added

- Enchantment Tooltips - celeste

### Fixed

- MayorAPI and PartyAPI not working due to internal changes in Alpha 11 - celeste

## 0.1.0-Alpha.11 - 2024-12-26

### Added

- Attribute Shard and Rancher's Boots Speed Slot Infos - nobaboy
- Armor Glint Tweaks - celeste
- Trophy Fish slot info in Odger menu - celeste
- Fishing Bobber Timer - celeste
- Trophy Fish chat message counts - celeste
  - This requires that you open Odger's menu at least once for accurate counts
- Ping On Burrow Find - nobaboy
- `/noba refill` any item from sacks - celeste
- Support for 1.21.4 - celeste
- Option to make Sea Creature Alert also notify when catching a Carrot King (since not many people fish for it) - celeste
- Option to make Sea Creature Alert also send a message in party chat - celeste
- Added a fix for Skyblocker's Correct Transparent Skin Pixels feature on 1.21.1 and 1.21.3 - celeste
- Update notifications for new versions - celeste

### Changed

- The mod will now pull some data from a repository - celeste
  - This is a fairly large internal change; if something doesn't load properly, please try `/noba repo update` (and report it in the Discord)
- Most mod message strings are now translatable - celeste
  - This does not include server messages - the mod still requires that your Hypixel language is set to English to function properly
- Redesigned keybind screen and moved info boxes to their own custom screen - nobaboy
- Keybinds now allows use of mouse buttons (not including the primary Left, Right, and Middle mouse buttons) - nobaboy
- `/noba refillpearls` has been changed to `/noba refill pearls`, along with adding `superboom` and `leaps` - celeste
- Mod chat message prefix & colors - celeste
- Enchanted Book Slot Info now uses repo data instead of getting the name from the id - nobaboy

### Fixed

- Temporary Waypoints not getting parsed in all chat because of player emblems - nobaboy
- MayorAPI not resetting once an election ends due to a typo - nobaboy
- PetAPI resetting current pet upon clicking any item other than pets in the pets menu - nobaboy
- PetAPI thinking you don't have a pet spawned until opening the pets menu at least once per session - celeste
- Announce Rare Drops announcing the same item more than once if it is moved around your inventory or when swapping islands - nobaboy

## 0.1.0-Alpha.10 - 2024-12-02

### Added

- `/noba ping` command with the new ping system - celeste
- Option to reduce mouse sensitivity in the Garden - celeste
- Reindrake sound filters - celeste
- Automatically unlock mouse on teleport - nobaboy
- Sea Creature Spawn Message chat filter - nobaboy

### Changed

- The mod will now check ping every 10 seconds instead of once a minute - celeste
- Switched ping to use the vanilla ping query packet instead of the Hypixel Mod API - celeste
- You can now mute the notification sound for Inquisitor and Sea Creature Alerts - nobaboy

### Fixed

- Pet Slot Info not displaying Golden Dragon level properly - nobaboy
- Subcommands not registering their aliases - celeste
- Some enchant names being wrong in Enchant Slot Info because the id doesn't match the enchant's name - nobaboy
- Sea Creature Alert not having a notification sound - nobaboy
- Sound filters - celeste

## 0.1.0-Alpha.9 - 2024-11-25

### Added

- Mythological Ritual Helper - nobaboy
- Slot Info - nobaboy
- Sea Creature Alert - nobaboy
- Mouse Lock - nobaboy
- Gone With The Wind Sound Filter - nobaboy
- Cancel Item Update Animation - celeste

### Changed

- PartyAPI now relies on the Hypixel Mod API - celeste

### Fixed

- Text rendered in world space now correctly shows through blocks, though the shadow is slightly buggy and there isn't much I can do about it - nobaboy

## 0.1.0-Alpha.8.1 - 2024-11-17

### Fixed

- PartyAPI getting the party list more than once when you swap worlds before it processes the list - nobaboy
- A crash caused by item position on 1.21 - celeste
- Thunder Sparks are actually visible in lava now - nobaboy

## 0.1.0-Alpha.8 - 2024-11-17

### Added

- Command Keybinds - celeste
- Remove Front-Facing Camera - celeste
- Arm Swing Animation Tweaks - celeste
- First Person Rendering - celeste
- Sound Filters - nobaboy

### Changed

- Set a minimum scale for world rendered text - nobaboy

### Fixed

- Thunder Sparks are now properly visible when they're in lava - nobaboy
- SkyBlock item stars are stored under `upgrade_level` not `dungeon_item_level` - nobaboy

## 0.1.0-Alpha.7 - 2024-11-11

### Fixed

- PartyAPI never resetting `gettingList` resulting in any party related message being slightly broken

## 0.1.0-Alpha.6 - 2024-11-10

- Initial public release
