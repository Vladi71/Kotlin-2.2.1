@file:Suppress("UNREACHABLE_CODE")

package ru.netology

import ru.netology.WallService.add
import ru.netology.WallService.postPrint
import ru.netology.WallService.update


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
            attachments = listOf(Page(), Video())
    ))

    update(Post(
            id = 2,
            date = "22.04.2021",
            text = "Hello Netology",
            comments = Comments(2),
            likes = Likes(17),
            repost = Reposts(55),
            views = Views(),
            original = repost(Post(
                    date = "12.04.2020",
                    text = "Hello Kotlin",
                    comments = Comments(24),
                    likes = Likes(12),
                    repost = Reposts(2),
                    views = Views(),
                    original = null,
                    attachments = listOf(Audio(), Photo())
            )),
            attachments = listOf(Sticker(), Video())
    ))
    postPrint()
}





