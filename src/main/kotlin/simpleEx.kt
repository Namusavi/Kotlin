import java.util.Calendar

fun main(args: Array<String>) {
    print("Enter year born")
    var birthyear = readLine()!!.toInt()

    var currentYear = Calendar.getInstance().get(Calendar.YEAR)
    var age = currentYear - birthyear
    println("You are $age years old")

}