import java.util.*

fun input(quantity: Int): String {
    var text: String

    while (true) {
        text = Scanner(System.`in`).nextLine()
        if (text.isBlank()) {
            println("Вы ничего не ввели")
        } else {
            if (quantity != 0)
                while (true) {
                    if (text.toIntOrNull() != null && text.toInt() in 0..quantity) {
                        break
                    } else {
                        println("Введите цифру из списка для выбора пункта")
                        text = Scanner(System.`in`).nextLine()
                    }
                }
            break
        }
    }
    return text
}