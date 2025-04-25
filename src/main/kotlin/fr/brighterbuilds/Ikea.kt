package fr.brighterbuilds

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Ikea : ModInitializer {
	const val MOD_ID = "ikea"
    private val logger = LoggerFactory.getLogger("ikea")

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		logger.info("Mod chargé !")
	}
}