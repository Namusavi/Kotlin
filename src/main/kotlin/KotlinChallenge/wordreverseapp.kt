package KotlinChallenge

fun main(args: Array<String>) {
    println("Enter any words")
    var words = readLine() ?:""

    var wordsplit  = words.split("")
    var wordsreverse  = wordsplit.reversed()


   println(wordsreverse.joinToString(""))


}

