package EntranceExams

class Exam(var date: Int, var month: String, eeFaculty: String, eeSurname: String) : Abturient(eeFaculty, eeSurname) {
    private var countEx: Int = 1
    public fun GetCount(): Int {
        return countEx
    }
    public fun SetCount(count : Int){
        if (count < 1){
            return println("Минимум должно быть 1 экзамен")
        }
        else if (count > 4){
            return println("Максимум должно быть 4 экзамена")
        }
        else {
            this.countEx = count
        }
    }
    override fun Info(){
        if (date < 1 && date > 28){
            println("введены неверные данные")
        }
        else {
            println("Абитуриент ${surname} сдал ${countEx} экзамена ${date} ${month}")
            println("для поступления на факультет по ${faculty}")
        }
    }
}