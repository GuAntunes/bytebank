package br.com.gustavoantunes.modelo

interface Autenticavel {
    //No caso de uma informação sensível não devemos declarar
    //na interface, pois isso irá deixar essa variável publica
    //val senha: Int
//
    fun autentica(senha: Int): Boolean
//    fun autentica(senha: Int): Boolean {
//        if (this.senha == senha) {
//            return true
//        }
//        return false
//    }

}