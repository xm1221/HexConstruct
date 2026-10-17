@file:JvmName("HexConstructAbstractionsImpl")

package cn.xm1221.HexConstruct.forge

import cn.xm1221.HexConstruct.registry.HexConstructRegistrar
import net.minecraftforge.registries.RegisterEvent
import thedarkcolour.kotlinforforge.forge.MOD_BUS

fun <T : Any> initRegistry(registrar: HexConstructRegistrar<T>) {
    MOD_BUS.addListener { event: RegisterEvent ->
        event.register(registrar.registryKey) { helper ->
            registrar.init(helper::register)
        }
    }
}
