package ru.netology

data class Comments(
        val postId: Int,
        val message: String,
        val attachments: List<Attachment>,
        val ownerId: Int = 2,
        val fromGroup: Int = 0,
        val replyToComment: Int = 1,
        val stickerId: Int = 1,
        val guid: Int = 1,
): Attachment {
    override val type = "Comment"
    override fun toString(): String {
        return "Комментарий: $message\n"
    }
}

