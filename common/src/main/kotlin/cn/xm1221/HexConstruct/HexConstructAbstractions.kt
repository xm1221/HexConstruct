@file:JvmName("HexConstructAbstractions")

package cn.xm1221.HexConstruct

import dev.architectury.injectables.annotations.ExpectPlatform
import cn.xm1221.HexConstruct.registry.HexConstructRegistrar

fun initRegistries(vararg registries: HexConstructRegistrar<*>) {
    for (registry in registries) {
        initRegistry(registry)
    }
}

@ExpectPlatform
fun <T : Any> initRegistry(registrar: HexConstructRegistrar<T>) {
    throw AssertionError()
}
