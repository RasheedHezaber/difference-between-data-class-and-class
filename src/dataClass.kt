class Student1(name:String,age:Int){



}
data class Student2(val name: String, val age: Int)

fun main() {
    val stu = Student2("Chaitanya", 31)
    val stu2 = Student2("Ajeet", 30)
    println(stu)
    println(stu.equals(stu2))

    val stu3=Student2("RASHEED",25)
    var stu4=Student2("RASHEED",25)
    val stu5=Student2("ALAA",32)
    println(stu3)

    println(stu3.equals(stu4))
    println(stu3.copy())
//printing all the details of the data class
    println(stu.toString());


}