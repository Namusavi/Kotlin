fun main(args: Array<String>) {

    println("Enter First number")
    var num1:Int = readLine()!!.toInt()
    println("Enter Second number")

    var num2:Int = readLine()!!.toInt()

    for (x in num1..num2)
        if ( x % 5 == 0 || x % 3 == 0) {
            println("$x is FizzBuzz")
        }

        else if( x % 5 == 1) {
            println("$x is Buzz")
        }

        else if( x % 3 == 2){
            println("$x is Fizz")
        }

        else {
            println(x)
        }

}

