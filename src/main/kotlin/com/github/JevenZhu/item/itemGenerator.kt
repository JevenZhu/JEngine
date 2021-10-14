package com.github.JevenZhu.item

import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import taboolib.library.xseries.XMaterial
import taboolib.platform.util.buildItem

object itemGenerator {
    fun generatorItem(itemId : Int , amount : Int, player : Player) : ItemStack {
        var bukkitItem = buildItem(XMaterial.GOLDEN_AXE) {
            this.amount = amount
            this.name = "test"
        }
        return bukkitItem
    }
}