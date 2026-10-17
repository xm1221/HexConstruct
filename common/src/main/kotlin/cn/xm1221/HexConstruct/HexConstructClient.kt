package cn.xm1221.HexConstruct

import cn.xm1221.HexConstruct.config.HexConstructClientConfig
import me.shedaniel.autoconfig.AutoConfig
import net.minecraft.client.gui.screens.Screen

object HexConstructClient {
    fun init() {
        HexConstructClientConfig.init()
    }

    fun getConfigScreen(parent: Screen): Screen {
        return AutoConfig.getConfigScreen(HexConstructClientConfig.GlobalConfig::class.java, parent).get()
    }
}
