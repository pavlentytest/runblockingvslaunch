import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// https://www.dhiwise.com/post/kotlin-runblocking-vs-launch-a-guide-to-optimal-coroutine

fun main2() = runBlocking {
    println("Start of runBlocking")
    delay(5000) // Simulate some work
    println("End of runBlocking")
}
fun main() = runBlocking {
    launch {
        println("Start of launch")
        delay(5000) // Simulate background work
        println("End of launch")
    }
    println("Code outside launch")
}