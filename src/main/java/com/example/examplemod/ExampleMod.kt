package com.example.examplemod

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger

const val MODID = "examplemod"
const val NAME = "Example Mod"
const val VERSION = "1.0"

@Mod(modid = MODID, name = NAME, version = VERSION)
class ExampleMod {

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
        // some example code
        logger!!.info("DIRT BLOCK >> {}", Blocks.DIRT.registryName)
    }

    companion object {
        private var logger: Logger? = null
    }
}
