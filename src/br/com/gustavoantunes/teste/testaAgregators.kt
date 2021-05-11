package br.com.gustavoantunes.teste

fun testaAgregators() {
    //Agregador maxOrNull
    val idades = intArrayOf(10, 11, 12, 13, 20, 20)
    val maiorIdade = idades.maxOrNull()
    println(maiorIdade)

    //Agregador minOrNull
    val menorIdade = idades.minOrNull()
    println(menorIdade)

    //Agregator average
    val media = idades.average();
    println(media)

    //Agregator all
    val todosMaiores = idades.all { it > 18 }
    println("Todos maiores? $todosMaiores")

    //Agregator any
    val qualquerMaiorDeIdade = idades.any { it >= 18 }
    println("Ao menos um maior de idade? $qualquerMaiorDeIdade")

    //Trazer a lista dos maiores de idade
    val listaMaioresDeIdade = idades.filter { it >= 18 }
    println("lista de maiores de idade $listaMaioresDeIdade")

    //Find encontra um registro com valores específicos
    val idadeEspecifica = idades.find { it == 20 }
    println("Primeiro encontrado $idadeEspecifica")
}