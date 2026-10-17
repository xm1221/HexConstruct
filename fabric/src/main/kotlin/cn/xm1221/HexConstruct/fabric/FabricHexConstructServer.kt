package cn.xm1221.HexConstruct.fabric

import cn.xm1221.HexConstruct.HexConstruct
import net.fabricmc.api.DedicatedServerModInitializer

object FabricHexConstructServer : DedicatedServerModInitializer {
    override fun onInitializeServer() {
        HexConstruct.initServer()
    }
}
