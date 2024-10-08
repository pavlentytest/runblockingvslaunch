import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking { // this: CoroutineScope
    launch {
        delay(2000)
        println("Task from runBlocking")
    }

    coroutineScope { // Создание coroutine scope
        launch {
            delay(5000)
            println("Task from nested launch")
        }
        println("Task from coroutine scope") // Эта строка будет выведена перед вложенным launch
    }

    println("Coroutine scope is over") // Эта строка не будет выведена пока не выполнится вложенный launch
}