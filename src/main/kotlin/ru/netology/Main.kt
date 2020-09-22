package ru.netology

import Post
import repost
import ru.netology.WallService.currentId
import ru.netology.WallService.posts


fun main() {
    add(Post(
            date = "12.04.2020",
            text = "Hello Kotlin",
            comments = Comments(24),
            likes = Likes(12),
            repost = Reposts(2),
            views = Views(),
            original = null,
            attachments = listOf(Audio(), Photo())

    ))

    add(Post(
            date = "22.04.2020",
            text = "Hello World",
            comments = Comments(2),
            likes = Likes(17),
            repost = Reposts(55),
            views = Views(),
            original = null,
            attachments = listOf()

    ))

    update(Post(
            id = 2,
            date = "22.04.2021",
            text = "Hello Netology",
            comments = Comments(2),
            likes = Likes(17),
            repost = Reposts(55),
            views = Views(),
            attachments = listOf(Audio(), Video()),
            original = repost(Post(
                    date = "12.04.2020",
                    text = "Hello Kotlin",
                    comments = Comments(24),
                    likes = Likes(12),
                    repost = Reposts(2),
                    views = Views(),
                    original = null,
                    attachments = listOf(Audio(), Photo())
            ))
    ))


    for (post in posts) {
        print(post.id)
        print(" ")
        println(post.date)
        print(" ")
        println(post.text)


    }
}

fun add(post: Post): Post {
    posts += post.copy(id = currentId++)
    return posts.last()
    return WallService.add(post)
}

fun update(post: Post): Boolean {
    posts.forEachIndexed { index, currentPost ->
        if (currentPost.id == post.id) {
            posts[index] = post.copy(id = currentPost.id, date = currentPost.date)

        }
    }

    return false
}



