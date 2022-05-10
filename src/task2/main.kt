package task2
fun main() {
    val two = getGen()
    println(two)
}

data class Gen(val x: Int, val y: Int)
const val SIZE_ALL = 10
fun getGen(): List<Gen> {
    val z = arrayListOf<Gen>()
    for (i in 0..SIZE_ALL){
        z.add(Gen(kotlin.random.Random.nextInt(SIZE_ALL), kotlin.random.Random.nextInt(SIZE_ALL)))
    }
    return z
}

