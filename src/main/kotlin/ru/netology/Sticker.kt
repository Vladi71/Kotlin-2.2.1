package ru.netology

import Attachment

data class Sticker(
        val productId: Int = 541
) : Attachment {
    override val type: String
        get() = TODO("Not yet implemented")
}