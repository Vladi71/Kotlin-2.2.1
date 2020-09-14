package ru.netology

data class Likes(
        val count: Int, val userLikes: Boolean = true, val canLike: Boolean = false,
        val canPublish: Boolean = false,
) {
}