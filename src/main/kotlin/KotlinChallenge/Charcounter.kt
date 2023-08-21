package KotlinChallenge

fun CharacterCountOccurrence(userinput:String, chartag:Char): Int{
    var charcount = 0
    for (x in userinput){
       if (x == chartag){
           charcount += 1
       }
    }
    return charcount

}

fun main(args: Array<String>) {
    println("Enter words")
    var datastringinput = readLine()?: ""

    println("Enter words to check for occurrences")
    var mytargetchar = readLine()?.get(0)?: ' '


    var charoccurrence = CharacterCountOccurrence(datastringinput, mytargetchar)
    println("$mytargetchar appears $charoccurrence number of times")



}







