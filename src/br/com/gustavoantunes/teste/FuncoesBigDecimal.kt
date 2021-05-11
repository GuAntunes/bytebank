package br.com.gustavoantunes.teste

import java.math.BigDecimal

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal =
    this.reduce { acumulador, valor ->
        acumulador + valor
    }

fun Array<BigDecimal>.media() :BigDecimal =
    if(this.isEmpty()) BigDecimal.ZERO else this.somatoria() / this.size.toBigDecimal()