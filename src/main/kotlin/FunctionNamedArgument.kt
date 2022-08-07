fun fullName(firstName: String,
             middleName: String,
             lastName: String) {
    println("Hello $firstName $middleName $lastName")
}

fun main() {

    /*
    * Named Argument is feature where we can call our parameter name
    * when calling the function, so we don't have to know each
    * position of our function parameter
    * */

    fullName(firstName = "Andelle",
             middleName = "Gianzra",
             lastName = "Basae")
}