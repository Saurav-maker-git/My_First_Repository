fun main() {
    var i = check(2)
    println(i)
}
fun check(num : Int) : String{
    var result = when {
        num % 2 == 0 -> "Even"
        num < 0 -> "Negative"
        num == 0 -> "Zero"
        isPrime(num) -> "Prime"
        else -> "Odd"
    }
    return result
}
fun isPrime(n : Int) : Boolean{
    if(n < 1) return false

    for (i in 2 until n) {
        if (n % i == 0) return false
    }
        return true
}
