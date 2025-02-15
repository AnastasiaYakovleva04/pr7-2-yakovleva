fun main() {
    try {
        print("Введите x: ")
        val x: Double = readln().toDouble()
        print("Введите y: ")
        val y: Double = readln().toDouble()
        val q: Int
        when {
            (x>0 && y>0) -> q = 1
            (x<0 && y>0) -> q = 2
            (x>0 && y<0) -> q = 4
            (x<0 && y<0) -> q = 3
            else -> q = 0
        }
        when (q){
            0 -> println("Точка в начале координат или на координатных осях")
            else -> println("Точка в $q четверти")
        }
    }
    catch (e: NumberFormatException){
        println("Неверный формат данных")
    }
}
