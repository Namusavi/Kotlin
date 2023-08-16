package KotlinChallenge

fun main(args: Array<String>) {

    println("Enter an Alphabet:")
    val letter = readLine()!!.toString().trim()
if (letter.isBlank()) {
    println("Empty submission try again")
}else{
    var chara =letter[0]
}

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