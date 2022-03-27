fun main(){
    var motor=Car("subaru","outback", "red",8)
    motor.carry(4)
    motor.carry(10)
    motor.identity()
    motor.calculateParkingFees(5)

    var mini=Bus("toyota", "minibus", "silver", 25)
    mini.maxTripFare(26.4)
    mini.calculatingFees(9)
}
open class Car(var make:String, var model:String, var color:String, var capacity:Int){
fun carry(people: Int){
    var me =people
    println("carrying $people capacity")

    if (people<=capacity){
        println("carry $people passengers")
    }
    else
        println("overcarrying by $me")

}
    fun identity(){
        println("i am a $color $make $model")
    }
   fun calculateParkingFees(hours:Int): Int{
        var parkingFees= 20
        var me=parkingFees * hours
        println(me)
        return me
    }
}
class Bus (var make:String, var model:String, var color:String, var capacity:Int){
    fun maxTripFare(fare: Double): Double{
    var maximum=15
        var total=maximum* fare
        println(total)
        return total

}
    fun calculatingFees(hours:Int): Int{
        var product=hours * capacity
        println(product)
        return product


    }



    }












//Create a class Car with the following attributes: make, model, color, capacity.