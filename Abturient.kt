package EntranceExams

open class Abturient(var faculty: String, var surname: String) {
    open fun Info(){
        println("Абитуриент ${surname} поступает на факультет ${faculty}")
    }
}
