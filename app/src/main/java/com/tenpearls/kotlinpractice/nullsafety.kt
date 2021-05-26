fun main() {
    listWithNull()
}
fun someMethod4() {
    val a = "Kotlin"
    val b: String? = null

    // a.length because its type safety, b?.length is because b can be null.
    // ?. is useful in chains like country?.city?.area?.street?.house?.number
    // this reduces null safety checks like in java
    println(a.length)
    println(b?.length)
}
    fun listWithNull() {
        val listWithNulls: List<String?> = listOf("Kotlin", null)
        for (item in listWithNulls) {
            item?.let { println(it) } // prints Kotlin and ignores null
        }
    }

fun someMethod5() {

    // ?: is elvis operator
  //first operand ?: second operand
    //If first operand isn't null, then it will be returned. If it is null, then the second operand will be returned.

    val b : String? = null
    val l = b?.length ?: -1

    //not needed here as its null safe
    val c : String = "abc"
    val len = c.length ?: 2

    //When you have a nullable reference b, you can say "if b is not null, use it, otherwise use some non-null value":
}

fun someMethod6() {
    val b: String? = null
    val l = b!!.length

    //converts any value to a non-null type and throws an exception if the value is null
    // this will throw NPE if b is null
}

fun someMethod7() {
    //Safe casts  as?
    //Regular casts may result into a ClassCastException if the object is not of the target type. Another option is to use safe casts that return null if the attempt was not successful:
    val a : Any = "3"
    val aInt: Int? = a as? Int
    println(aInt)
}