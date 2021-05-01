import java.lang.NumberFormatException

fun main() {

    val entrada: String = "1,9"
    val valor: Double? = try {
       entrada.toDouble()
    } catch (e: NumberFormatException){
        print("Problema na conversão")
        e.printStackTrace()
        null
    }

    if(valor != null){
        print("valor invalido")
    } else {
        print("valor $valor")
    }
}