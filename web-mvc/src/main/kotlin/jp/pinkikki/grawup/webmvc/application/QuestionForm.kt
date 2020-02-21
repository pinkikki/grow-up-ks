package jp.pinkikki.grawup.webmvc.application

import javax.validation.constraints.NotNull

data class QuestionForm(
        @field:NotNull val id: Int?,
        @field:NotNull val name: String?
)
