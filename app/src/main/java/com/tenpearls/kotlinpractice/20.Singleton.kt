fun main() {

    println(SomeClass2.someUtilMethod())
    println(SomeClass2.someUtilMethod())
    println(SomeClass2.sum)
}

object SomeClass2 {

    // constructors are not allowed for objects also cant instantiate

    var sum: Int = 0
    //you can have init in singleton class
    init {
        sum += 1
    }

    fun someUtilMethod(): Int {
        return sum + 1
    }
}