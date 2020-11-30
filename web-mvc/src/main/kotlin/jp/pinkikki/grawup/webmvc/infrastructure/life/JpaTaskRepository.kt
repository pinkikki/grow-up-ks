package jp.pinkikki.grawup.webmvc.infrastructure.life

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface JpaTaskRepository : JpaRepository<TaskEntity, Int> {
    @Query("select t from TaskEntity t inner join fetch t.taskNotifications")
    fun findAllWithJoinFetch(): List<TaskEntity>
}

