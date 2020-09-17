import java.lang.IllegalArgumentException

fun main(){
    //println(testingRecurssion(100))
    val myPerson: Person = Person("a", "b", "c")
    val myPerson2: Person = Person("a", "b")
}

fun testingRecurssion(value: Int) : Int{
    if (value != 1){
        return testingRecurssion(value - 1) * value
    }
    //throw IllegalArgumentException("Cause i said so")
    return value
}