fun main(){
    //given a string"Codehive"create a function that prints out a string composed of the 5th,6th,7th and 8th character
    school("Akirachix")
}
fun school(name:String):String{
    var location = "Akirachix"
    var char =location[4]
    var char1 =location[5]
    var char2 =location[6]
    var char3 =location[7]
    var result = "$char$char1$char2$char3"
    println(result)
    return result


}