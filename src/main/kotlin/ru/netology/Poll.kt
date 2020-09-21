package ru.netology

import Attachment

data class Poll(
        val id: Int = 21,
        val ownerId: Int = 54
) : Attachment{
    override val type: String
        get() = TODO("Not yet implemented")
}