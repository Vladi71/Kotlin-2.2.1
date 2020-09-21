package ru.netology

import Attachment

data class Audio(
        val id: Int = 1,
        val ownerId: Int = 2,
        val artist: String = "Singer",
        val title: String = "Song Title",
        val duration: Int = 4,
        val url: String = "ru.netology",
        val lyricsId: Int = 1112,
        val albumId: Int = 7845,
        val genreId: Int = 7,
        val date: Int = 17_05_1992,
        val noSearch: Boolean = false,
        val isHq: Boolean = true
) : Attachment {
    override val type: String
        get() = TODO("Not yet implemented")
}