package ru.netology

import Post
import ru.netology.WallService.currentId
import ru.netology.WallService.posts

fun main() {
    add(Post(

            fromId = 24,
            date = "12.04.2020",
            text = "Hello Kotlin",
            comments = Comments(24),
            likes = Likes(12),
            repost = Reposts(2),
            views = Views(),
    ))

    add(Post(

            fromId = 84,
            date = "22.04.2020",
            text = "Hello World",
            comments = Comments(2),
            likes = Likes(17),
            repost = Reposts(55),
            views = Views(),
    ))
    for (post in posts) {
        println(post)
    }

}

fun add(post: Post): Post {
    posts += post.copy(id = currentId++)
    return posts.last()

    return WallService.add(post)

}

fun update(post: Post): Boolean {
}


