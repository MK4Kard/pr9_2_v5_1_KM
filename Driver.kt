package MotorDep

open class Driver(var surname: String, var flight: Int, var auto: Int) {
    open fun Info(){
        println("Водитель ${surname} назначен на рейс №${flight}" +
                "с автомобилем №${auto}")
    }
}