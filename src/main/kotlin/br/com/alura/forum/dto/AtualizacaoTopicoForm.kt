package br.com.alura.forum.dto

import org.jetbrains.annotations.NotNull
import javax.validation.constraints.NotEmpty

data class AtualizacaoTopicoForm (
    @field:NotNull
    val id: Long,

    @field:NotEmpty
    val titulo: String,

    @field:NotEmpty
    val mensagem: String
)
