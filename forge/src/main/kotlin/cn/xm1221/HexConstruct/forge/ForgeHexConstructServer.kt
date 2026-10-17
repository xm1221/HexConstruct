package cn.xm1221.HexConstruct.forge

import cn.xm1221.HexConstruct.HexConstruct
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent

object ForgeHexConstructServer {
    @Suppress("UNUSED_PARAMETER")
    fun init(event: FMLDedicatedServerSetupEvent) {
        HexConstruct.initServer()
    }
}
