
abstract class Dwelling(private var residents: Int) {

    abstract val buildingMaterial: String

    abstract val capacity: Int

    //private var residents: Int

    fun hasRoom(): Boolean {
        return residents < capacity
    }
}