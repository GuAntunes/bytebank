package br.com.gustavoantunes.teste

fun testaOperacoesCompostas() {
    val livro1 = Livro("O mundo de sofia", "não lembro", 1980, "não sei")
    val livro2 = Livro("Os 7 hábitos das pessoas altamente eficazes", "stephen", 2004, "FranklinCovey")

    val livros = mutableListOf<Livro>(livro1, livro2)

    val prateleira = Prateleira("Literatura", livros)
    prateleira.organizarPorAutor().imprimeComMarcadores()
    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()
}

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
){
    fun organizarPorAutor(): List<Livro> {
        livros.sortedBy { it.autor}
        return livros
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        livros.sortedBy { it.anoPublicacao }
        return livros
    }
}