package KotlinChallenge

fun main(args: Array<String>) {
    val str = "The opps be Lurking everywhere."
    val ch = 'e'
    var frequency = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]) {
            ++frequency
        }
        }


    println("Frequency of $ch = $frequency")
}