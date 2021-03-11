fun testaClasse() {
    val conta = ContaPoupanca("Maria dos Prazeres", 1001)
    conta.deposita(200.0)
    println(conta.titular)

    val contaFilipe = ContaCorrente(numero = 1002, titular = "Filipe")
    contaFilipe.deposita(300.0)
    println(contaFilipe.titular)

    conta.deposita(50.0)
    println(conta.saldo)
}