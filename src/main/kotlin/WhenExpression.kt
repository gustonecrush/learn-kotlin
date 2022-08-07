fun main() {

    val finalExam = 'C'

    // When Expression
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Ups!")
    }

    // When Expression Multiple Option
    when (finalExam) {
        'A', 'B', 'C' -> println("Pass")
        else -> {
            println("Not Pass")
        }
    }

    // When Expression In
    val passValues = arrayOf('A', 'B', 'C')
    when(finalExam) {
        in passValues -> println("Pass")
        !in passValues -> println("Try Again")
    }

    // When Expression Is
    val name = "Farhan"
    when(name) {
        is String -> println("This is a string")
        !is String -> println("This is not a string")
    }

    // When sebagai pengganti If Else
    val examValue = 90
    when {
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try again next year")
    }

}