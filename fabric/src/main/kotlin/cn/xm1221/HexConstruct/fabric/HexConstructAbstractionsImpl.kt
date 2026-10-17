@file:JvmName("HexConstructAbstractionsImpl")

package cn.xm1221.HexConstruct.fabric

import cn.xm1221.HexConstruct.registry.HexConstructRegistrar
import net.minecraft.core.Registry

fun <T : Any> initRegistry(registrar: HexConstructRegistrar<T>) {
    val registry = registrar.registry
    registrar.init { id, value -> Registry.register(registry, id, value) }
}
