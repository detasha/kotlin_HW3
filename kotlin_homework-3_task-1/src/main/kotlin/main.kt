fun main() {
    val userTime = 2000
    val result = agoToText(userTime)
    println("был(а) в сети $result")
}

fun agoToText(userTime: Int): String {
    val min = userTime / 60
    val hours = userTime / 3600

    val result = when (userTime) {
        in 0..60 -> "только что"
        in 61..60 * 60 -> {
            when (min) {
                1, 21, 31, 41, 51 -> "$min минуту назад"
                2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "$min минуты назад"
                else -> "$min минут назад"
            }
        }
        in 60 * 60 + 1..24 * 60 * 60 -> {
            when (hours) {
                1, 21 -> "$hours час назад"
                2, 3, 4, 22, 23 -> "$hours часа назад"
                else -> "$hours часов назад"
            }
        }
        in 24 * 60 * 61..2 * 24 * 60 * 60 -> "сегодня"
        in 2 * 24 * 60 * 61..3 * 24 * 60 * 60 -> "вчера"
        else -> "давно"
    }
    return result

}

