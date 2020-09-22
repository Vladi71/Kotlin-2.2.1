package ru.netology

import Attachment

data class Sticker(
        val productId: Int = 541
) : Attachment {
    override val type = "Sticker"
    override fun toString(): String {
        return "$type: productId= $productId"
    }
}