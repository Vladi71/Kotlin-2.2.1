package ru.netology

import Attachment

data class Poll(
        val id: Int = 21,
        val ownerId: Int = 54
) : Attachment{
    override val type = "Poll"
    override fun toString(): String {
        return "$type: id= $id, ownerId= $ownerId"
}
    }