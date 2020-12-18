import java.util.*;
class Gsalary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        double s=sc.nextDouble();
        if(s<1500){
         s=s*2;
        }else{
            s=s+(0.98*s)+500;
        }
        System.out.println(s);
        }
    }
}
