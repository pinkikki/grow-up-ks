package jp.pinkikki.grawup.webmvc.usecase

import jp.pinkikki.grawup.webmvc.application.TaskRequest
import jp.pinkikki.grawup.webmvc.domain.life.Task
import jp.pinkikki.grawup.webmvc.domain.life.TaskNotification
import jp.pinkikki.grawup.webmvc.domain.life.TaskNotificationRepository
import jp.pinkikki.grawup.webmvc.domain.life.TaskRepository
import java.time.LocalDateTime

class TaskUseCase(
    private val taskRepo: TaskRepository,
    private val taskNotificationRepo: TaskNotificationRepository,
) {

    fun list(): List<Task> = taskRepo.list()

    fun save(taskRequest: TaskRequest): Task {
        val task = taskRepo.save(
            Task(
                -1,
                taskRequest.content,
                taskRequest.categoryId,
                listOf(),
            )
        )
        val taskNotification = taskNotificationRepo.save(
            TaskNotification(
                -1,
                task.id,
                "issyosan.wav",
                LocalDateTime.now()
            )
        )

        return Task(
            task.id,
            task.content,
            task.categoryId,
            listOf(taskNotification)
        )
    }
}
