package ru.netology

import Attachment

data class Document(
        val id: Int = 1,
        val ownerId: Int = 2,
        val title: String = "My doc",
        val size: Int = 1,
        val ext: String = ".doc",
        val url: String = "ru.netology",
        val data: String = "14.09.2020",
        val preview: String = "size"

) : Attachment{
    override val type: String
        get() = TODO("Not yet implemented")
}