import br.com.gustavoantunes.modelo.Cliente
import br.com.gustavoantunes.modelo.Diretor
import br.com.gustavoantunes.modelo.Gerente
import br.com.gustavoantunes.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Gustavo",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 12345
    )

    val diretor = Diretor(
        nome = "Gustavo",
        cpf = "111.111.111-11",
        salario = 10000.0,
        senha = 123456,
        plr = 2000.0
    )

    val cliente = Cliente(
        nome = "br.com.gustavoantunes.modelo.Cliente 1",
        cpf = "333.333.333-33",
        senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 12345)
    sistema.entra(diretor, 123456)
    sistema.entra(cliente,1234)
}