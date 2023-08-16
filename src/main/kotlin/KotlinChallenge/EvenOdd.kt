package KotlinChallenge

fun main(args: Array<String>) {

 println("Enter any number")
 var num: Int = readLine()!!.toInt()
 var a = 2
 if (num % a == 0) {
  println("Its an Even number")
 } else
  println("Its an Odd number")
}
