import java.util.*;
class Codechef{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
if(0<r && r<51){
System.out.println("100");
}else if(r==51){
System.out.println("50");
}else if(r>51 && r<100){
System.out.println("50");
}else if(r==100){
System.out.println("50");
}
else{
System.out.println("0");
}
}
}
