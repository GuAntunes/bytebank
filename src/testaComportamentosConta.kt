fun testaComportamentosConta() {
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