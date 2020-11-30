package jp.pinkikki.grawup.webmvc.infrastructure.life

import jp.pinkikki.grawup.webmvc.domain.life.Task
import jp.pinkikki.grawup.webmvc.domain.life.TaskNotification
import jp.pinkikki.grawup.webmvc.domain.life.TaskRepository

class TaskRepositoryImpl(private val jpaTaskRepository: JpaTaskRepository) : TaskRepository {
    override fun list(): List<Task> = jpaTaskRepository.findAllWithJoinFetch().map(this::toTask)

    override fun save(task: Task): Task {
        val saved = jpaTaskRepository.save(
            TaskEntity(
                task.id,
                task.content,
                task.categoryId,
                task.taskNotifications.map(this::toTaskNotificationEntity)
            )
        )
        return toTask(saved)
    }

    private fun toTask(entity: TaskEntity): Task {
        return Task(
            entity.id,
            entity.content,
            entity.categoryId,
            entity.taskNotifications.map(this::toTaskNotification)
        )
    }

    private fun toTaskNotification(entity: TaskNotificationEntity): TaskNotification {
        return TaskNotification(
            entity.id,
            entity.taskId,
            entity.sound,
            entity.notifiedAt
        )
    }

    private fun toTaskNotificationEntity(taskNotification: TaskNotification): TaskNotificationEntity {
        return TaskNotificationEntity(
            taskNotification.id,
            taskNotification.taskId,
            taskNotification.sound,
            taskNotification.notifiedAt
        )
    }
}
