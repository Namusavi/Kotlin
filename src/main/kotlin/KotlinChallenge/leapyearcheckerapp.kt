package KotlinChallenge

import java.time.Year

fun main(args: Array<String>) {

    println("Enter Year")
    var year = readLine()!!.toInt()

    val leap = if (year % 4 == 0){
        if (year % 100 == 0) {
            year % 400 == 0
        } else true
    } else false;

    println("$year is ${if (leap) "Leap Year" 
     else
         
    "Not a Leap Year"}")
}

