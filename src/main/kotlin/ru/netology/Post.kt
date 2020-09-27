package ru.netology


data class Post(
        val id: Int = -1,
        val ownerId: Long = 2,
        val fromId: Long = 50,
        val createdBy: Long = 1,
        val date: String,
        val text: String,
        val replyOwnerId: Long = 1,
        val replyPostId: Long = 1,
        val friendsOnly: Boolean = false,
        var comments: List<Comments> = emptyList(),
        val copyright: String = "zxc",
        val likes: Likes,
        val original: Post?,
        val views: Views,
        val postType: String = "qwerty",
        val signerId: Long = 1,
        val canPin: Boolean = false,
        val canDelete: Boolean = true,
        val canEdit: Boolean = false,
        val isPinned: Boolean = false,
        val markedAsAds: Boolean = true,
        val isFavorite: Boolean = false,
        val postponedId: Long = 1,
        val attachments: List<Attachment>,
        val repost: Reposts,
)

fun repost(post: Post): Post {
    return post.original ?: post
}





