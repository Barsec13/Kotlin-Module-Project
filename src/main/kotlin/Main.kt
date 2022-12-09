fun main() {

        val dataBase = Archive()
        val archives = dataBase.archives


        while (true){
                menu("Архив", archives.keys)

                val inputArchive = input( archives.size + 1).toInt()

                when (inputArchive) {
                        0 -> addArchive(archives)
                        archives.size + 1 -> break
                        else -> while(true){

                                archives[archives.keys.elementAt(inputArchive - 1)]?.
                                let { menu("Заметки", it.keys) }

                                val inputNote = input(
                                        archives[archives.keys.elementAt(inputArchive - 1)]?.size!! + 1).toInt()

                                when (inputNote){
                                        0 -> archives[archives.keys.elementAt(inputArchive - 1)]?.let {addNote(it)}
                                        (archives[archives.keys.elementAt(inputArchive - 1)]?.size!! + 1) -> break
                                        else ->archives[archives.keys.elementAt(inputArchive - 1)]?.let {
                                                openNote(it, inputNote)
                                        }
                                }
                        }
                }
        }
        println("Программа завершила работу")
}

