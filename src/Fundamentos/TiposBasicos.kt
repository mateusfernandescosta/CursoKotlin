package Fundamentos

fun main(args: Array<String>) {
    val num1: Byte = 127
    val num2: Short = 32_767
    val num3: Int = 2_146_483_646
    val num4: Long = 9_223_372_036_854_775_807

    val num5: Float = 3.14F
    val num6: Double = 3.14

    val char: Char = '-'

    val bool: Boolean = true

    println(listOf(num1, num2, num3, num4, num5, num6, char, bool))

    println(num3 is Int)
}