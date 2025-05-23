package me.nobaboy.nobaaddons.features.inventory.slotinfo.uielements

import me.nobaboy.nobaaddons.events.impl.render.ScreenRenderEvents
import me.nobaboy.nobaaddons.features.inventory.slotinfo.ISlotInfo
import me.nobaboy.nobaaddons.utils.InventoryUtils
import me.nobaboy.nobaaddons.utils.NobaColor
import me.nobaboy.nobaaddons.utils.NumberUtils.tryRomanToArabic
import me.nobaboy.nobaaddons.utils.items.ItemUtils.lore
import me.nobaboy.nobaaddons.utils.items.ItemUtils.stringLines

object BestiarySlotInfo : ISlotInfo {
	private var bestiaryLocation: String? = null

	override val enabled: Boolean get() = config.bestiaryFamilyTier || config.bestiaryMilestone

	override fun handle(event: ScreenRenderEvents.DrawItem) {
		val inventoryName = InventoryUtils.openInventoryName() ?: return
		val itemStack = event.itemStack
		val lore = itemStack.lore.stringLines

		bestiaryLocation = getBestiaryLocation(inventoryName) ?: return

		if(config.bestiaryFamilyTier && lore.any { it.endsWith("Bonuses") }) {
			if(config.checkMarkIfMaxed && lore.any { it == "Overall Progress: 100% (MAX!)" }) {
				drawCount(event, ISlotInfo.CHECK, NobaColor.GREEN)
			} else {
				val tier = getTier(itemStack.name.string)
				drawCount(event, tier)
			}
		}

		if(config.bestiaryMilestone && lore.any { it == "Click to open Bestiary Milestones!" }) {
			val milestone = getTier(itemStack.name.string)
			drawCount(event, milestone)
		}
	}

	private fun getBestiaryLocation(inventoryName: String): String? {
		return when {
			inventoryName == "Bestiary" -> inventoryName
			inventoryName.contains("Bestiary ➜") -> inventoryName.split(" ➜ ").getOrNull(1)
			bestiaryLocation != null && inventoryName.contains("$bestiaryLocation ➜") -> bestiaryLocation
			else -> null
		}
	}

	private fun getTier(name: String): String {
		return name.split(" ").lastOrNull()?.tryRomanToArabic()?.toString() ?: "0"
	}
}