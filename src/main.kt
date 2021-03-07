fun main() {

    val titular: String = "Gustavo Antunes";
    val numeroConta: Int = 1000;
    var saldo: Double = 0.0;
//    saldo = 100 + 2.0
//    saldo += 200
    saldo -= 1000;

    println(titular);
    println("titular " + titular);
    println("titular $titular");

    println("número da conta $numeroConta")
    println("saldo da conta $saldo")

    testaCondicoes(saldo)

    for (i in 1..6) {
        println(i)
        if (i == 4) {
            break
        }
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }
    var i = 0
    while (i < 5) {
        print(i)
        i++
    }

    testaClasse()
}

fun testaClasse() {
    val conta = Conta("Maria dos Prazeres", 1001)
    conta.deposita(200.0)
    println(conta.titular)

    val contaFilipe = Conta(numero = 1002, titular = "Filipe")
    contaFilipe.deposita(300.0)
    println(contaFilipe.titular)

    conta.deposita(50.0)
    println(conta.saldo)
}

class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (saldo > 0)
            this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
//  Não é comum utilizarmos no kotlin os métodos getters e setters dessa maneira
//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(saldo: Double) {
//        if (saldo > 0)
//            this.saldo = saldo
//    }
}

fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}