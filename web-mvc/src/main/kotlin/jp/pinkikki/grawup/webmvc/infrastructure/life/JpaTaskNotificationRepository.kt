package jp.pinkikki.grawup.webmvc.infrastructure.life

import org.springframework.data.jpa.repository.JpaRepository

interface JpaTaskNotificationRepository : JpaRepository<TaskNotificationEntity, Int>
