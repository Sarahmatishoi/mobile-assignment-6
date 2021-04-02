fun main(){
    var vehicle=Car("honda","civic","maroon",4)
    vehicle.carry(6)
    println(vehicle.calculateParkingFees(6))
    vehicle.identity()
    var bus=Bus("bristol","lodekka","blue",80)
    bus.carry(72)
    println(bus.calculateParkingFees())
    bus.identity()
   println(bus.maxTripFare(17000.00))
}
 open class Car (var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int) {
        var x=people-capacity
        if (people <= capacity)
        {
            println("carrying $people passengers")
        }
        else{
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("I am $color $make $model")
    }
     fun calculateParkingFees(hours:Int):Int{
        return hours*20
    }

}
class Bus( make:String, model:String, color:String, capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare:Double):Double{
        return fare
    }
     fun calculateParkingFees():Int{
        return capacity+6

    }

}
