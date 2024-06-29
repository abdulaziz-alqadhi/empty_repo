fun moreThanSimpol(h: Int) {
    for (i in 1..h) {
        val numberOfStars = i * 2
        for (j in 1..numberOfStars) {
            print("*")
        }
        val numberOfSpaces = h * 2 - numberOfStars
        for (j in numberOfSpaces downTo 1) {
            print(" ")
        }
        println()
    }

    for (i in h-1 downTo 1) {
        val numberOfStars = i * 2
        for (k in 1..numberOfStars) {
            print("*")
        }
        val numberOfSpaces = i * 2 - numberOfStars
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        println()
    }

    println("--------------------------")
}

fun lessThanSimpol(h: Int) {
    for (i in 1..h) {
        val numberOfSpaces = (h - i) * 2
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = i * 2
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    for (i in 1..h) {
        val numberOfSpaces = i * 2
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = (h - i) * 2
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    println("--------------------------")
}

fun upperSimpol(h: Int) {
    for (i in 1..h) {
        
        val numberOfSpaces = h - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    println("--------------------------")
}

fun downSimpol(h: Int) {
    for (i in h downTo 1) {

        val numberOfSpaces = h - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        
        val numberOfStars = i * 2 - 1
        for (j in numberOfStars downTo 1) {
            print("*")
        }
        println()
    }

    println("--------------------------")
}

fun upDownSimpol(h: Int) {
    for (i in 1..h) {
        
        val numberOfSpaces = h - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    for (i in h downTo 1) {

        val numberOfSpaces = h - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        
        val numberOfStars = i * 2 - 1
        for (j in numberOfStars downTo 1) {
            print("*")
        }
        println()
    }

    println("--------------------------")
}

fun downUpSimpol(h: Int) {
    for (i in h downTo 1) {

        val numberOfSpaces = h - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        
        val numberOfStars = i * 2 - 1
        for (j in numberOfStars downTo 1) {
            print("*")
        }
        println()
    }

    for (i in 1..h) {
        
        val numberOfSpaces = h - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = i * 2 -1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    println("--------------------------")
}

fun moreAndLessThanSimpol(h: Int) {
    for (i in 1..h) {
        val numberOfStarsBefore = i * 2
        for (j in 1..numberOfStarsBefore) {
            print("*")
        }
        val numberOfSpacesAfter = h * 2 + 1 - numberOfStarsBefore
        for (j in numberOfSpacesAfter downTo 1) {
            print(" ")
        }
        val numberOfSpacesBefore = h * 2 - numberOfStarsBefore
        for (j in 1..numberOfSpacesBefore) {
            print(" ")
        }
        val numberOfStarsAfter = i * 2
        for (j in 1..numberOfStarsAfter) {
            print("*")
        }
        println()
    }

    for (i in h-1 downTo 1) {
        val numberOfStars = i * 2
        for (k in 1..numberOfStars) {
            print("*")
        }
        val numberOfSpaces = h * 2 - numberOfStars
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfSpacesBefore = h * 2 + 1 - numberOfStars
        for (j in 1..numberOfSpacesBefore) {
            print(" ")
        }
        val numberOfStarsAfter = i * 2
        for (k in 1..numberOfStarsAfter) {
            print("*")
        } 
        println()
    }

    println("--------------------------")
}

fun main() {
    println("This is Loops Practice\n")
    val h = 6
    
    moreThanSimpol(h)
    
    lessThanSimpol(h)

    moreAndLessThanSimpol(h)
    
    downSimpol(h)

    upperSimpol(h)

    upDownSimpol(h)

    downUpSimpol(h)

}