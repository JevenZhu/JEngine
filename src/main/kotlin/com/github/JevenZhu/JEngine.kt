package com.github.JevenZhu

import taboolib.common.platform.Plugin
import taboolib.common.platform.function.info

object JEngine : Plugin() {

    override fun onEnable() {
        info("Successfully running ExamplePlugin!")
    }
}