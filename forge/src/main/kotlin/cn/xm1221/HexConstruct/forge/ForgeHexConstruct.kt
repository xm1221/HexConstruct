package cn.xm1221.HexConstruct.forge

import dev.architectury.platform.forge.EventBuses
import cn.xm1221.HexConstruct.HexConstruct
import cn.xm1221.HexConstruct.forge.datagen.ForgeHexConstructDatagen
import net.minecraftforge.fml.common.Mod
import thedarkcolour.kotlinforforge.forge.MOD_BUS

@Mod(HexConstruct.MODID)
class ForgeHexConstruct {
    init {
        MOD_BUS.apply {
            EventBuses.registerModEventBus(HexConstruct.MODID, this)
            addListener(ForgeHexConstructClient::init)
            addListener(ForgeHexConstructDatagen::init)
            addListener(ForgeHexConstructServer::init)
        }
        HexConstruct.init()
    }
}
