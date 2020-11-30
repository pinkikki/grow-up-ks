package jp.pinkikki.grawup.webmvc.infrastructure.life

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class TaskNotificationEntity(
    @Id
    @GeneratedValue
    val id: Int,
    val taskId: Int,
    val sound: String,
    val notifiedAt: LocalDateTime
)
