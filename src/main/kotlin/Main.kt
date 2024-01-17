fun main() {
    val usuario1 = Usuario(1, "Usuário 1")
    val usuario2 = Usuario(2, "Usuário 2")

    val conteudo1 = ConteudoEducacional("Curso de Kotlin", 60, Nivel.INTERMEDIARIO)
    val conteudo2 = ConteudoEducacional("Curso de Java", 90, Nivel.DIFICIL)

    val formacao = Formacao("Formação de Programação", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1, usuario2)

    println("Formação: ${formacao.nome}")
    println("Conteúdos:")
    formacao.conteudos.forEach { conteudo ->
        println("${conteudo.nome} - Nível: ${conteudo.nivel}, Duração: ${conteudo.duracao} minutos")
    }
    println("Inscritos na formação:")
    formacao.inscritos.forEach { usuario ->
        println("ID: ${usuario.id}, Nome: ${usuario.nome}")
    }
}
