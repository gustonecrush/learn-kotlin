const val APP = "learn kotlin"
const val VERSION = "0.0.1"

fun main() {

    /*
    * variable is used to store data
    * variable supports two types of variable (1) mutable (2) immutable
    *   (1) mutable, u can use "var" keyword and u can change or edit variable with same type
    *   (2) immutable, u can use "val" keyword
    *
    * eg. var name: String = data
    *     val name: String = data
    * */

    var productName: String = "Hot Toys Marvel"
    var productPrice: Int = 50_000
    productName = "Choco Chrunch"

    val productID: String = "pro101082022"

    /*
    * variable in kotlin "must" be declared and initialized before
    * so, it will be error. you can create variable null with "Nullable"
    *
    * var productName: String?
    *
    * nb: but it is not recommended to make ur variable to be nullable, it does but just for final way
    *     if you want to access java's code in kotlin
    * */

    var productReleased: String? = "Jul, 3 2022"
    productReleased = null

    // error because of nullable
    // println(productReleased.length)

    // how to access with correct way
    println(productReleased?.length)

    /*
    * constant is immutable, is needed when u access globally ( u can access anywhere, and will be implemented more in OOP )
    * constant is using with UPPER_CASE in naming variable
    * */

    println("Welcome to $APP version $VERSION")

}