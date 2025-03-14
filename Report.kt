package MotorDep

class Report(var stateFlight: String, var stateAuto: String, mdSurname: String, mdFlight: Int, mdAuto: Int) : Driver(mdSurname, mdFlight, mdAuto){
    private var repair: String = "нет"
    public fun Repair(repair: String){
        if (repair == "да"){
            this.repair = repair
        }
        else if (repair == "нет"){
            this.repair = repair
        }
    }
    public fun Mark(){
        println("Водитель ${surname}" +
                "состояние рейса №${flight} : ${stateFlight}" +
                "состояние автомобиля №${auto} : ${stateAuto}")
        if (repair == "да"){
            println("требуется ремонт")
        }
        else {
            println("ремонт не требуется")
        }
    }
}