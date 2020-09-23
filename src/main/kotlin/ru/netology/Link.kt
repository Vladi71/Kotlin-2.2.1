package ru.netology

data class Link(
        val url: String = "www.sds.ru",
        val title: String = "title",
        val caption: String = "qwerty",
        val description: String = "123",
        val photo: Boolean = false,
        val product: String = "no",
        val button: Boolean = true,
        val previewPage: Boolean = false,
        val previewUrl: String = "www/aadadwfa.ru",
) : Attachment {
    override val type = "Link"
    override fun toString(): String {
        return "$url: title= $title "
    }
}