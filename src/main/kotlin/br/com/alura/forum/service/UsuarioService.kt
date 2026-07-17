package br.com.alura.forum.service

import br.com.alura.forum.model.Curso
import br.com.alura.forum.model.Usuario
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
data class UsuarioService(var usuarios: List<Usuario>) {
    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter({ u ->
            u.id == id
        }).findFirst().get()

    }

    init {
        val usuario = Usuario(
            id = 1,
            nome = "Ana da Silva",
            email = "ana@gmail.com",
        )
        usuarios = Arrays.asList(usuario)

    }
}

