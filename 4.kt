fun main() {
    try {
        print("Введите число: ")
        val a: Double = readln().toDouble()
        print("Введите число: ")
        val b: Double = readln().toDouble()
        print("Введите число: ")
        val c: Double = readln().toDouble()
        var max: Double = a
        var min: Double = a
        when {
            (b>a && b>c) -> max = b
            (c>b && c>a) -> max = c
        }
        when {
            (b<a && b<c) ->  min = b
            (c<b && c<a) -> min = c
        }
        val p = (max + min)/2
        println("p = $p")
    }
    catch (e: NumberFormatException){
        println("Неверный формат данных")
    }
}
