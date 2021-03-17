import br.com.gustavoantunes.modelo.Cliente
import br.com.gustavoantunes.modelo.ContaCorrente
import br.com.gustavoantunes.modelo.ContaPoupanca

fun testaClasse() {
    val maria = Cliente(nome = "Maria", cpf = "", senha = 1)

    val conta = ContaPoupanca(maria, 1001)
    conta.deposita(200.0)
    println(conta.titular)

    val filipe = Cliente(nome = "Filipe", cpf = "", senha = 2)

    val contaFilipe = ContaCorrente(numero = 1002, titular = filipe)
    contaFilipe.deposita(300.0)
    println(contaFilipe.titular)

    conta.deposita(50.0)
    println(conta.saldo)
}