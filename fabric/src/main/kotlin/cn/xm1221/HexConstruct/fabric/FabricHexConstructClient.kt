package cn.xm1221.HexConstruct.fabric

import cn.xm1221.HexConstruct.HexConstructClient
import net.fabricmc.api.ClientModInitializer

object FabricHexConstructClient : ClientModInitializer {
    override fun onInitializeClient() {
        HexConstructClient.init()
    }
}
