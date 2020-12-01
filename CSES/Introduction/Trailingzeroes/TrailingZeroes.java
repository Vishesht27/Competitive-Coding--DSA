import java.util.*;
class Tralingzeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int ans = 0;
    for (int x = 5; x <= n; x *= 5){
        ans += (n/x);
    }
System.out.println(ans);

}
}
