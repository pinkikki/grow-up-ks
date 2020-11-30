package jp.pinkikki.grawup.webmvc.infrastructure.life

import jp.pinkikki.grawup.webmvc.domain.life.TaskNotification
import jp.pinkikki.grawup.webmvc.domain.life.TaskNotificationRepository

class TaskNotificationRepositoryImpl(private val jpaTaskRepository: JpaTaskNotificationRepository) :
    TaskNotificationRepository {

    override fun save(taskNotification: TaskNotification): TaskNotification {
        val saved = jpaTaskRepository.save(
            TaskNotificationEntity(
                taskNotification.id,
                taskNotification.taskId,
                taskNotification.sound,
                taskNotification.notifiedAt
            )
        )
        return toTaskNotification(saved)
    }

    private fun toTaskNotification(entity: TaskNotificationEntity): TaskNotification {
        return TaskNotification(
            entity.id,
            entity.taskId,
            entity.sound,
            entity.notifiedAt
        )
    }
}
