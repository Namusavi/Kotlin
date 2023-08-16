package OOP

open class Animal(color:String, legs:String, breed:String, gender:String) {
    init {
        println("color is $color and it has $legs of $breed and its a $gender")
    }
}

    class Dog(name:String) :Animal(color ="black", legs ="four", breed ="rottweiler", gender ="male"){

}

    fun nameofdog(){
       // println("color is $color and it has $legs of $breed and its a $gender")

}



fun main(args: Array<String>) {
    var dog1= Dog("Bosco")

}



