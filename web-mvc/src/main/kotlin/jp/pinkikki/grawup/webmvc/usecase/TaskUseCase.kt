package jp.pinkikki.grawup.webmvc.usecase

import jp.pinkikki.grawup.webmvc.application.TaskRequest
import jp.pinkikki.grawup.webmvc.domain.life.Task
import jp.pinkikki.grawup.webmvc.domain.life.TaskRepository

class TaskUseCase(private val repo: TaskRepository) {

    fun list(): List<Task> = repo.list()

    fun save(taskRequest: TaskRequest): Task {
        return repo.save(
            Task(
                -1,
                taskRequest.content,
                taskRequest.categoryId,
                taskRequest.notification
            )
        )
    }
}
