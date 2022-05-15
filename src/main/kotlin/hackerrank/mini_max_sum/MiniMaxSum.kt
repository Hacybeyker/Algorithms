package hackerrank.mini_max_sum

fun main() {
    val data = arrayOf(769082435L, 210437958L, 673982045L, 375809214L, 380564127L)
    miniMaxSum(data)
}

fun miniMaxSum(arr: Array<Long>): Unit {
    // Write your code here
    var value = 0L
    //step 1 sort
    arr.sort()
    //step 2 calculate
    arr.forEach {
        value += it
    }
    println("${value-arr.last()} ${value-arr.first()}")
}

//Input                                                 Output
/*==========================================================================*/
//1 2 3 4 5                                             10 14
//7 69 2 221 8974                                       299 9271
//769082435 210437958 673982045 375809214 380564127     1640793344 2199437821