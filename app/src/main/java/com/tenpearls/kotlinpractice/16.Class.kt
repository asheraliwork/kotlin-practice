
fun main() {

    val person = Person()
    person.setMyAge(23)
    print(person.age)
}


class Person{
    var age = 0

    fun setMyAge(myAge: Int) {
        age = myAge;
    }
}