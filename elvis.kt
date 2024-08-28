fun main(){
    var str1: String?=null
    var str2: String?="may be"
    var len1: Int = str1 ?.length ?:-1;
    var len2: Int = str2 ?.length ?:-1;
    println(len1)
    println(len2)
    var choice = 3
    val result = when (choice){
        1-> {
            "hello"
        }
        2->"world"
        else->"invalid"
    }
    println(result)
}