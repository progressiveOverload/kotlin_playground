/*
//Publicly available variable
var namez="Top level variables"
var name:String="Not Null"
//for nullification
val nema:String?=null
//val is not immutable, variable is the way if it's changeable
val greeting=null
fun returnString(): String {

    return "Hello Kotlin"

}
fun sayHello(){
    return println(returnString()+" This is another function")
}
fun getGreet()="Hi Kotlin"
fun main() {
    println(getGreet())
println(returnString())
    sayHello()
 val nema ="Cup"
    println(namez)
    println(nema)
    println("danke mein gott")
/*
    if (greeting==null){
        println("This is null")
        println("So we init value")
        val greeting="Hello"
        println(greeting)
    }
    */

    //case switch yapısı
    when(greeting){
        null-> println("greeting is null ")
        else -> println(greeting)
    }


    val greetingToPrint =if (greeting!=null) greeting else "Hi"
    val greetingToPrint2 =when (greeting) {null-> "hi" else->"hi again"}
    println(greetingToPrint)
    println(greetingToPrint2)
    }

*/


fun sayHello(itemToGreet:String){
    val msg= "Hello $itemToGreet"
    println(msg)

}
fun sayHello2(itemToGreet:String,greeting:String)=  println("$greeting $itemToGreet")



fun greetPerson(greeting: String="Hello",name:String="Kotlin"){
    println("$greeting $name")
}
fun main(){
    sayHello("hoo")
sayHello2("Benzoite","Hello,")

    val interestingThings= arrayOf("Reason","To","Give","Up")
    println(interestingThings.size)
    //length is size
    println(interestingThings[0])


    for (thing in interestingThings){
        println(thing)
    }
   interestingThings.forEach {interesante ->
   println(interesante)}


    interestingThings.forEachIndexed{
        index, s -> println("$s is at index $index")
    }

    val moreInterestingthinsg= listOf("More","Reason","To","Give","Up")
    moreInterestingthinsg.forEach{
        moreInterestingthin ->
        println(moreInterestingthin)
    }

    //creating maps
    val mapz= mutableMapOf(1 to "a",2 to "b",3 to "c")
    println(mapz)
    mapz.forEach{ (key, value) -> println("$key,$value")}

    //by default collections are immutable
//assign mutable keyword when creating collections if you want them to change
    mapz[4] = "trying"
    println(mapz)


    fun sayHelloz(greeting: String,itemzToGreet:List<String>){
        itemzToGreet.forEach{
            itemToGreet ->
            println("$greeting $itemToGreet")
        }
    }
    val toGreet= listOf("Astra","Con")
    sayHelloz("Wilkommen",toGreet)

    greetPerson(greeting = "Wassup", name = "back once again")
greetPerson()
}

//vararg,?


/*fun sayHelloz(greeting: String,vararg itemToGreet: String){
    itemToGreet.forEach{
            itemToGreet ->
        println("$greeting $itemToGreet")
    }
}
*/
//function with default params

//There is some usage of maps with* didn't understand that

//Classes