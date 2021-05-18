package br.com.gustavoantunes.teste

fun testaSet() {
    val assistiramCursoAndroid = mutableSetOf("Alex", "Gustavo", "Maria", "Filipe")
    val assistiramCursoKotlin = mutableSetOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos)
}

fun testaComportamentosEspecificos() {
    val assistiramCursoAndroid = setOf("Alex", "Gustavo", "Maria", "Filipe")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")

    //Union
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
    println(assistiramCursoAndroid union (assistiramCursoKotlin))
    println(assistiramCursoAndroid union assistiramCursoKotlin)

    //Subtract
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid.subtract(assistiramCursoKotlin))
    println(assistiramCursoAndroid subtract (assistiramCursoKotlin))
    println(assistiramCursoAndroid subtract assistiramCursoKotlin)

    //Intersect
    println(assistiramCursoAndroid.intersect(assistiramCursoKotlin))
    println(assistiramCursoAndroid intersect (assistiramCursoKotlin))
    println(assistiramCursoAndroid intersect assistiramCursoKotlin)
}