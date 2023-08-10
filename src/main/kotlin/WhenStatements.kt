fun main(args: Array<String>) {

    println("Enter number to Indicate Floor")

    var floor = readLine()!!.toInt()
    when(floor){

       1-> print("Go to first Floor")
       2-> print("Go to second Floor")
       3-> print("Go to third Floor")
       4-> print("Go to fourth Floor")

       else -> print("No Floor after 4th")
    }


}