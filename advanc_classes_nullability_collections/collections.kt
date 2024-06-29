data class UserData (val name: String)

class User (val name: String)

fun main() {
    println("This is Collections Practice\n")

    val list: List<String> = listOf("a","b","c","d")
    val mutableList: MutableList<String> = mutableListOf("e","f","g","h")
    val set: Set<String> = setOf("a","b","c","d")
    val mutableSet: MutableSet<String> = mutableSetOf("e","f","g","h")
    val map: Map<String,Int> = mapOf("a" to 1,"b" to 2,"c" to 3,"d" to 4)
    val mutableMap: MutableMap<String,Int> = mutableMapOf("e" to 1,"f" to 2,"g" to 3,"h" to 4)
    
    //  Lists
    println("\nusing list\n")
    println(list + "e")
    println(list.size)
    println(list.isEmpty())
    
    println(list[0])
    println(list[1])
    println(list[2])

    println(list.contains("a"))
    println(list.contains("r"))

    println("a" in list)
    println("r" in list)

    for (letter in list) {
        print("$letter,")
    }

    mutableList.add("e")
    println("\n$mutableList")
    mutableList.remove("b")
    println(mutableList)
    mutableList[1] = "w"
    println(mutableList)

    //  Sets
    println("\nusing set\n")
    println(set + "e")
    println(set + "e")
    println(set.size)
    println(set.isEmpty())

    println(set.contains("a"))
    println(set.contains("r"))

    println("a" in set)
    println("r" in set)

    for (letter in set) {
        print("$letter,")
    }

    mutableSet.add("e")
    println("\n$mutableSet")
    mutableSet.remove("b")
    println(mutableSet)
    val userSet = setOf(User("User1"),User("User2"))
    println(userSet)
    val userMutableSet = mutableSetOf(User("User1"),User("User2"))
    println(userMutableSet)

    //  Maps
    println("\nusing map\n")
    println(map + mapOf("e" to 5))
    println(map.size)
    println(map.isEmpty())
    
    println(map["a"])
    println(map["b"])
    println(map["c"])

    println(map.contains("a"))
    println(map.contains("r"))

    println("a" in map)
    println("r" in map)

    for (letter in map) {
        print("$letter,")
    }

    mutableMap.put("e",6)
    println("\n$mutableMap")
    mutableMap["c"] = 0
    println(mutableMap)
    mutableMap.remove("b")
    println(mutableMap)
}