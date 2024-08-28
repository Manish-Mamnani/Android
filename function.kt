fun sum(a:Int,b:Int):Int{
    val c = a + b
    return c
}
var count =0
fun rec(){
    count++
    if(count<=5){
        println("Hello"+count)
        rec()
    }
}
fun main(){
    var a = sum(5,6)
    println(a)
    rec()
}