package br.com.gustavoantunes.modelo

//Variável global
//var totalContas = 0
//    private set


abstract class Conta(
    var titular: Cliente,
    var numero: Int
) {
    var saldo = 0.0
        protected set

    //Object Declaration
    //O companion object permite que o compartilhamento dos membros da classe quando a mesma
    //esta dentro do escopo de outra classe, ou seja, a classe conta conseguirá visualizar os membros
    //privados do object declaration Contador
    // Não é necessário utilizar o nome do objeto quando utilizamos o companion
    companion object { // ou companion object Contador{
        var total = 0
            private set
    }


    //É utilizado para inicializar instruções ao instanciar a classe
    //Parecido com um construtor secundário
    init {
        println("Criando Conta - init")
//        totalContas++
        Companion.total++ // Ou total++ ou Contador.total++
    }

    fun deposita(saldo: Double) {
        if (saldo > 0)
            this.saldo += saldo
    }

    abstract fun saca(saldo: Double)

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

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero,
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
       if(this.saldo >= valorComTaxa) {
           this.saldo -= valorComTaxa
       }
    }



}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero,
) {

    override fun saca(valor: Double) {
        if(this.saldo >= valor) {
            this.saldo -= valor
        }
    }


}