package cn.xm1221.HexConstruct.fabric

import cn.xm1221.HexConstruct.HexConstruct
import net.fabricmc.api.ModInitializer

object FabricHexConstruct : ModInitializer {
    override fun onInitialize() {
        HexConstruct.init()
    }
}
