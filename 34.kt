fun main() {
    try {
        println("Прямая:")
        print("Введите k: ")
        val k: Double = readln().toDouble()
        print("Введите b: ")
        val b: Double = readln().toDouble()
        println("Гипербола:")
        print("Введите a: ")
        val a: Double = readln().toDouble()
        when {
            (k == 0.0 && a==0.0 && b==0.0)-> println("Бесконечно много точек пересечения")
            (k == 0.0 && b==0.0)-> println("Нет точек пересечения")
            (k == 0.0) -> {
                val x = a/b
                when {
                    x.isNaN() -> println("Нет точек пересечения")
                    else -> {
                        val y = b
                        println("Одна точка пересечения:\n(${"%.3f".format(x)}; ${"%.3f".format(y)})")
                    }
                }
            }
            else -> {
                val A = k
                val B = b
                val C = -a
                val D = Math.pow(B, 2.0) - 4 * A * C
                when {
                    D < 0 -> println("Нет точек пересечения.")
                    D == 0.0 -> {
                        val x = -B / (2 * A)
                        val y = k * x + b
                        println("Одна точка пересечения:\n(${"%.3f".format(x)}; ${"%.3f".format(y)})")
                    }
                    else -> {
                        val x1 = (-B + Math.sqrt(D)) / (2 * A)
                        val x2 = (-B - Math.sqrt(D)) / (2 * A)
                        when {
                            x1 == 0.0 && x2 == 0.0 -> println("Нет точек пересечения, корни равны нулю")
                            x1.isNaN() || x2.isNaN() -> println("Нет точек пересечения.")
                            else -> {
                                val y1 = k * x1 + b
                                val y2 = k * x2 + b
                                println("Две точки пересечения:\n(${"%.3f".format(x1)}; ${"%.3f".format(y1)})\n(${"%.3f".format(x2)}; ${"%.3f".format(y2)})")
                            }
                        }
                    }
                }
            }
        }
    }
    catch (e: NumberFormatException){
        println("Неверный формат данных")
    }
}
