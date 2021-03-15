fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("br.com.gustavoantunes.modelo.Conta é positiva")
        saldo == 0.0 -> println("br.com.gustavoantunes.modelo.Conta é neutra")
        else -> println("br.com.gustavoantunes.modelo.Conta é negativa")
    }
}