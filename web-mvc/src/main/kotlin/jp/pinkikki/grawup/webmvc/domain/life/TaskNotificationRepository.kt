package jp.pinkikki.grawup.webmvc.domain.life

interface TaskNotificationRepository {
    fun save(taskNotification: TaskNotification): TaskNotification
}
