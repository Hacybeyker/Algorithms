package hackerrank.birthday_cake_candles

fun main() {
    val data = arrayOf(4, 4, 1, 3)
    println(birthdayCakeCandles(data))
}

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    candles.sort()
    var total = 0
    candles.forEach {
        if (it == candles.last())
            total += 1
    }
    return total
}