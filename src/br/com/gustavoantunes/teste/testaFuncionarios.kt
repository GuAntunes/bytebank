import br.com.gustavoantunes.modelo.Analista
import br.com.gustavoantunes.modelo.CalcularaBonificacao
import br.com.gustavoantunes.modelo.Diretor
import br.com.gustavoantunes.modelo.Gerente

fun testaFuncionarios() {
    val gustavo = Analista(
        nome = "Gustavo",
        cpf = "123.456.789-09",
        salario = 1000.0
    )

    println("Nome ${gustavo.nome}")
    println("CPF ${gustavo.cpf}")
    println("Salário ${gustavo.salario}")
    println("Bonificação ${gustavo.bonificacao}")
    println("----------------------------------")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("Nome ${fran.nome}")
    println("CPF ${fran.cpf}")
    println("Salário ${fran.salario}")
    println("Bonificação ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso!")
    } else {
        println("falha na autenticação")
    }

    println("----------------------------------")

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.222.222-22",
        salario = 3000.0,
        senha = 4444,
        plr = 5000.0
    )

    println("Nome ${gui.nome}")
    println("CPF ${gui.cpf}")
    println("Salário ${gui.salario}")
    println("Bonificação ${gui.bonificacao}")
    println("PLR ${gui.plr}")

    if (gui.autentica(4444)) {
        println("autenticou com sucesso!")
    } else {
        println("falha na autenticação")
    }

    println("----------------------------------")

    val maria = Analista(
        nome = "Maria",
        cpf = "333.444.222-22",
        salario = 6000.0
    )


    val calculadora = CalcularaBonificacao()

    calculadora.registra(gustavo)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificação: ${calculadora.total}")
}