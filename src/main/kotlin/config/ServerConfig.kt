package io.github.toapuro.typespot.config

import net.minecraftforge.common.ForgeConfigSpec

object ServerConfig {
    private val BUILDER = ForgeConfigSpec.Builder()

    val SPEC: ForgeConfigSpec? = BUILDER.build()
}
