package br.com.gustavoantunes.modelo

class CalcularaBonificacao {

    var total: Double = 0.0

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}