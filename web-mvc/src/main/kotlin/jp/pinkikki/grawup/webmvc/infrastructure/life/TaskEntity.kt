package jp.pinkikki.grawup.webmvc.infrastructure.life

import javax.persistence.*

@Entity
data class TaskEntity(
    @Id
    @GeneratedValue
    val id: Int,
    val content: String,
    val categoryId: Int,
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, insertable = false, updatable = false, name = "taskId")
    val taskNotifications: List<TaskNotificationEntity>
)
