package MotorDep

open class Dispatcher(var surname: String, var flight: Int, var auto: Int) {
    open fun Info(){
        println("Диспетчер ${surname} поставил водителя на рейс №${flight}" +
                "и назначил автомобиль под №${auto}")
    }
}