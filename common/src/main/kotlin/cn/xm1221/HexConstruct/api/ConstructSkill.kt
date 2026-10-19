package cn.xm1221.HexConstruct.api

import at.petrak.hexcasting.api.utils.putCompound
import cn.xm1221.HexConstruct.common.ConstructEntity
import net.minecraft.nbt.CompoundTag
import net.minecraft.server.level.ServerLevel

abstract class ConstructSkill(val priority: Int) {
    abstract val id: String

    abstract val ns: String

    val priority_name = "priority"
    abstract fun toNBT(): CompoundTag
    abstract fun fromNBT(nbt: CompoundTag,priority: Int): ConstructSkill

    open fun serialize():CompoundTag {
        val tag = CompoundTag()
        tag.putInt(priority_name, priority)
        tag.putCompound(id.modlc(ns),this.toNBT())
        return tag
    }

    open fun deserialize(nbt:CompoundTag):ConstructSkill {
        val priority = nbt.getInt(priority_name)
        val tag = nbt.getCompound(id.modlc(ns))
        return fromNBT(tag,priority)
    }
    abstract fun exec(entity: ConstructEntity, world: ServerLevel)

    abstract fun tick(entity: ConstructEntity)

}