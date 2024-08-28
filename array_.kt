fun main(){
    var a=arrayOf(1,2,3,4,5,6,7,8,9,10)


    var sum=0;
    var add=0;
    for(i in a.indices){
        if(a[i]%2==0){
            sum+=a[i];
        }
        if(a[i]%2!=0){
            add+=a[i];
        }

    }
    println( " and sum of even number is : "+sum)
    println( " and sum of odd number is : "+add)
}