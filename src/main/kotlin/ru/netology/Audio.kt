package ru.netology

data class Audio(
        val id: Int = 1,
        val ownerId: Int = 2,
        val artist: String = "Король и Шут",
        val title: String = "Камнем по голове",
        val duration: Int = 4,
        val url: String = "ru.netology",
        val lyricsId: Int = 1112,
        val albumId: Int = 7845,
        val genreId: Int = 7,
        val date: Int = 17_05_1992,
        val noSearch: Boolean = false,
        val isHq: Boolean = true,
) : Attachment {
    override val type = "Audio"
    override fun toString(): String {
        return "$type: artist= $artist, title= $title, duration= $duration"
    }
}