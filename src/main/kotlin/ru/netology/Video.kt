package ru.netology

import Attachment

data class Video(
        val id: Int = 2635
) : Attachment {
    override val type: String
        get() = TODO("Not yet implemented")
}