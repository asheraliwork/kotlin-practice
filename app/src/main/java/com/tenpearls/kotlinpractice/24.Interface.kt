fun main() {

    val samsung: SmartPhone = Samsung()
    println(samsung.getScreenSize() + samsung.getBattery() + samsung.getOS())
    val xiaomi: SmartPhone = Xiaomi()
    println(xiaomi.getScreenSize() + xiaomi.getBattery() + xiaomi.getOS())
}

interface SmartPhone {
    fun getScreenSize(): String
    fun getBattery(): String
    fun getOS(): String = "Android"
}

// no brackets in SmartPhone() like in abstract class since its implementation while it was abstraction in abstraction class
class Samsung: SmartPhone {
    override fun getScreenSize(): String {
        return "6.3Inch"
    }

    override fun getBattery(): String {
        return "4000mah"
    }

}

class Xiaomi: SmartPhone {
    override fun getScreenSize(): String {
        return "6.6nch"
    }

    override fun getBattery(): String {
        return "5500mah"
    }

}