import java.util.*;
fun main(){
    var sc=Scanner(System.`in`)
    var n=sc.nextLong()
    print("$n ")
    while(n>1){
        if(n%2==0L){
        n/=2
        }else{
            n=3*n+1
        }
        print("$n ")
    }

}
