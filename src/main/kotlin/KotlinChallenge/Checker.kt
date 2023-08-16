package KotlinChallenge

fun main(args: Array<String>) {

    println("Enter an Alphabet:")
    val letter = readLine()


    val charToCheck = letter!!.toCharArray()[0]

    val result = if (
        (charToCheck == 'a')
        || (charToCheck == 'e')
        || (charToCheck == 'i')
        || (charToCheck == 'o')
        || (charToCheck == 'u')
        || (charToCheck == 'A')
        || (charToCheck == 'E')
        || (charToCheck == 'I')
        || (charToCheck == 'O')
        || (charToCheck == 'U')
    )
        "Vowel"
    else
        "Consonant"

    println("Character ($charToCheck) is $result")




}