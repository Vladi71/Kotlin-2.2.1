package ru.netology

import Attachment

data class Photo(
        val id: Int = 1,
        val albumId: Int = 5,

) : Attachment {
    override val type: String
        get() = TODO("Not yet implemented")
}