package OOP.abstraction

 abstract class seacreatures(val name:String) {
      //abstract method
     abstract fun makesound()

     //general method
     fun describe() {
         print("$name is a sea creature")
     }
}
//subclass of a sea creature

class Fish(name:String) :seacreatures(name){
    override fun makesound() {
        println("$name makes  a blup blup sound")
    }
}

//another sub class
class Whale(name:String) :seacreatures(name){
    override fun makesound() {
        println("$name makes  a deep underwater noise")
    }
}


fun main(args: Array<String>) {

    var creature1:seacreatures = Fish("Nemo")
    var creature2:seacreatures = Whale("Octavia")

    creature1.describe()
    creature1.makesound()

    creature2.describe()
    creature2.makesound()

}
