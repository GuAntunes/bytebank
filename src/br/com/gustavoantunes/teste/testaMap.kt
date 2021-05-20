package br.com.gustavoantunes.teste

fun testaMap() {
    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 34.4), 3 to 40.0)
    println(pedidos)

    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }

    val pedidosMutavel = mutableMapOf(Pair(1, 20.0), Pair(2, 34.4), 3 to 40.0)
    pedidosMutavel[4] = 70.0
    println(pedidosMutavel)
    //ou
    pedidosMutavel.put(5, 80.0)
    println(pedidosMutavel)

    //atualizando valores
    pedidosMutavel[1] = 100.0
    println(pedidosMutavel)
    //ou
    pedidosMutavel.put(1, 100.0)
    println(pedidosMutavel)

    //caso queira adicionar somente se não existe um valor prévio
    pedidosMutavel.putIfAbsent(1, 900.0)
    println(pedidosMutavel)

    //remover valores
    pedidosMutavel.remove(5)
    println(pedidosMutavel)

    //remover dado a chave e valor, só será removido se a chave e valor baterem
    pedidosMutavel.remove(4, 80.0)
    println(pedidosMutavel)

}

fun testaMapComportamentosEspecificos() {
    val pedidos = mapOf(
        Pair(1, 20.0),
        Pair(2, 34.4),
        3 to 40.0,
        4 to 100.0,
        5 to 150.0,
        6 to 40.0
    )
    println(pedidos)

    val valorPedido = pedidos[1]
    //O getValue irá lançar uma exception caso a chave não exista
    val valorPedidoGetValue = pedidos.getValue(5)

    println(pedidos.getOrElse(1, {
        "Não tem o pedido"
    }))

    println(
        pedidos.getOrDefault(
            0,
            -1.0
        )
    )

    //Precisamos mandar os valores com parenteses pois o map trata como um Pair
    val pedidosFiltrados = pedidos.filter { (numero: Int, valor: Double) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    val pedidosFilterByValues = pedidos.filterValues { valor ->
        valor > 50.0
    }
    println(pedidosFilterByValues)

    val pedidosFilterByKeys = pedidos.filterKeys { numero ->
        numero > 2
    }
    println(pedidosFilterByKeys)

    //Operador plus and minus para criar novos maps
    println(pedidos + Pair(6, 300.0))
    //ou
    println(pedidos + mapOf(6 to 300.0))

    //O menso representa exatamente o valor da chave que queremos remover
    println(pedidos - 5)
    //Podemos remover uma lista de chaves
    println(pedidos - listOf(1, 2, 3))

    //Atualizando valores dentro do MAP
    val pedidosMutavel = pedidos.toMutableMap()

    pedidosMutavel.put(1, 99.0)
    println(pedidosMutavel)

    pedidosMutavel.putAll(setOf(1 to 200.0, 2 to 400.0))
    println(pedidosMutavel)
    // ou
    pedidosMutavel += setOf(1 to 200.0, 2 to 400.0)

    //Remoção por chave
    pedidosMutavel.keys.remove(1)
    println(pedidosMutavel)
    //Remoção por valores
    //No caso ele irá remover o primeiro valor encontrado no caso de ter valores repetidos
    pedidosMutavel.values.remove(40.0)
    //ou
    pedidosMutavel -= 6
    println(pedidosMutavel)
}