import java.util.*;

class CodeChef{
 public static void main (String[] args) throws java.lang.Exception
	{
Scanner sc= new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int x=sc.nextInt();
int y=sc.nextInt();
int z=sc.nextInt();
 if(x+y==z){
 System.out.println("yes");
 }
 else if(x+z==y){
  System.out.println("yes");
 }else if(z+y==x){
  System.out.println("yes");
 }else{
 System.out.println("no");
 }
}
}
}
