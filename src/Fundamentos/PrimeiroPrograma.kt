package Fundamentos

fun calcAreaCirculo(raio: Double = 2.0) : Double{
    return raio*raio*Math.PI
}

/**
 * Main classe principal
 * @param args Lista de parâmetros passados por linha de comando
 */
fun main(args: Array<String>) {
    println("Meu primeiro programa em Kotlin!")

    var a: Int
    var b = 8 //O tipo é inferido (Int), mas o Kotlin é fortemente tipado

    a = 7
    println("a vezes b = " + a*b)

    val raio = 4.3 //O tipo é inferido (Double)
    var area = calcAreaCirculo(raio)
    println("A área da circunferência de raio " + raio + "m é " + area + "m2")

    area = calcAreaCirculo()
    println("A área para o raio default é " + area)
}