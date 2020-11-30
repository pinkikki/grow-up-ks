package jp.pinkikki.grawup.webmvc.domain.life

import java.time.LocalDateTime

data class TaskNotification(val id: Int, val taskId: Int, val sound: String, val notifiedAt: LocalDateTime)
