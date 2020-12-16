import java.util.*;
public class dawidcandies{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a+b == c+d || a+c == b+d || a+d == b+c || a+b+c == d || a+c+d == b || a+b+d == c || b+c+d == a){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
