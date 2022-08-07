fun main() {

    /*
    * Math Operators
    * (1) +
    * (2) -
    * (3) *
    * (4) /
    * (5) %
    * */

    var result1 = 10.0 / 3.0
    println(result1)

    var result2 = 2 + 10 * 3
    println(result2)

    /*
    * Augmented Assignments
    * (1) +=
    * (2) -=
    * (3) *=
    * (4) /=
    * (5) %=
    * */

    result2 += 45
    println(result2)

    /*
    * Unary Operator
    * (1) ++
    * (2) --
    * (3) -
    * (4) +
    * (5) !, just for boolean
    * */

    println(++result2) // or result2++
    println(--result2) // or result2--
    println(-result2)
    println(+result2)
    println(!true)

}