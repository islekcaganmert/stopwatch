fun main() {
    val startTime = System.currentTimeMillis()
    var a: Long = 0
    do {
        a += 1
        println(a)
    } while (a < 100000000)
    val endTime = System.currentTimeMillis()
    val timeElapsed = endTime - startTime
    println("Time: $timeElapsed ms")
    println("Speed: ${100000000 / (timeElapsed / 1000.0)} processes per second")
}