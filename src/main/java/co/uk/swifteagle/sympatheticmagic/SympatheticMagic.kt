package co.uk.swifteagle.sympatheticmagic

import net.minecraft.init.Blocks
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.Mod.EventHandler
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import org.apache.logging.log4j.Logger

const val MODID = "sympatheticmagic"
const val NAME = "Sympathetic Magic"
const val VERSION = "1.0"

@Mod(modid = MODID, name = NAME, version = VERSION)
class SympatheticMagic {

    @EventHandler
    fun preInit(event: FMLPreInitializationEvent) {
        logger = event.modLog
    }

    @EventHandler
    fun init(event: FMLInitializationEvent) {
        // some example code
        logger.info("IRON BLOCK >> {}", Blocks.IRON_BLOCK.registryName)
    }

    companion object {
        private lateinit var logger: Logger
    }
}
