import java.util.*;
class Codechef{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int[]arr= new int[n];
int flag=1;
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
if(arr[i]%2==0){
flag=0;
}
}
if(flag==0){
System.out.println("NO");
}else{
System.out.println("YES");
}
}
}
}
