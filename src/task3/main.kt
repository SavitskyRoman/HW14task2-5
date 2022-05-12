package task3

abstract class Parents {
    abstract val name: String
    abstract val surname: String
    abstract var age: Int
    abstract fun go()
}

class Sun(override val name: String, override val surname: String, override var age: Int) : Parents() {
    override fun go() {
        println("go to school")
    }
}

class Daughter(age: Int) : Parents() {
    override val name: String
        get() = "Anya"
    override val surname: String
        get() = "Ivanov"
    override var age = age
        set(value) {
            if (value > 0) field = value
        }

    override fun go() {
        println("go home")
    }

}

fun main() {
    val onePerson = Sun("Ivan", "Ivanov", 10)
    val twoPerson = Daughter(20)
    onePerson.go()
    twoPerson.go()
}