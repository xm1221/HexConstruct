package cn.xm1221.HexConstruct.fabric.datagen

import cn.xm1221.HexConstruct.datagen.HexConstructActionTags
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

object FabricHexConstructDatagen : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(gen: FabricDataGenerator) {
        val pack = gen.createPack()

        pack.addProvider(::HexConstructActionTags)
    }
}
