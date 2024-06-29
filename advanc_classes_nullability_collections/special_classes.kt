enum class Pizza(val sizeInCm: Int) {
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30),
}

data class User(
    val name: String,
    val password: String,
    val type: UserType
)

enum class Section{
    UI,
    AUTH,
    SERVER
}

sealed class UserType
class Admin(val name: String): UserType()
class Maintinance(val name: String, val section: Section): UserType()

class MyError: Throwable("Some Message")

annotation class MyAnnotaion(val description: String)

fun main() {
    println("This is Special Classes Practice\n")
    val me = Triple("Abdulaziz", "ASDFG123", Maintinance("Name",Section.SERVER))
    try {
        MyAnnotaion("Create A User Object")
        val u = User(me.first,me.second,me.third)
        println(u)
    }
    catch(e: Throwable) {
        println("Could not create a user \nCaught Exception $e.message")
    }
}