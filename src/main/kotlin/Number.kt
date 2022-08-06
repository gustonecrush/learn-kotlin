fun main() {

    // integer number
    var age: Byte = 10
    var height: Int = 170
    var distance: Short = 2000
    var balance: Long = 500000000L

    // floating point number
    var value: Float = 98.98F
    var radius: Double = 234234234234.53235

    // literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binaryLiteral: Int = 0b0001

    // underscore => easily us to read number data in our program
    age = 3_0
    height = 1_7_0
    distance = 2_000
    balance = 5_00_000_000

    // conversion
    var number: Int = 100_000_000

    var byte: Byte = number.toByte()
    var short: Short = number.toShort()
    var int: Int = number.toInt()
    var long: Long = number.toLong()
    var float: Float = number.toFloat()
    var double: Double = number.toDouble()

}