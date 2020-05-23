package jp.pinkikki.grawup.webmvc.domain.life

interface TaskRepository {
    fun save(task: Task)
}
