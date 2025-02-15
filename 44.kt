fun main() {
    try {
        print("Введите число: ")
        val n1: UInt = readln().toUInt()
        print("Введите число: ")
        val n2: UInt = readln().toUInt()
        print("Введите число: ")
        val n3: UInt = readln().toUInt()
        var min: UInt = 0u
        when {
            (n1<n2 && n1<n3) ->  min = n1
            (n2<n1 && n2<n3) ->  min = n2
            else -> min = n3
        }
        when {
            min<10u -> println("Есть хорошая группа")
            else -> println("Хорошей группы нет")
        }
    }
    catch (e: NumberFormatException){
        println("Неверный формат данных")
    }
}
