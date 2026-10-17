package cn.xm1221.HexConstruct.fabric

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import cn.xm1221.HexConstruct.HexConstructClient

object FabricHexConstructModMenu : ModMenuApi {
    override fun getModConfigScreenFactory() = ConfigScreenFactory(HexConstructClient::getConfigScreen)
}
