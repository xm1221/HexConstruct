package cn.xm1221.HexConstruct.api

import cn.xm1221.HexConstruct.HexConstruct.MODID

public fun String.modlc(): String{
    return MODID+":"+this
}

public fun String.modlc(ns: String): String{
    return ns+":"+this
}