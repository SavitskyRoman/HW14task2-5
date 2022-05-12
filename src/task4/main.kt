package task4

abstract class Owner {
    abstract val a: Int
    abstract val b: Int
}

class Util(override val a: Int, override val b: Int) : Owner() {
    fun sum() = a + b
}

fun main() {
    val x = Util(3, 5)
    println(x.sum())
}