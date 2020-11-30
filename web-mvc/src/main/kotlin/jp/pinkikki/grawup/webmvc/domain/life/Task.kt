package jp.pinkikki.grawup.webmvc.domain.life

data class Task(
    val id: Int,
    val content: String,
    val categoryId: Int,
    val taskNotifications: List<TaskNotification>
)
