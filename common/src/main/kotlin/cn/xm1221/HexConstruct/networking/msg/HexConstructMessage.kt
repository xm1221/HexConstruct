package cn.xm1221.HexConstruct.networking.msg

import dev.architectury.networking.NetworkChannel
import dev.architectury.networking.NetworkManager.PacketContext
import cn.xm1221.HexConstruct.HexConstruct
import cn.xm1221.HexConstruct.networking.HexConstructNetworking
import cn.xm1221.HexConstruct.networking.handler.applyOnClient
import cn.xm1221.HexConstruct.networking.handler.applyOnServer
import net.fabricmc.api.EnvType
import net.minecraft.network.FriendlyByteBuf
import net.minecraft.server.level.ServerPlayer
import java.util.function.Supplier

sealed interface HexConstructMessage

sealed interface HexConstructMessageC2S : HexConstructMessage {
    fun sendToServer() {
        HexConstructNetworking.CHANNEL.sendToServer(this)
    }
}

sealed interface HexConstructMessageS2C : HexConstructMessage {
    fun sendToPlayer(player: ServerPlayer) {
        HexConstructNetworking.CHANNEL.sendToPlayer(player, this)
    }

    fun sendToPlayers(players: Iterable<ServerPlayer>) {
        HexConstructNetworking.CHANNEL.sendToPlayers(players, this)
    }
}

sealed interface HexConstructMessageCompanion<T : HexConstructMessage> {
    val type: Class<T>

    fun decode(buf: FriendlyByteBuf): T

    fun T.encode(buf: FriendlyByteBuf)

    fun apply(msg: T, supplier: Supplier<PacketContext>) {
        val ctx = supplier.get()
        when (ctx.env) {
            EnvType.SERVER, null -> {
                HexConstruct.LOGGER.debug("Server received packet from {}: {}", ctx.player.name.string, this)
                when (msg) {
                    is HexConstructMessageC2S -> msg.applyOnServer(ctx)
                    else -> HexConstruct.LOGGER.warn("Message not handled on server: {}", msg::class)
                }
            }
            EnvType.CLIENT -> {
                HexConstruct.LOGGER.debug("Client received packet: {}", this)
                when (msg) {
                    is HexConstructMessageS2C -> msg.applyOnClient(ctx)
                    else -> HexConstruct.LOGGER.warn("Message not handled on client: {}", msg::class)
                }
            }
        }
    }

    fun register(channel: NetworkChannel) {
        channel.register(type, { msg, buf -> msg.encode(buf) }, ::decode, ::apply)
    }
}
