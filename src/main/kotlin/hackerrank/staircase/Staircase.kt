package hackerrank.staircase

fun main() {
    staircase(4)
}

private fun generateSpace(count: Int): String {
    val spaces = StringBuilder()
    for (i in 1..count) {
        spaces.append(" ")
    }
    return spaces.toString()
}

private fun generateMichi(count: Int): String {
    val michi = StringBuilder()
    for (i in 1..count) {
        michi.append("#")
    }
    return michi.toString()
}

fun staircase(n: Int): Unit {
    // Write your code here
    for (i in n - 1 downTo 0) {
        if (n == (n - i))
            println(generateMichi(n))
        else
            println("${generateSpace(i)}${generateMichi(n - i)}")
    }
}


/*
4
   #
  ##
 ###
####


6
     #
    ##
   ###
  ####
 #####
######

* */