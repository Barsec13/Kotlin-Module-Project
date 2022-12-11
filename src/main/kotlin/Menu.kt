fun menu(name: String, items: Iterable<String>) {
        println(name)
        println("0. Создать")
        var quantity = 1
        items.forEach { println("${quantity++}. $it") }
        println("${quantity}. Выход")
}

fun addArchive(archives: MutableMap<String, MutableMap<String, String>>) {
    println("Введите название архива")
    val name = input(0)
    archives[name] = mutableMapOf()
}

fun addNote(notes: MutableMap<String, String>){
    println("Введите название заметки")
    val name = input(0)
    notes[name] = "Введите текст заметки"
}

fun openNote(notes: MutableMap<String, String>, number: Int){
    while (true){
        println(notes.keys.elementAt(number - 1))
        println(notes.values.elementAt(number - 1))
        println("0. Выход")

        val textNote = input(0)
        when(textNote){
            "0" -> break
            else -> notes.put(notes.keys.elementAt(number - 1), textNote)

        }
    }
}
