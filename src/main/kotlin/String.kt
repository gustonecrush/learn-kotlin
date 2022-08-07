fun main() {

    var firstName: String = "Farhan"
    var lastName: String = "Augustiansyah"
    var fullName: String = firstName + lastName // concatenation example
    var address: String = """
        Street Papaya,
        Province South Sumatera
        Country Indonesia
    """.trimIndent()

    var address2: String = """
        |Street Papaya,
        |Province South Sumatera
        |Country Indonesia
    """.trimMargin() // char is not only | you can use every char then parse in parameter of trimMargin eg. trimMargin("<")

    fullName = "$firstName $lastName Tobing"

    var desc: String = "$fullName consists of ${fullName.length} chars"

    println(fullName)
    println()
    println(address)
    println()
    println(address2)
    println()
    println(desc)

}