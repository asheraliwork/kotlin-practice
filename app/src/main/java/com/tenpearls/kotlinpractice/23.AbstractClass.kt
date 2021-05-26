fun main() {

    val civic = Civic()
    val picanto = Picanto()

    println(getCarHorsePower(civic))
    println(getCarHorsePower(picanto))

    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            // ...
        }

        override fun sleep() { // ...
        }
    }
    myObject.doSomething()

}

    fun getCarHorsePower(car: Car): Int {
        return car.getHorsepower()
    }

abstract class Car{

    abstract fun getHorsepower(): Int;
}

class Civic: Car() {

    override fun getHorsepower() : Int {
        return 123
    }
}

class Picanto: Car() {

    override fun getHorsepower() : Int {
        return 103
    }



}

abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}