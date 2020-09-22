package ru.netology

import Attachment
import java.util.*

data class Note(
        val id: Int = 1,
        val ownerId: Int = 2,
        val title: String = " I`m....",
        val text: String = "Like Kotlin",
        val date: String = " 12.11.2019",
        val comments: Int = 45,
        val readComments: Int = 45,
        val viewUrl: String = "wsdfdf"
) : Attachment{
    override val type: String
        get() = TODO("Not yet implemented")
}