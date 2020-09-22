package ru.netology

import Attachment

data class Video(
        val id: Int = 2635
) : Attachment {
    override val type = "Video"
    override fun toString(): String {
        return "$type: id= $id"
    }
}