fun main(args: Array<String>) {
    try {
        print("Введите k: ")
        val k: Double = readln()!!.toDouble()
        print("Введите a: ")
        val a: Double = readln()!!.toDouble()
        print("Введите b: ")
        val b: Double = readln()!!.toDouble()

        val A = k
        val B = b
        val C = -a
        val discriminant = B * B - 4 * A * C

        when {
            discriminant > 0 -> {
                val x1 = (-B + Math.sqrt(discriminant)) / (2 * A)
                val x2 = (-B - Math.sqrt(discriminant)) / (2 * A)
                val y1 = k * x1 + b
                val y2 = k * x2 + b
                println("Две точки пересечения:")
                println("Точка 1: ($x1, $y1)")
                println("Точка 2: ($x2, $y2)")
            }
            discriminant == 0.0 -> {
                val x = -B / (2 * A)
                val y = k * x + b
                println("Одна точка пересечения:")
                println("Точка: ($x, $y)")
            }
            else -> println("Нет точек пересечения.")
        }
    }
    catch (e: NumberFormatException){
        println("Неверный формат данных")
    }
}