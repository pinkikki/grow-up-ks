package jp.pinkikki.grawup.webmvc.infrastructure.life

import org.springframework.data.jpa.repository.JpaRepository

interface JpaTaskRepository : JpaRepository<TaskEntity, Int>
