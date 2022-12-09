import java.util.*
fun input(quantity: Int): String{
    var text: String

    while(true){
        text = Scanner(System.`in`).nextLine()
        if (text.isNullOrBlank()){
            println("Вы ничего не ввели")
        }
        else {
            if (text.toIntOrNull() != null)
                while (true){
                    if (text.toInt() <= quantity && text.toInt() >= 0){
                        break
                    }
                    else {
                        println("Введите цифру из списка для выбора пункта")
                    }
                }
            break
        }
    }

    return text
}