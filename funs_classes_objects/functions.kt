fun printStars(num: Int) {
    for (i in 1..num) {
        print("*")
    }
    println()
}

fun ascendingTriangle(hight: Int) {
    for (stars in 1..hight) {
        printStars(stars)
    }
}

fun descendingTriangle(hight: Int) {
    for (stars in hight downTo 1) {
        printStars(stars)
    }
}

fun isoscelesTriangle(width: Int) {
    ascendingTriangle(width - 1)
    descendingTriangle(width)
}

fun triangleArea(width: Int, height: Double = 11.0): Double = height * width / 2

fun factorial(number: Int):Int {
    if ((number == 1)||(number == 0)) {
        return 1
    }
    return factorial(number - 1) * number
}


fun main() {
    println("\nExamples of Functions with parameters and results\n")
    val width = 6
    println("Trinagle Area is ${triangleArea(width = width)}\n")
    isoscelesTriangle(width)

    println("\nRecursion Exercise\n")
    println(factorial(6))
}