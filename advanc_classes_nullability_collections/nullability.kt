data class Student(val name: String, var id: Int, var grade: Double)

val students = listOf(
    Student("A",1,95.0),
    Student("B",2,85.0),
    Student("A",3,75.0),
)

fun main() {
    println("This is Nullability Practice\n")

    println("Enter Student's ID")
    val id = readln().toInt()
    println(searchInStudents(id)?:"The student is not found")
}

fun searchInStudents(id: Int): Student? {
    return students.find{ it.id==id }
}