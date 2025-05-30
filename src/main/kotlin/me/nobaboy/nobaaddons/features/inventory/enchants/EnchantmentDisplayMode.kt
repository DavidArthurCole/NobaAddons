package me.nobaboy.nobaaddons.features.inventory.enchants

import dev.isxander.yacl3.api.NameableEnum
import me.nobaboy.nobaaddons.utils.tr
import net.minecraft.text.Text

enum class EnchantmentDisplayMode : NameableEnum {
	NORMAL,
	COMPACT,
	LINES,
	;

	override fun getDisplayName(): Text = when(this) {
		NORMAL -> tr("nobaaddons.label.enchantDisplayMode.normal", "Default")
		COMPACT -> tr("nobaaddons.label.enchantDisplayMode.compact", "Compact")
		LINES -> tr("nobaaddons.label.enchantDisplayMode.lines", "One per line")
	}
}