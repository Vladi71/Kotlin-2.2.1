package ru.netology

import Attachment

data class Photo(
        val id: Int = 1,
        val albumId: Int = 5,

) : Attachment {
    override val type = "Photo"
    override fun toString(): String {
        return "$type: album $albumId"
    }
}