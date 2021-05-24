package br.com.gustavoantunes.teste

fun testaCollectionAndMapAssociate() {
    val pedidos = listOf(
        Pedido(1, 10.0),
        Pedido(2, 20.0),
        Pedido(3, 30.0),
        Pedido(4, 40.0),
        Pedido(5, 50.0),
    )
    println(pedidos)

    //associate tem a capacidade de transformar o nosso objeto em um map
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associate { pedido ->
        pedido.numero to pedido
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    //Já que estamos voltando o proprio elemento do pedido como valor do mapa podemos utilizar o associateBy
    //para simplificar
    val pedidosMapeadosAssociateBy: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeadosAssociateBy)

    //faz uma associação com um determinado calculo
    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 30.0
    }
    println(pedidosFreteGratis)

    //O group by tem a ideia de agrupar valores referenciando uma chave
    //Podemos realizar o agrupamento dos dados da seguinte maneira
    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 30.0
    }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])


    //Criando uma agenda com groupBY
    val nomes = listOf("Gustavo", "Filipe", "Maria", "Marcelo")
    val agenda = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['M'])
}


data class Pedido(val numero: Int, val valor: Double)