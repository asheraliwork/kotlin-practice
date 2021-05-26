fun main() {

    val addition2 = Addition2(1,2)
    println(addition2.add())
    val addition3 = Addition3(3,4,5)
    println(addition3.add())
}

// by default all classes are final. to allow inheritance declare class as open, for inheritance. also method which is to inherited
open class BaseAddition(val a: Int, val b: Int) {

    open fun add() = a.plus(b)
}

class Addition2(private val x: Int, private val y: Int): BaseAddition(x, y) {
}

class Addition3(private val x: Int, private val y: Int, val z: Int): BaseAddition(x, y) {

    override fun add(): Int = x.plus(y).plus(z)
}