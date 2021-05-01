package br.com.gustavoantunes.teste

import br.com.gustavoantunes.modelo.Endereco

fun testaExceptionsAndNullReferences() {
    //utilizando nullable e non-null assertion
    val endereco: Endereco? = null
    val enderecoNonNull: Endereco = endereco!!

    //utilizando safe call
    val enderecoNulo: Endereco? = null
    println(enderecoNulo?.nome)

    //utilizando safe call encadeado
    println(enderecoNulo?.nome?.length)

    //utilizando safe call com .let
    enderecoNulo?.let {
        println(it.nome)
    }

    //elvis operator
    val elvis = enderecoNulo?.nome?.length ?: -1

    //elvis operator com exceptions
    val elvisEx = enderecoNulo?.nome?.length ?: throw IllegalStateException("Endereço não pode ser nulo")

    val valor: Any = "Teste"
    //safe cast
    val numero: Int? = valor as? Int
}
