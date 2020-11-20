import java.util.*;
class Codechef{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int count=0;
int m=t+1;
while(m-->0){
String s =sc.nextLine();
if(s.contains("ch"))
count++;
else if(s.contains("he"))
count++;
else if(s.contains("ef"))
count++;
else if(s.contains("che"))
count++;
else if(s.contains("hef"))
count++;
else if(s.contains("chef"))
count++;
}
System.out.println(count);
}
}
