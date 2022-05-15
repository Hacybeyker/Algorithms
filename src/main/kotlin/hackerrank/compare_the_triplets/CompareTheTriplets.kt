package hackerrank.compare_the_triplets

fun main() {
    val aliceData = arrayOf(5, 6, 7)
    val bobData = arrayOf(3, 6, 10)
    println(compareTriplets(aliceData, bobData).toList())
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    // Write your code here
    var alice: Int = 0
    var bob: Int = 0
    for (i in a.indices) {
        if (a[i] >= 1 && a[i] <= 100 && b[i] >= 1 && b[i] <= 100) {
            if (a[i] > b[i]) {
                alice += 1
            }
            if (a[i] < b[i]) {
                bob += 1
            }
        }
    }
    return arrayOf(alice, bob)
}