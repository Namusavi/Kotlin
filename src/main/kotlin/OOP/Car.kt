package OOP

class Car(make:String, model:String, price:Int) {

    init {

        println("$make $model costs $price")

    }

}

fun main(args: Array<String>) {

    var owner1 = Car("Toyota","Vitz",450000)
    var owner2 = Car("BMW","M4",4500000)
    var owner3 = Car("Subaru","Impreza",3450000)
    var owner4 = Car("VW","Amarock",6450000)}
