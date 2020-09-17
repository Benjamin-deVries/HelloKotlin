import java.util.*

fun main() {
    var people: MutableList<Person> = mutableListOf()
    people.add(Person("Ben", "deVries"))
    people.add(Person("William", "Samas"))
    people.add(Person("Seth", "Doran"))
    people.add(Person("Sam", "Hanson"))
    people.add(Person("David", "Fryc"))

    var employees: MutableList<Employee> = mutableListOf()
    for (person in people){
        employees.add(Employee(person, Random().nextInt(999999)))
    }

    for (employee in employees){
        employee.printInfo()
    }

}

open class Person{
    var firstName: String = ""
    var lastName: String = ""
    var mInitial: String = ""


    constructor(_firstName: String, _lastName: String, _mInitial: String){
        firstName = _firstName
        lastName = _lastName
        mInitial = _mInitial
    }
    constructor(firstName: String, lastName: String): this(firstName, lastName, ""){}

    open fun printInfo(){
        println("Hello, my name is: $firstName $lastName")
        println(if (mInitial != "") "And my middle initial is $mInitial" else "And i dont have a middle initial")
    }

}

class Employee: Person{
    var SSN: Int = 0 // note should be '0' padded to 9 digits and thus should probably be a string
    var empNumber: UUID = UUID(50, 50)

    constructor(_firstName: String, _lastName: String, _mInitial: String, _SSN: Int): super(_firstName, _lastName, _mInitial){
        SSN = _SSN
    }
    constructor(_firstName: String, _lastName: String, _SSN: Int): super(_firstName, _lastName){
        SSN = _SSN
    }
    constructor(_person: Person, _SSN: Int): super(_person.firstName, _person.lastName, _person.mInitial){
        SSN = _SSN
    }

    override fun printInfo(){
        println("Employee Info:")
        super.printInfo()
        println("My SSN is: $SSN")
        println("And my employee number is: $empNumber")
    }


}