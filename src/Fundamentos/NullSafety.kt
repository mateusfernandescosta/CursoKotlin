package Fundamentos

fun main(args: Array<String>) {
    val a : Int = 8
    val b : Int? = null
    println("Existe tratamento para valor nulo ${b?.dec()} ${a?.dec()}")

    var c : String? = null;
    println("Com o operador elvis é possível apresentar um ${c ?: "Valor Default"}")
    c = "Valor Preenchido"
    println("Com o operador elvis é possível apresentar um ${c ?: "Valor Default"}")

    println("Mas é possível forçar o erro:")
    println(b!!.dec())
}