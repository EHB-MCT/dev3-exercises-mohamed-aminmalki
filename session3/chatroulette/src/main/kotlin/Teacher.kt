class Teacher (override val name: String): Person(name) {
    fun talk(){
        Fact()
    }
    fun Fact(){
       println("text")
    }
}