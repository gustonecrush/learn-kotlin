fun printHello(name: String? = null) : Unit {
    if (name == null) {
        println("Hello Bro")
    } else {
        println("Hello $name")
    }
}

fun main() {
    printHello()
}