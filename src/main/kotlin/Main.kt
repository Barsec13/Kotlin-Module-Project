fun main() {

    val dataBase = Archive()
    val archives = dataBase.archives

    while (true) {
        menu("Архив", archives.keys)

        val inputArchive = input(archives.size + 1).toInt()

        when (inputArchive) {
            0 -> addArchive(archives)
            archives.size + 1 -> break
            else -> while (true) {

                val notes = archives[archives.keys.elementAt(inputArchive - 1)]

                notes?.let { menu("Заметки", it.keys) }

                val inputNote = input(
                    notes?.size!! + 1).toInt()

                when (inputNote) {
                    0 -> addNote(notes)
                    (notes.size + 1) -> break
                    else -> openNote(notes, inputNote)
                }
            }
        }
    }
    println("Программа завершила работу")
}

