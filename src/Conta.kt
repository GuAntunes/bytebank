open class Conta(var titular: String, var numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(saldo: Double) {
        if (saldo > 0)
            this.saldo += saldo
    }

    open fun saca(saldo: Double) {
        if (saldo >= saldo) {
            this.saldo -= saldo
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