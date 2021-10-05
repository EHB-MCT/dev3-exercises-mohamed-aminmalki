fun main(){
    println("hello world")
    val classmates = arrayOf("Rob", "Yassin", "Cossima", "Tuur", "Amin")
    for(classmate in classmates) {
        greet(classmate)
    }
}

fun greet(name: String){
        println("Hello $name")
}