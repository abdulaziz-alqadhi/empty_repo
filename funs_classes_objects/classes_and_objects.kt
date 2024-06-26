class Grade(val points: Double, val studentId: Int, val subjectId: Int)

class Teacher(val name: String, val surname: String, val birthday: String, val status: String)

class Subject(val id: Int, val name: String, val teacher: Teacher, val isObligatory: Boolean = true)

class Student(
    val id: Int, 
    val name: String, 
    val surname:String, 
    var subjects: MutableList<Subject> = mutableListOf(Subject(1, "Data Structure",Teacher("Mohamed","Alsauti","1976","active")))
) {    
    fun addSubject(subject: Subject) {
        this.subjects.add(subject)
    }
    fun printAllSubjects() {
        for (i in this.subjects) {
            print("Subject ID: ${i.id}, ")
            println()
            print("Subject Name: ${i.name} ")
            println()
            print("Teacher Name: ${i.teacher.name} ")
            println()
            print("is Obligatory: ${i.isObligatory} ")
            println()
            println()
        }
    }
}

fun main() {
    val student = Student(1,"abdulaziz","alqadhi")
    println(student.name)
    val subject = Subject(2,"OOB",Teacher("Amirah","Aladimi","1975","active"),false)
    student.addSubject(subject)
    println()
    println()
    student.printAllSubjects()
    
}