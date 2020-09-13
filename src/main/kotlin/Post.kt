import ru.netology.Comments
import ru.netology.Likes
import ru.netology.Reposts
import ru.netology.Views
import java.time.LocalDate
import java.util.*


data class Post(val id: Long, val ownerId: Long, val fromId: Long, val createdBy: Long, val date: LocalDate,
                val text: String, val replyOwnerId: Long, val replyPostId: Long, val friendsOnly: Boolean,
                val comments: Comments, val copyright: String, val likes: Likes, val repost: Reposts,
                val views: Views, val postType: String, val signerId: Long, val canPin: Boolean,
                val canDelete: Boolean, val canEdit: Boolean, val isPinned: Boolean, val markedAsAds: Boolean,
                val isFavorite: Boolean, val postponedId: Long) {

}


