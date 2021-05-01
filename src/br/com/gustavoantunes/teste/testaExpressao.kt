package br.com.gustavoantunes.teste
fun testaExpressao() {
    val entrada: String = "1,9"
    val valor: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException) {
        print("Problema na conversão")
        e.printStackTrace()
        null
    }

    if (valor != null) {
        print("valor invalido")
    } else {
        print("valor $valor")
    }

    val valorComTaxa: Double = if (valor != null) {
        valor + 0.1
    } else {
        0.0
    }
}