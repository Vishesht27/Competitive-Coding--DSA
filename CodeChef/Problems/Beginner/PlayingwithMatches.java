import java.util.*;
class codechef{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t = sc.nextInt();
while(t-->0){
long a=sc.nextLong();
long b=sc.nextLong();
long n[] = new long[10];
		     n[0]=6;
		     n[1] = 2;
		     n[2] = 5;
		     n[3] = 5;
		     n[4] = 4;
		     n[5] = 5;
		     n[6] = 6;
		     n[7] = 3;
		     n[8] = 7;
		     n[9] = 6;
long sum=a+b;
long count=0;
while(sum>0){
int rem=(int)sum%10;
count=count+n[rem];
sum/=10;
}
System.out.println(count);
}
}
}
