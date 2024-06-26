fun main() {
    println("This is Conditions Practice\n")
    val weekday = "Friday"
    val hour = 20
    val isOpen = when(weekday){
        "Monday" -> hour >= 8 && hour <= 12
        "Tuesday","Wednesday","Thursday" -> hour >= 8 && hour <= 18
        "Friday" -> hour >= 8 && hour <= 21
        "Saturday" -> hour >= 9 && hour <= 16
        "Sunday" -> hour >= 8 && hour <= 16
        else -> false
    }

    if(isOpen) {
        println("Resturant is open now")
    }else {
        println("Resturant is closed now")
    }
}