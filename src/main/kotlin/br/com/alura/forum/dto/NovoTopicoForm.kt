package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class NovoTopicoForm (
    @field:NotEmpty
    val titulo: String,

    @field:NotNull
    val mensagem: String,

    @field:NotNull
    val idCurso: Long,
    @field:NotNull
    val idAutor: Long
)
