import java.util.*;
class MissingNumber{
    public static void main(String[]  args){
 Scanner sc=new Scanner(System.in);
 long n = sc.nextLong();
 long s=0;
 for(int i=1;i<n;i++){
     long a=sc.nextLong();
      s+=a;
 }
System.out.println((n*(n+1)/2)-s);
    }
}
