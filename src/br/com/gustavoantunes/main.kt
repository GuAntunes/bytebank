import br.com.gustavoantunes.modelo.*

fun main() {
    println("Bem vindo ao bytebank!")

    val alex = Cliente(nome = "Alex", cpf = "",senha = 1234)
    val cPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    var cCorrente = ContaCorrente(titular = alex, numero = 1001)

    //Objeto Anônimo
    //São utilizados quando queremos ter a estrutura de um objeto porém não queremos criar uma classe para essa estrutura
    val fran = object: Autenticavel{
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 100)

    println("Nome do cliente ${fran.nome}")

    testaContasDiferentes()

    println("Total de contas: ${Conta.Contador.total}")

}



