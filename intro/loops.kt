fun main() {
    println("This is Loops Practice\n")
    val h = 6
    
    for (i in 1..h-1) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    for (m in h downTo 1) {
        for (k in 1..m) {
            print("*")
        }
        println()
    }
}