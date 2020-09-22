package ru.netology

import Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_Post() {

        val post = Post(
                id = 1,
                date = "12.06.2020",
                text = "text",
                comments = Comments(2, canPost = true, groupsCanPost = false, canClose = false, canOpen = false),
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                original = null
        )

        val result = WallService.add(post)
        assertTrue(result.id != 0)

    }

    @Test
    fun update_Post() {
        val service = WallService
        service.add(Post(
                date = "12.06.2020",
                text = "Kotlin",
                comments = Comments(2, canPost = true, groupsCanPost = false, canClose = false, canOpen = false),
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                original = null
        ))
        service.add(Post(
                date = "13.06.2020",
                text = "Java",
                comments = Comments(2, canPost = true, groupsCanPost = false, canClose = false, canOpen = false),
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                original = null
        ))

        val update = Post(
                id = 1,
                date = "13.06.2020",
                text = "Only Kotlin",
                comments = Comments(2, canPost = true, groupsCanPost = false, canClose = false, canOpen = false),
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                original = null
        )


        assertTrue(service.currentId == update.id)
        assertFalse(service.currentId != update.id)
    }
}
