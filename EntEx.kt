import EntranceExams.Exam as Exam
import EntranceExams.Abturient as AbturientExam
import EntranceExams.Teacher as TeacherExam
fun main(){
    var Petrov = Exam(14, "июля", "истории", "Петров")
    println("Введите количество экзаменов")
    Petrov.SetCount(readln()!!.toInt())
}