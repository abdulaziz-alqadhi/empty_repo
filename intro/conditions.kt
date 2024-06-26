fun main() {
    println("This is Conditions Practice")
    val c =  12
    val h = c/2

    
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