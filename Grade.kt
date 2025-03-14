package EntranceExams

class Grade(var point: Int, var maxPoint: Int, eeFaculty: String, eeSurname: String) : Teacher(eeFaculty, eeSurname) {
    private var grade: Int = 4
    public fun Aver(){
        if (point < 0 || maxPoint < 0){
            return println("Балл введен неправильно")
        }
        else {
            if (point >= maxPoint*0.8){
                grade = 5
            }
            else if (point >= maxPoint*0.65 && point < maxPoint*0.8){
                grade = 4
            }
            else if (point >= maxPoint*0.4 && point < maxPoint*0.65){
                grade = 3
            }
            else {
                grade = 2
            }
        }
    }
    override fun Info(){
        println("Преподаватель ${surname} с факультета ${faculty}")
        println("поставил абитуриенту оценку ${grade}")
    }
    public fun Conc(){
        if (grade == 2){
            println("Абитуриент не зачислен на факультет ${faculty}")
        }
        else {
            println("Абитуриент зачислен на факультет ${faculty}")
        }
    }
}
