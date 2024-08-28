fun AddEven(a:Int):Int{
    if(a==0){
        return 0
    }
    if(a%2==0){
        return a + AddEven(a-2)
    }
    else{
        val b = a -1
        return b + AddEven(b-2)
    }
}
fun main(){
    var a = AddEven(7)
    println(a)
}