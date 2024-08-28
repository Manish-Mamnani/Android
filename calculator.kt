import java.util.Scanner
fun main(){
    var sc = Scanner(System.`in`)
    print("Enter 1st number: ")
    var a = sc.nextInt()
    print("Enter 2nd number: ")
    var b = sc.nextInt()
    sc.nextLine()
    print("Enter operation you want to perform (like +,- etc): ")
    var choice = sc.nextLine()
    when(choice) {
        "+" -> {
            println("Addition: " + (a + b))
        }

        "-" -> {
            println("Subtraction: " + (a - b))
        }

        "*" -> {
            println("Multiplication: " + (a * b))
        }

        "/" -> {
            println("Division: " + (a / b))
        }

        else -> println("Invalid choice")
    }
}
