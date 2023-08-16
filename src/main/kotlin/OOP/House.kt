package OOP

class House(type:String, location:String, rooms:Int, price:Int) {

    init {

        println("$type $location $rooms cost $price")

    }
}

fun main(args: Array<String>) {

    var owner1 = House("Apartment", "Kiambu",3, 2400000 )
    var owner2 = House("Bungalow", "Mombasa",5, 6700000)
    var owner3 = House("Mansion", "Kajiado",8, 9500000)
    var owner4 = House("Single room", "Nakuru",1, 7500)


}