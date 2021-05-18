package br.com.gustavoantunes.teste
fun testaListasDistinct() {
    val assistiramCursoAndroid = listOf("Alex", "Gustavo", "Maria", "Filipe")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")
    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

    println(assistiramAmbos.distinct())
}