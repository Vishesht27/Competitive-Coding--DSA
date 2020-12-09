import java.util.*;
class codechef{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextInt();
double b=sc.nextInt();
double c=sc.nextInt();
double x1=(((-b)+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
double x2=(((-b)-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
System.out.println(x1);
System.out.println(x2);
}
}
