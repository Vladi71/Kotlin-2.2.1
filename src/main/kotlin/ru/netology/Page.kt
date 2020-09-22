package ru.netology

import Attachment

data class Page(
        val id: Int = 1,
        val title: String = "Title"
) : Attachment {
    override val type: String
        get() = TODO("Not yet implemented")
}