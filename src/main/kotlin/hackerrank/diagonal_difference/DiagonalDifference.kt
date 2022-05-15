package hackerrank.diagonal_difference

import kotlin.math.abs

fun main() {
    val data = arrayOf(
        arrayOf(11, 2, 4),
        arrayOf(4, 5, 6),
        arrayOf(10, 8, -12)
    )
    data.forEachIndexed { _, fila ->
        fila.forEachIndexed { _, column ->
            print(column)
            print(",")
        }
        println("")
    }
    println(diagonalDifference(data))
}

//Time complexity : O(n)
fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var resultA = 0
    var resultB = 0
    for (i in arr.indices) {
        resultA += arr[i][i]
        resultB += arr[i][arr.size - i - 1]
    }
    return abs(resultA - resultB)
}

//Time complexity: O(n*n)
/*fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var resultA = 0
    var resultB = 0
    for(i in arr.indices){
        for (j in arr.indices){
            val number = arr[i][j]
            if (number >= -100 && number <= 100) {
                if (i == j)
                    resultA += number
                if (i == arr.size - j -1)
                    resultB += number
            }
        }
    }
    return abs(resultA - resultB)
}*/


/**
Data
====
3
11,2,4,
4,5,6,
10,8,-12,
Result
======
15


4
-1 1 -7 -8
-10 -8 -5 -2
0 9 7 -1
4 4 -2 1
1
 **/