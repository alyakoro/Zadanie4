fun vC(message: String, key: String, key_2: Int): String {
    var gener = 0
    if (key_2 == 1){
        gener = 33
    }
    else{
        gener = (1..32).random()
    }
    val alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
    val messageN = message.lowercase()
    val keyN = key.lowercase().repeat(messageN.length / key.length) +
            key.lowercase().substring(0, messageN.length % key.length)
    var encryptedText = ""
    for (i in messageN.indices) {
        val messageC = messageN[i]
        val keyC = keyN[i]
        val messageCIndex = alphabet.indexOf(messageC)
        val keyCIndex = alphabet.indexOf(keyC)
        val encryptedCIndex = (messageCIndex + keyCIndex) % gener
        encryptedText += alphabet[encryptedCIndex].uppercaseChar()
    }
    return encryptedText
}
fun main() {
    print("Текст: ")
    val message = readln()
    print("Код: ")
    val key = readln()
    print("Использовать типовую таблицу (1) или генерировать случайную(2):")
        val key_2 = readln().toInt()
    val e_Message = vC(message, key,key_2)
    println("Итог: $e_Message")
}