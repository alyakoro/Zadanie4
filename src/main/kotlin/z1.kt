fun main(args: Array<String>) {
    var i = 0
    val kmn = mapOf(1 to "камень", 2 to "ножницы", 3 to "бумагу")
    while ( i == 0) {
        println("Введите свой вариант: 1 - камень, 2 - ножницы, 3 - бумага: ")
            var pesr_vv = readln().toInt()
        val comp_vv = (1..3).random()
        println("Пользователь выбрал: " + kmn[pesr_vv])
        println("Компьютер выбрал: " + kmn[comp_vv])
        if (pesr_vv != comp_vv) {
            i++
        }
        else{
            println("Ничья!")
        }
        val itog = "$pesr_vv$comp_vv".toInt()
        val user_i = NAX_1(itog)
    }
}
private fun NAX_1 (itog: Int){
    val map = mapOf(12 to "Пользователь победил! Камень затупляет или ломает ножницы",
        13 to "Компьютер победил! Бумага обёртывает камень", 21 to
                "Компьютер победил! Камень затупляет или ломает ножницы",
        23 to "Пользователь победил! Ножницы разрезают бумагу",31 to
                "Пользователь победил! Бумага обёртывает камень",
        32 to "Компьютер победил! Ножницы разрезают бумагу")
    println(map[itog])
}
