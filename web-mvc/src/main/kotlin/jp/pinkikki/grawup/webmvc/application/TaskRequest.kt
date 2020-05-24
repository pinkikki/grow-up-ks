package jp.pinkikki.grawup.webmvc.application

import javax.validation.constraints.NotNull

data class TaskRequest(
    @field:NotNull val content: String,
    @field:NotNull val categoryId: Int,
    @field:NotNull val notification: Boolean
)
