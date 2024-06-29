interface Person{
    fun printName(){
        println("Person.name")
    }
}

class Student (): Person {
    override fun printName(){
        println("Student.name")
    }
    fun printAge() {
        println("Student.age")
    }
}

class Teacher:Person{
    fun printSection() {
        println("Teacher.section")
    }
}

open class Animal {
    open fun move() {
        println("Animal moving")
    }
}

class Dog: Animal() {
   override fun move() {
    println("Dog Walking")
   } 
}

class Bred: Animal() {
   override fun move() {
    println("Bred Flying")
   } 
}

fun main() {
    println("This is Intefaces and Inheritace Practice")
    val s:Person = Student()
    s.printName()
    println()
    
    val a: Animal = Dog()
    a.move()
}