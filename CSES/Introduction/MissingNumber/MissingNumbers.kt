import java.util.*;
fun main(){
    var sc= Scanner(System.`in`)
    var n=sc.nextLong()
    var s:Long=0;
    for(i in 1..n){
    var a=sc.nextLong()
        s+=a

    }
    println((n*(n+1)/2)-s)
    }
