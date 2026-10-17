package cn.xm1221.HexConstruct.networking.handler

import dev.architectury.networking.NetworkManager.PacketContext
import cn.xm1221.HexConstruct.config.HexConstructServerConfig
import cn.xm1221.HexConstruct.networking.msg.*

fun HexConstructMessageS2C.applyOnClient(ctx: PacketContext) = ctx.queue {
    when (this) {
        is MsgSyncConfigS2C -> {
            HexConstructServerConfig.onSyncConfig(serverConfig)
        }

        // add more client-side message handlers here
    }
}
