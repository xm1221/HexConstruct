package cn.xm1221.HexConstruct.networking

import dev.architectury.networking.NetworkChannel
import cn.xm1221.HexConstruct.HexConstruct
import cn.xm1221.HexConstruct.networking.msg.HexConstructMessageCompanion

object HexConstructNetworking {
    val CHANNEL: NetworkChannel = NetworkChannel.create(HexConstruct.id("networking_channel"))

    fun init() {
        for (subclass in HexConstructMessageCompanion::class.sealedSubclasses) {
            subclass.objectInstance?.register(CHANNEL)
        }
    }
}
