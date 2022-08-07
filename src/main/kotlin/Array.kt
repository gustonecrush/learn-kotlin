fun main() {

    /*
    * Array
    * → is collection of data with same data type, represent with "Array" keyword
    * → if u want to access array data, u have to use index and started with 0
    *
    * operation in array
    * (1) size, to get length of array
    * (2) get(index), to get data in index n
    * (3) [index], another way to get data in index n
    * (4) set(index, value), to set data in index n
    * (5) [index] = value, another way to set data in index n
    *
    * nb: array can not be null, because array data type has been declared before
    *     you can use
    *       - val heroes: Array<String?> = arrayOfNulls(size: 5)
    *     and you have to assign the value one by one
    *
    * ! : the size is not dynamic, so we can not add and remove size in array
    * */

    val heroes: Array<String> = arrayOf("Captain America", "Scarlet Witch", "Spider-Man")
    val powers: Array<Int>    = arrayOf(150, 200, 100)
    val health: Array<Int>    = arrayOf(100, 150, 90)

    println(heroes.size)
    println(heroes[0])
    println(heroes.get(1))
    heroes.set(2, "Black Panther")

    heroes[1] = "Black Widow"
    println(heroes[1])
    println(heroes[2])

    val villains: Array<String?> = arrayOfNulls(5)
    println(villains[0])

}