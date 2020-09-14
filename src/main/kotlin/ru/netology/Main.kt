package ru.netology

import Post

fun main() {


    val original1 = Post(
            id = 1,
            fromId = 24,
            date = "12.04.2020",
            text = "Hello Kotlin",
            comments = Comments(24),
            likes = Likes(12),
            repost = Reposts(2),
            views = Views(),
    )
    val original2 = Post(
            id = 7,
            fromId = 4,
            date = "13.04.2020",
            text = "Hello World",
            comments = Comments(11),
            likes = Likes(24),
            repost = Reposts(5),
            views = Views(),
    )
    WallService.add(original1)
    WallService.add(original2)

}
