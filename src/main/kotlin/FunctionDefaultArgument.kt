fun chooseHero(name: String = "Iron Man", power: String = "Armor") {
    println("Hero : $name")
    println("Power: $power")
}


fun main() {
    chooseHero()
    println()
    chooseHero("Scarlet Witch", "Chaos Magic")
}