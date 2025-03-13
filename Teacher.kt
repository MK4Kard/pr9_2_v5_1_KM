package EntranceExams

open class Teacher(var faculty: String, var surname: String) {
    open fun Info(){
        println("Преподаватель ${surname} с факультета ${faculty}")
    }
}