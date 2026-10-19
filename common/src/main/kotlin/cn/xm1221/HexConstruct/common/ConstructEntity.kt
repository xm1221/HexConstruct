package cn.xm1221.HexConstruct.common

import cn.xm1221.HexConstruct.api.ConstructSkill
import net.minecraft.server.level.ServerLevel
import net.minecraft.server.level.ServerPlayer
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.PathfinderMob
import net.minecraft.world.level.Level

abstract class ConstructEntity(entityType: EntityType<out PathfinderMob>, level: Level) : PathfinderMob(entityType, level) {

    val SKILLS = listOf<ConstructSkill>().sortedBy { skill -> skill.priority }

    abstract val OWNER:ServerPlayer?

    override fun tick() {
        for (skill in SKILLS){
            skill.tick(this)
        }
        super.tick()
    }

    fun work(skill: ConstructSkill){
        if(level().isClientSide)return
        val slevel = level() as ServerLevel
        skill.exec(this,slevel)
    }

    override fun isNoAi(): Boolean {
        return SKILLS.size>0 && OWNER != null
    }


}