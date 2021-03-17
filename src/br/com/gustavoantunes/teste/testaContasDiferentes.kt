import br.com.gustavoantunes.modelo.Cliente
import br.com.gustavoantunes.modelo.ContaCorrente
import br.com.gustavoantunes.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val alex = Cliente(nome = "Alex", cpf = "", senha = 3)

    val contaCorrente = ContaCorrente(
        titular = alex,
        numero = 1000
    )

    val fran = Cliente(nome = "Fran", cpf = "", senha = 4)

    val contaPoupanca = ContaPoupanca(
        titular = fran,
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")
}