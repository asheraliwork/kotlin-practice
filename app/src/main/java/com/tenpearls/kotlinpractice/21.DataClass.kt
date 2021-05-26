fun main() {

    val someClass = SomeClass3("Asher")
    println(someClass.name)
    println(someClass.age)
    println(someClass)
    val someClass1 = SomeClass3("Ali")
    println(someClass1.name)
    println(someClass1.age)
    println(someClass1)

    // set Name exactly same then this will become true as all fields will be same in value
    someClass1.setMyName("Asher")
    println(someClass1 == someClass)
}

data class SomeClass3(var name: String) {
    var age: Int = 23

    init {
        age = 24
    }

    fun setMyName(name : String) {
        this.name = name
    }
}