
fun main() {
    val someClass = SomeClass(1,"ali")
    //val someClass = SomeClass(1)
}

class SomeClass( var count: Int = 0){

    var name: String = ""
    init {
        println("count received in init: $count")
        count += 1
        println("count after inc in init: $count")
    }

    init {
        println("count received in init2: $count")
        count += 1
        println("count after inc in init2: $count")
    }

    constructor(countV: Int, name: String) : this(countV) {
        //count += 1 not possible, val cant be assigned. this(count) is called first
        this.name = name
        println("countV received in secondary: $countV")
        println("count received in secondary: $count")
    }
}