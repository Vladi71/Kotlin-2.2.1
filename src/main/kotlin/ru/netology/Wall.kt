package ru.netology

import Attachment

data class Wall(
        val methods: Boolean = true,
) : Attachment {
    override val type = "Wall"
    override fun toString(): String {
        return "$type: methods= $methods"
    }
}