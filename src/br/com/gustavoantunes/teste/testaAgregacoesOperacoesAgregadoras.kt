package br.com.gustavoantunes.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testaAgregacoesOperacoesAgregadoras() {
    val salarios = bigDecimalArrayOf("1500.0", "2000.0", "12000.0", "14000.0", "3000.0")
    println(salarios.contentToString())
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios.map { salario ->
        calculaAumentoRelativo(salario, aumento)
    }.toTypedArray()
    println(salariosComAumento.contentToString())
    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = "6".toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val mediaDosTresMaioresSalarios = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(mediaDosTresMaioresSalarios)
}


private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000.0".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}

