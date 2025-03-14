import EntranceExams.Exam as Exam
import EntranceExams.Grade as GradeExam
import EntranceExams.Abturient as AbturientExam
import EntranceExams.Teacher as TeacherExam
fun main(){
    var Petrov = Exam(14, "истории", "Петров")
    println("Введите количество экзаменов")
    Petrov.SetCount(readln()!!.toInt())
    Petrov.Info()
    println("Введите сколько баллов набрал абитуриент")
    var Ivanov = GradeExam(0, 100, "истории", "Иванов")
    Ivanov.point = readln()!!.toInt()
    Ivanov.Aver()
    Ivanov.Info()
    Ivanov.Conc()
}
