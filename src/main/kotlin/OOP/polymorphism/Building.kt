package OOP.polymorphism

open class Building(val type: String) {
    open fun openDoor() {
        println("$type door is opening")
    }
}



//sub class
class House(type: String) : Building(type) {
    override fun openDoor() {


        println("$type house door is opening")
    }
}

class Apartment(type: String) : Building(type) {
   override  fun openDoor(){
        println("$type apartment door is opening")
    }

}

class block(type: String) : Building(type) {
    override  fun openDoor(){
        println("$type block door is opening")
    }

}

fun main(args: Array<String>) {
    var building1: Building = House("The Bedsitter")
    building1.openDoor()


var building2:Building = Apartment("Studio")
    building2.openDoor()
 var building3: Building = block("Office")
     building3.openDoor()
}