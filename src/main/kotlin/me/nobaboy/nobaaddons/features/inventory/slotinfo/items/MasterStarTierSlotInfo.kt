package me.nobaboy.nobaaddons.features.inventory.slotinfo.items

import me.nobaboy.nobaaddons.events.impl.render.ScreenRenderEvents
import me.nobaboy.nobaaddons.features.inventory.slotinfo.ISlotInfo
import me.nobaboy.nobaaddons.utils.items.ItemUtils.asSkyBlockItem

object MasterStarTierSlotInfo : ISlotInfo {
	override val enabled: Boolean get() = config.masterStarTier

	override fun handle(event: ScreenRenderEvents.DrawItem) {
		val item = event.itemStack.asSkyBlockItem ?: return
		if(!item.id.endsWith("MASTER_STAR")) return

		val tier = getStarTier(item.id)
		drawCount(event, tier)
	}

	private fun getStarTier(id: String): String {
		return when(id) {
			"FIRST_MASTER_STAR" -> "1"
			"SECOND_MASTER_STAR" -> "2"
			"THIRD_MASTER_STAR" -> "3"
			"FOURTH_MASTER_STAR" -> "4"
			"FIFTH_MASTER_STAR" -> "5"
			else -> "?"
		}
	}
}