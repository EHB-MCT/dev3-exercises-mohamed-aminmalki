import java.util.ArrayList

fun main(){
    println("Wat is de kans?")
    println("Na 3, 2, 1 moet je een cijfer tussen 0 en 10 kiezen, " +
            "als je dezelfde cijfer heb als de computer, verlies je.")

    challengeOne()
}

fun challengeOne(numbers: Array<String>): String?{
    val numbers = setOf(1..10)
    println(numbers)
    val computerChoice = numbers.random()
    println("3, 2, 1 computer choice $computerChoice")
    println("3, 2, 1 user choice $")

    var userChoice: String?
    do {
        println("Write a number from 0 to 10")
        userChoice = readLine()
    }while(!numbers.contains(userChoice))

    return userChoice
}

fun challengeTwo(){

}