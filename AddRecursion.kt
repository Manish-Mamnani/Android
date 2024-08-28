fun Add(a:Int):Int{
    if(a==1){
        return 1
    }
    return a + Add(a-1)
}
fun main(){
    var a = Add(4)
    println(a)
}