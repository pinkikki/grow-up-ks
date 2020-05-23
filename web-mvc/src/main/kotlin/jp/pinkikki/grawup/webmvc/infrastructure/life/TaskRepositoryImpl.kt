package jp.pinkikki.grawup.webmvc.infrastructure.life

import jp.pinkikki.grawup.webmvc.domain.life.Task
import jp.pinkikki.grawup.webmvc.domain.life.TaskRepository
import org.springframework.stereotype.Repository

@Repository
class TaskRepositoryImpl(private val jpaTaskRepository: JpaTaskRepository) : TaskRepository {
    override fun save(task: Task) {
        jpaTaskRepository.save(TaskEntity(task.id, task.content, task.categoryId, task.targetTime, task.notification))
    }
}
