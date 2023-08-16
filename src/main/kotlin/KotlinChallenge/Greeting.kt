package KotlinChallenge

import OOP.Dog

fun main(args: Array<String>) {
    println("Enter your name")
    var name:String = readLine()!!.toString()

    if (name.isBlank() ){
        println("Please enter a valid name")
    }else{
        println("Welcome $name")
    }

}