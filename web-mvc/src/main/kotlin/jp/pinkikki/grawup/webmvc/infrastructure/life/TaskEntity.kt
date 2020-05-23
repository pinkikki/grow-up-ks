package jp.pinkikki.grawup.webmvc.infrastructure.life

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class TaskEntity(
        @Id
        @GeneratedValue
        val id: Int,
        val content: String,
        val categoryId: Int,
        val targetTime: String,
        val notification: Boolean
)
