package ru.netology

data class ReportComment(
        val commentId: Int,
        val reason: Int,
        val ownerId: Int = 1,
        val message: String = "Жалоба отправлена",

        ) {
    override fun toString(): String {
        return "$message\n"
    }
}