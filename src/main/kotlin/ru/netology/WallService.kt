package ru.netology


object WallService {

    private var posts = emptyArray<Post>()
    private var currentId = 1
    private var comments = emptyArray<Comments>()

    fun add(post: Post): Post {
        posts += post.copy(id = currentId++)
        return posts.last()

    }

    fun update(post: Post): Boolean {
        posts.forEachIndexed { index, currentPost ->
            if (currentPost.id == post.id) {
                posts[index] = post.copy(id = currentPost.id, date = currentPost.date)
                return true
            }
        }
        return false
    }

    fun postPrint() {
        for (post in posts) {
            print(post.id)
            print(" ")
            println(post.date)
            print(" ")
            println(post.text)
            print(" ")
            println(post.comments)
            println(post.attachments)
        }
    }

    fun createComment(comment: Comments): Boolean {
        // try {
        posts.forEach { currentPost ->
            if (currentPost.id == comment.postId) {
                comments += comment
                currentPost.comments += comment
                return true
            } else {
                throw PostNotFoundException("Не верный ID")
            }
        }
        //   } catch (e: PostNotFoundException) {
        //      println("PostNotFoundException")
        //  }
        return false
    }
}





