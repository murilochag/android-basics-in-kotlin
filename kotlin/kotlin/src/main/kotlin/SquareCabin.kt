
class SquareCabin(residents: Int): Dwelling(residents) {

    override val buildingMaterial = "Wood"

    override val capacity = 6

}

fun main() {
    val squareCabin = SquareCabin(3)

    println("\nSquare Cabin\n============")
    println("Capacity: ${squareCabin.capacity}")
    println("Material: ${squareCabin.buildingMaterial}")
    println("Has room? ${squareCabin.hasRoom()}")

    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
    }
}