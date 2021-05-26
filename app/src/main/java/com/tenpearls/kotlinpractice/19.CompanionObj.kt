fun main() {

    println(SomeClass1.getSum(1,2))
}

class SomeClass1 {

    // not accessible in companion obj
    var age = 2


    //used instead of static in JAVA
    companion object {
        fun getSum(x: Int, y: Int) = x + y

    }
}