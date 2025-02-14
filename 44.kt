fun main(args: Array<String>) {
    try {
        print("Введите число: ")
        var n1: Int = readln()!!.toInt()
        print("Введите число: ")
        val n2: Int = readln()!!.toInt()
        print("Введите число: ")
        val n3: Int = readln()!!.toInt()
        var min: Int =0
        when {
            (n1<n2 && n1<n3) ->  min = n1
            (n2<n1 && n2<n3) ->  min = n2
            (n3<n2 && n3<n1) -> min = n3
        }
        when {
            min<10 -> println("Есть хорошая группа")
            else -> println("Хорошей группы нет")
        }

    }
    catch (e: NumberFormatException){
        println("Неверный формат данных")
    }
}