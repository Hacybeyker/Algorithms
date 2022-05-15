package hackerrank.a_very_big_sum

import kotlin.math.pow

fun main() {
    val data: Array<Long> = arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)
    println(aVeryBigSum(data))
}

fun aVeryBigSum(ar: Array<Long>): Long {
    // Write your code here
    var result: Long = 0
    val max: Int = (10.0.pow(10)).toInt()
    for (i in ar.indices) {
        if (ar[i] in 0..max)
            result += ar[i]
    }
    return result
}