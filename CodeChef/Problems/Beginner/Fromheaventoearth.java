import java.util.*;
class fromheaventoearth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            float n=sc.nextInt();
            float v1=sc.nextInt();
            float v2=sc.nextInt();


                if  (((float)Math.sqrt(2)*n/v1)>((2*n)/v2)){
              System.out.println("Elevator");

            }else{
                System.out.println("Stairs");
            }
        }
        }
}
