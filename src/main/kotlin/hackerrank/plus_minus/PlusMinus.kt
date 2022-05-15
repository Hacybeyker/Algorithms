package hackerrank.plus_minus

fun main() {
    val data = arrayOf(-4, 3, -9, 0, 4, 1)
    plusMinus(data)
}

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val algo = arrayOf(0, 0, 0)
    arr.forEach { number ->
        if (number > 0) algo[0] = algo[0].plus(1)
        if (number < 0) algo[1] = algo[1].plus(1)
        if (number == 0) algo[2] = algo[2].plus(1)
    }
    val size = arr.size
    algo.forEach { number ->
        println("${number.toDouble() / size}")
    }
}


/*
8
1 2 3 -1 -2 -3 0 0
0.375000
0.375000
0.250000

6
-4 3 -9 0 4 1
0.500000
0.333333
0.166667
 */