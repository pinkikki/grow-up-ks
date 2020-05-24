package jp.pinkikki.grawup.webmvc.infrastructure.life

import jp.pinkikki.grawup.webmvc.domain.life.Task
import jp.pinkikki.grawup.webmvc.domain.life.TaskRepository

class TaskRepositoryImpl(private val jpaTaskRepository: JpaTaskRepository) : TaskRepository {
    override fun list(): List<Task> = jpaTaskRepository.findAll().map(this::toDomain)

    override fun save(task: Task): Task {
        val saved = jpaTaskRepository.save(
            TaskEntity(
                task.id,
                task.content,
                task.categoryId,
                task.notification
            )
        )
        return toDomain(saved)
    }

    private fun toDomain(entity: TaskEntity): Task {
        return Task(
            entity.id,
            entity.content,
            entity.categoryId,
            entity.notification
        )
    }
}
