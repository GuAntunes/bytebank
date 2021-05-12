package br.com.gustavoantunes.teste

fun testaListas() {
    val livro1 = Livro("O mundo de sofia", "não lembro", 1980, "não sei")
    val livro2 = Livro("Os 7 hábitos das pessoas altamente eficazes", "stephen", 2004, "FranklinCovey")

    val livros = mutableListOf<Livro>(livro1, livro2)
    livros.imprimeComMarcadores()

    livros.sorted()
    livros.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    println(ordenadoPorTitulo)

    val titulos: List<String> = livros
        .filter { it.autor == "stephen" }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)
}

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: Long,
    val editora: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other.anoPublicacao)
    }

}

fun List<Livro>.imprimeComMarcadores(){
    val textoFormatado = this.joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println(" ### Lista de livros ###")
    println(textoFormatado)

}