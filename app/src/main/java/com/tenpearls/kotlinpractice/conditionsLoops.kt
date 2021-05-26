
fun main() {
    someMethod3()
}

//In Kotlin, if is an expression: it returns a value. Therefore, there is no ternary operator (condition ? then : else) because ordinary if works fine in this role.
fun someMethod3() {
    var a = 3
    var b = 6
    var max = a
    if (a > b) max = b
    println(max)

// As expression
//val max = if (a > b) a else b
}

 fun ifBranch() {
     //Branches of if branches can be blocks. In this case, the last expression is the value of a block:
     var a = 3
     var b = 6
     val max = if (a > b) {
         print("Choose a")
         a
     } else {
         print("Choose b")
         b
     }
 }


    fun xInRange(x: Any) {
        var validNumbers = listOf(1,2,3)
        when (x) {
            in 1..10 -> print("x is in the range")
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }
    // when returns boolean
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("prefix")
    else -> false
}

//Check if a collection contains an object using in operator. used instead of if - else if chain
fun whenMethod2() {
    val items = setOf("apple","banana")
    when {
        "apple" in items -> println("apple found")
        "banana" in items -> println("banana found")
        else -> "no fruit found"
    }
}

//can use else if here but compiler will tell instead of cascade if use when.
fun whenMethod4() {
    //Branches of if branches can be blocks. In this case, the last expression is the value of a block:
    var validNumbers = listOf(1,2,3)
    var a = 3
    var b = 6
    val max = when {
        a in validNumbers -> {
            print("Choose a")
            a
        }
        b in validNumbers -> {
            print("Choose a")
            a
        }
        else -> {
            print("Choose b")
            b
        }
    }
}

fun someMethod() {
    var list = listOf("apple","banana")
    for (item in list) {
        println(item)
    }
    //  for (x in 1..5)     iterate over a range
    // for (x in 1..10 step 2)  print 13579
    //  for (x in 9 downTo 0 step 3) 9630
}

fun fooLabel() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach // local return to the caller of the lambda - the forEach loop
        print(it)
    }
    print(" done with implicit label")
}
