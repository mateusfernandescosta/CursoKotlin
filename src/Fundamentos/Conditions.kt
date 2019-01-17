package Fundamentos

fun main(args: Array<String>) {
    var nota : Double = 6.5
    var situacao : String = "em situação inválida"

    if(nota in 7.0..10.0)
        situacao = "Aprovado"
    else if(nota in 5..6)
        situacao = "de Final"
    else if(nota in 0..4)
        situacao = "Reprovado"

    println("O aluno esta $situacao!")

    when(nota){
        in 7.0..10.0 -> println("Vamos comemorar!")
        in 5..6 -> println("Foi por pouco!")
        in 0..4 -> println("Não!!!!!")
        else -> println("Mas como assim?")
    }
}