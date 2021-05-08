package br.com.gustavoantunes.teste

fun testaRanges() {
    //range
    val serie: IntRange = 1.rangeTo(10)

    //operador dois pontos
    val numerosPares = 0..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar")
    }

    //range com until
    val numerosParesComUntil = 0.until(100) step 2
    for (numeroPar in numerosParesComUntil) {
        print("$numeroPar")
    }

    //range de regressão
    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach { print("$it") }

    //verifica se salário está dentro do intervalo
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("Está dentro do intervalo")
    }

    //range de caracteres
    val alfabeto = 'a'..'z'
    val letra = 'd'
    println(letra in alfabeto)
}