import java.util.Scanner
fun main(){
    var a: Int
    var b: Boolean
    var sc = Scanner(System.`in`)
    print("Enter the total amount: ")
    a = sc.nextInt()
    print("Enter true for membership or else false: ")
    b = sc.nextBoolean()
    if(a>=1000){
        if(b){
            println("You are eligible for 20% discount.")
            println("Total amount after discount: "+(a*0.8))
        }
        else{
            println("You are eligible for 10% discount.")
            println("Total amount after discount: "+(a*0.9))
        }
    }
    else{
        println("No discount for you. Sorry!:)")
    }
}