package jp.pinkikki.grawup.webmvc.domain.life

interface TaskRepository {
    fun list(): List<Task>
    fun save(task: Task): Task
}
