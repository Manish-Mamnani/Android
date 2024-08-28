class Person(var name: String, var age: Int) {
    fun displayInfo() {
        println("Name: "+name+", "+"Age: $age")
    }
}

fun main() {
    var person1 = Person("Alice", 25)

    var person2 = Person("Bob", 30)

    person1.displayInfo()
    person2.displayInfo()
}
