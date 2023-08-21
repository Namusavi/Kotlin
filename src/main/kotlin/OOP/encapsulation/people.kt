package OOP.encapsulation
//offering protection of data to the outside world


class people(private val  name:String, private  val age:Int) {

    fun getPersoninfo() : String{
        return "Name: $name, Age:$age"
    }
}

fun main(args: Array<String>) {
    val person1 = people("Don", 21)

    println(person1.getPersoninfo())

}