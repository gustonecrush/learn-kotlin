fun main() {

    /*
    * range
    * → often used when we want to make ordering data in big size
    *   how to create range
    *   (1) 0..10  : range 0 - 10
    *   (2) 1..100 : range 1 - 100
    * → is not like array, where we can access to index
    * → the function of this is when u want to loop something so it is more useful in looping than storing data
    *
    * operations
    * (1) count()
    * (2) contains(value)
    * (3) first
    * (4) last
    * (5) step
    * */

    val range = 0..1000

    println(range)
    println(range.count())
    println(range.contains(1000))
    println(range.first)
    println(range.last)
    println(range.step)

    println()

    val rangeDown = 1000 downTo 1 step 5

    println(rangeDown)
    println(rangeDown.count())
    println(rangeDown.contains(1000))
    println(rangeDown.first)
    println(rangeDown.last)
    println(rangeDown.step)

}