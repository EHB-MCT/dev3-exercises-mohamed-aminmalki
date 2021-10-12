fun main(){
    val options = arrayOf("schaar", "steen", "papier")
    val computerChoice = options.random()
    val userChoice = getUserChoice(options)

    println("computer picked $computerChoice")
    println("user picked $userChoice")

    determineWinner(computerChoice, userChoice)
}

fun getUserChoice(options: Array<String>): String?{
    var userChoice: String?
    do{
        println("Make your choice: rock - paper or scissors")
        userChoice = readLine()
    }while (!options.contains(userChoice))

    return userChoice
}

fun determineWinner(computerChoice: String, userChoice: String?){

}