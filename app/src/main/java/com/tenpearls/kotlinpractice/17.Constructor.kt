fun main() {

    val person2 = Person3("ash", 23)
    print(person2.detail)

}

class Person2(private val myAge: Int) {
    var age: Int = myAge
}

class Person3(private val age: Int = 20) {
    var myAge = age
    var name : String = ""
    constructor( name: String, ageValue: Int) : this(ageValue) {
        this.name = name
        myAge = ageValue
    }

    var detail = "age is $age and myAge is $myAge"

}
class Person4{

   var name: String = ""
   var age: Int = 0
   var gender: String = ""

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, gender: String) {
        this.name = name
        this.age = age
        this.gender = gender
    }
}