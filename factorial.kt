fun factorial(n:Int):Int{
    if(n==0 || n==1){
        return 1
    }
    var a = n*factorial(n-1)
    return a
}
fun main(){
    var a = factorial(5)
    println(a)
}