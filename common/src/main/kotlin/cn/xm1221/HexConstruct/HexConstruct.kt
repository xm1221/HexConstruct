package cn.xm1221.HexConstruct

import net.minecraft.resources.ResourceLocation
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import cn.xm1221.HexConstruct.config.HexConstructServerConfig
import cn.xm1221.HexConstruct.networking.HexConstructNetworking
import cn.xm1221.HexConstruct.registry.HexConstructActions

object HexConstruct {
    const val MODID = "hexconstruct"

    @JvmField
    val LOGGER: Logger = LogManager.getLogger(MODID)

    @JvmStatic
    fun id(path: String) = ResourceLocation(MODID, path)

    fun init() {
        HexConstructServerConfig.init()
        initRegistries(
            HexConstructActions,
        )
        HexConstructNetworking.init()
    }

    fun initServer() {
        HexConstructServerConfig.initServer()
    }
}
