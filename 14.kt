fun main(args: Array<String>) {
    try {
        print("Введите число: ")
        var x: Int = readln()!!.toInt()
        print("Введите число: ")
        val y: Int = readln()!!.toInt()
        print("Введите число: ")
        val m: Int = readln()!!.toInt()
        print("Введите число: ")
        val n: Int = readln()!!.toInt()
        val dif = x-y
        val div = m%n
        when{
            dif<div -> x++
        }
        println("x = $x")
    }
    catch (e: NumberFormatException){
        println("Неверный формат данных")
    }
}