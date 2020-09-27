@file:Suppress("UNREACHABLE_CODE")

package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addPost() {
        val post = Post(
                id = 1,
                date = "12.06.2020",
                text = "text",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        )
        val result = WallService.add(post)
        assertTrue(result.id != 0)
    }

    @Test
    fun updatePostTrue() {
        val service = WallService
        service.add(Post(
                date = "12.06.2020",
                text = "Kotlin",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        ))

        val update = Post(
                id = 1,
                date = "13.06.2020",
                text = "Only Kotlin",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        )
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updatePostFalse() {
        val service = WallService
        service.add(Post(
                date = "12.06.2020",
                text = "Kotlin",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        ))

        val update = Post(
                id = 5,
                date = "13.06.2020",
                text = "Only Kotlin",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        )
        val result = service.update(update)
        assertFalse(result)
    }

    @Test
    fun addComment() {
        val service = WallService
        service.add(Post(
                id = 1,
                date = "12.06.2020",
                text = "text",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        ))
        val comment = Comments(
                postId = 1,
                message = "Добавляю комментарий",
                attachments = listOf())

        val result = service.createComment(comment)
        assertTrue(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {

        val service = WallService
        service.add(Post(
                id = 1,
                date = "12.06.2020",
                text = "text",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        ))
        val comment = Comments(
                postId = 5,
                message = "Добавляю комментарий",
                attachments = listOf())
        val result = service.createComment(comment)
        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun reportCommentNoId() {

        val service = WallService
        service.add(Post(
                id = 1,
                date = "12.06.2020",
                text = "text",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        ))
        val comment = ReportComment(
                commentId = 5,
                reason = 1
        )
        val result = service.reportComment(comment)
        assertFalse(result)
    }

//    @Test(expected = PostNotFoundException::class)
//    fun reportCommentNoReason() {
//
//        val service = WallService
//        service.add(Post(
//                id = 1,
//                date = "12.06.2020",
//                text = "text",
//                likes = Likes(4, true, canLike = false, canPublish = false),
//                repost = Reposts(1, false),
//                views = Views(1),
//                attachments = listOf(Audio(), Photo()),
//                original = null
//        ))
//        val comment = ReportComment(
//                commentId = 1,
//                reason = 9
//        )
//        val result = service.reportComment(comment)
//        assertFalse(result)
//    }

    @Test
    fun addReportComment() {
        val service = WallService
        service.add(Post(
                id = 1,
                date = "12.06.2020",
                text = "text",
                likes = Likes(4, true, canLike = false, canPublish = false),
                repost = Reposts(1, false),
                views = Views(1),
                attachments = listOf(Audio(), Photo()),
                original = null
        ))
        val comment = ReportComment(
                commentId = 1,
                reason = 5
        )
        val result = service.reportComment(comment)
        assertTrue(result)
    }
}



