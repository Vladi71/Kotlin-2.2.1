package ru.netology
import Post

object WallService {
    var posts = emptyArray<Post>()

    fun add (post: Post): Post{
        posts += post
        return posts.last()
    }
}