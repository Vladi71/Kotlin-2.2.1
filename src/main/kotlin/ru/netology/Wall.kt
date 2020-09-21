package ru.netology

import Attachment

data class Wall(
        val methods: Boolean = true,
) : Attachment {
    override val type: String
        get() = TODO("Not yet implemented")
}