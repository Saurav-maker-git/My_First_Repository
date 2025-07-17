//fun tempcheck(temp : Int):String{
//    var tell = when {
//        temp < 0 -> "its Freezing"
//        temp in 0..15 -> "Its cold"
//        temp in 15..25 -> "Its mild"
//        temp > 25 -> "Its hot"
//        else -> "Uknown"
//    }
//    return tell
//}
//fun main(){
//    var result = tempcheck(12)
//    println(result)
//}
fun getEmoji(unicode: Int): String {
    return String(Character.toChars(unicode))
}

fun main() {
    val fireEmoji = getEmoji(0x1F525) // 🔥
    val temperature = -12
    val message = "Temperature: $temperature°C $fireEmoji"

    println(message)
}