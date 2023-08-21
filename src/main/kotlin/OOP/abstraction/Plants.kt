package OOP.abstraction

abstract class Plants (val name:String){

    abstract fun produce()

    fun describe (){
        println("$name is an Exotic Species")
    }
}
class Flower(name:String) :Plants(name) {
    override fun produce() {
        println("$name produces rare flower species")
    }
}
class  Fruit(name:String) :Plants(name){
    override fun produce() {
        println("$name produces rare  exotic fruits")
    }
}

fun main(args: Array<String>) {

   var plant1:Plants = Flower("Dafodils")
   var plant2:Plants = Fruit("Persimmons")


    plant1.describe()
    plant1.produce()


    plant2.describe()
    plant2.produce()



}