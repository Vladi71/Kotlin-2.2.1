@file:Suppress("UNREACHABLE_CODE")

package ru.netology

import ru.netology.WallService.add
import ru.netology.WallService.createComment
import ru.netology.WallService.postPrint
import ru.netology.WallService.reportComment
import ru.netology.WallService.update


fun main() {
    add(Post(
            date = "12.04.2020",
            text = "Hello Kotlin",
            likes = Likes(12),
            repost = Reposts(2),
            views = Views(),
            original = null,
            attachments = listOf(Audio(), Photo())
    ))

    add(Post(
            date = "22.04.2020",
            text = "Hello World",

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

            likes = Likes(17),
            repost = Reposts(55),
            views = Views(),
            original = repost(Post(
                    date = "12.04.2020",
                    text = "Hello Kotlin",

                    likes = Likes(12),
                    repost = Reposts(2),
                    views = Views(),
                    original = null,
                    attachments = listOf(Audio(), Photo())
            )),
            attachments = listOf(Sticker(), Video())
    ))

    createComment(Comments(1, "Добавлен новый комментарий", listOf()))
    // createComment(Comments(4, "Комментарий для ошибки", listOf()))
    reportComment(ReportComment(1, 5))
    postPrint()
}





