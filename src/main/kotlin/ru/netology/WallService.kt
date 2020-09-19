package ru.netology

import Post

object WallService {


        var posts = emptyArray<Post>()
        var currentId = 1
        fun add(post: Post): Post {
            posts += post
            return posts.last()
        }
    }
