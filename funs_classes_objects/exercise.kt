class Player(val name: String, val surname: String) {
    fun fullName() = "${name + " " + surname}"
    var totalScore = 0
    var personalBestScore = 0
    fun play(lvlScore: Int) {
        this.totalScore += lvlScore
        if(personalBestScore < lvlScore) this.personalBestScore = lvlScore
    }
}

fun main() {
    //  initalise player objects
    val player1 = Player("abdulaziz", "alqadhi")
    val player2 = Player("khaled", "amin")
    //  create working variables
    var lvlScore = 0

    //  level 1 

    //  player 1
    lvlScore = 12
    player1.play(lvlScore)
    //  player 2 
    lvlScore = 34
    player2.play(lvlScore)
    
    //  level 2 

    //  player 1
    lvlScore = 56
    player1.play(lvlScore)
    //  player 2 
    lvlScore = 78
    player2.play(lvlScore)
    
    //  level 3 

    //  player 1
    lvlScore = 99
    player1.play(lvlScore)
    //  player 2 
    lvlScore = 10
    player2.play(lvlScore)
    
    //  conditional check using an if statement to determine the winer

    fun checkWiner(): Player {
        if(player1.totalScore > player2.totalScore){
            return player1  
        }
        return player2
    }

    val winer = checkWiner()

    //  print the winer and his total scores and personal best score

    println("Winer is ${winer.fullName().uppercase()} with a total score of ${winer.totalScore} and a personal best score of ${winer.personalBestScore}")
}