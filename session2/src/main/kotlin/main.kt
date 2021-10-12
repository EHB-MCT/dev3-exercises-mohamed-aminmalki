fun main(){
    println("Wat is de kans?")
    println("Na 3, 2, 1 moet je een cijfer tussen 0 en 10 kiezen, " +
            "als je dezelfde cijfer heb als de computer, verlies je.")

    challengeOne()
}

fun challengeOne(){
    val numbers = mutableListOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    println(numbers)
    val computerChoice = numbers.random()
    println("3, 2, 1 computer choice $computerChoice")
    println("3, 2, 1 user choice $")

}